#!/bin/bash

# Load the current version from gradle.properties
CURRENT_VERSION=$(grep "versionProp=" gradle.properties | cut -d'=' -f2)

# Parse version into major, minor, and patch components
IFS='.' read -r -a VERSION_PARTS <<< "$CURRENT_VERSION"

# Get the latest commit message
LATEST_COMMIT=$(git log -1 --pretty=%B)

# Determine version bump based on the commit message
if [[ "$LATEST_COMMIT" == *"BREAKING CHANGE"* ]] || [[ "$LATEST_COMMIT" == "feat!"* ]] || [[ "$LATEST_COMMIT" == "fix!"* ]]; then
  # Increment major version for breaking changes
  VERSION_PARTS[0]=$((VERSION_PARTS[0]+1))
  VERSION_PARTS[1]=0
  VERSION_PARTS[2]=0
elif [[ "$LATEST_COMMIT" == "feat"* ]]; then
  # Increment minor version for features
  VERSION_PARTS[1]=$((VERSION_PARTS[1]+1))
  VERSION_PARTS[2]=0
else
  # Increment patch version for fixes and other changes
  VERSION_PARTS[2]=$((VERSION_PARTS[2]+1))
fi

# Construct the new version
NEW_VERSION="${VERSION_PARTS[0]}.${VERSION_PARTS[1]}.${VERSION_PARTS[2]}"

# Update the version in gradle.properties
sed -i "s/version=$CURRENT_VERSION/version=$NEW_VERSION/" gradle.properties

# Commit and tag the new version
git config user.name "github-actions[bot]"
git config user.email "github-actions[bot]@users.noreply.github.com"
git commit -am "chore(release): $NEW_VERSION"
git tag "v$NEW_VERSION"

# Push changes and tags
git push origin main --tags

# Create a GitHub release
curl -s -X POST https://api.github.com/repos/${{ github.repository }}/releases \
  -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/json" \
  -d "{\"tag_name\": \"v$NEW_VERSION\", \"name\": \"v$NEW_VERSION\", \"body\": \"Release $NEW_VERSION\"}"
