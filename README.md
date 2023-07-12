# spring-grpc
Spring boot that demonstrates gRPC communication between different services


We have 2 microservices here built around BFF pattern. The aggregator service will act as a BFF service interacting
directly with the Client over HTTP. The aggregator service will interact with calculator service using gRPC.

We have a multi-module spring boot app which uses gradle as build tool
1.  calculator-proto
    It contains the protocol buffers file (.proto)
2.  calculator-service
    It is the gRPC Spring Boot server which contains business logic
3.  aggregator-service
    It is the backend-for-frontend (BFF).Exposes REST for outside client. Internal calls will be using gRPC.