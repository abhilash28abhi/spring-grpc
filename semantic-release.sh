#!/bin/bash

set -e  # Stop execution on error
# set -x  # Enable debugging (uncomment for debugging)

# Load the current version from gradle.properties
CURRENT_VERSION=$(grep "versionProp=" gradle.properties | cut -d'=' -f2)
# echo "Current Version: $CURRENT_VERSION"

# Parse version into major, minor, and patch components
IFS='.' read -r -a VERSION_PARTS <<< "$CURRENT_VERSION"

# Function to get the latest non-merge commit message
function get_latest_commit() {
  # Get the last few commit messages
    commit_messages=$(git log --pretty=%B -n 5)
    echo "Recent Commit Messages:"
    echo "$commit_messages"

    # Get the latest commit message
    LATEST_COMMIT=$(git log --pretty=%B -n 1)
    # Debug: print the latest commit message
    echo "Latest Commit: $LATEST_COMMIT"

    # Check if the latest commit is a merge commit
    while [[ "$LATEST_COMMIT" == "Merge"* ]]; do
      # Get the previous commit message
      LATEST_COMMIT=$(git log --pretty=%B -n 2 | tail -n 1)
      echo "Latest Commit after checking for merge: $LATEST_COMMIT"

      # Break if we have gone through a set number of commits (to prevent infinite loop)
      if [[ -z "$LATEST_COMMIT" ]]; then
        echo "No valid commit message found. Exiting."
        exit 1
      fi
    done

    # Return the latest valid commit message
    echo "$LATEST_COMMIT"
}

# Get the latest valid commit message
LATEST_COMMIT=get_latest_commit

# Convert the latest commit message to lower case for case insensitive matching
LATEST_COMMIT_LOWER=$(echo "$LATEST_COMMIT" | tr '[:upper:]' '[:lower:]')
# echo "Latest Commit (Lower): $LATEST_COMMIT_LOWER"  # Debug: Show latest commit in lowercase

# Determine version bump based on the commit message
if [[ "$LATEST_COMMIT_LOWER" == *"breaking change"* ]]; then
  VERSION_PARTS[0]=$((VERSION_PARTS[0]+1))
  VERSION_PARTS[1]=0
  VERSION_PARTS[2]=0
  # echo "Major version incremented."
elif [[ "$LATEST_COMMIT_LOWER" == "feat"* ]]; then
  VERSION_PARTS[1]=$((VERSION_PARTS[1]+1))
  VERSION_PARTS[2]=0
  # echo "Minor version incremented."
elif [[ "$LATEST_COMMIT_LOWER" == "fix"* ]]; then
  VERSION_PARTS[2]=$((VERSION_PARTS[2]+1))
  # echo "Patch version incremented."
else
  echo "No valid commit message found. Please use Angular commit message conventions."
  exit 1  # Exit the script if no valid commit message is present
fi

# Construct the new version
NEW_VERSION="${VERSION_PARTS[0]}.${VERSION_PARTS[1]}.${VERSION_PARTS[2]}"
# echo "New Version: $NEW_VERSION"

# Update the version in gradle.properties
sed -i "s/versionProp=$CURRENT_VERSION/versionProp=$NEW_VERSION/" gradle.properties

# Generate changelog from commit messages
if git rev-parse --quiet --verify refs/tags/* > /dev/null; then
  # If there are tags, generate changelog from the latest tag to HEAD
  CHANGELOG=$(git log $(git describe --tags --abbrev=0)..HEAD --pretty=format:"* %s" | sed '/^$/d')
else
  # If no tags exist, generate changelog from the beginning to HEAD
  CHANGELOG=$(git log --pretty=format:"* %s" | sed '/^$/d')
fi

if [ -z "$CHANGELOG" ]; then
  CHANGELOG="No changes."
fi
echo "Changelog: $CHANGELOG"  # Debug: Show changelog

# Commit and tag the new version
git config user.name "github-actions[bot]"
git config user.email "github-actions[bot]@users.noreply.github.com"
git commit -am "chore(release): $NEW_VERSION"
# echo "Committed new version."
git tag "v$NEW_VERSION"

# Push changes and tags
git push origin main --tags
# echo "Pushed changes and tags."

# Create a GitHub release with release notes
curl -s -X POST https://api.github.com/repos/${GITHUB_REPOSITORY}/releases \
  -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/json" \
  -d "{\"tag_name\": \"v$NEW_VERSION\", \"name\": \"v$NEW_VERSION\", \"body\": \"## Changes\n\n$CHANGELOG\"}"
# echo "GitHub release created."
