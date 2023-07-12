package com.proto.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: calculator.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getFindFactorialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findFactorial",
      requestType = com.proto.generated.Input.class,
      responseType = com.proto.generated.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getFindFactorialMethod() {
    io.grpc.MethodDescriptor<com.proto.generated.Input, com.proto.generated.Output> getFindFactorialMethod;
    if ((getFindFactorialMethod = CalculatorServiceGrpc.getFindFactorialMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindFactorialMethod = CalculatorServiceGrpc.getFindFactorialMethod) == null) {
          CalculatorServiceGrpc.getFindFactorialMethod = getFindFactorialMethod =
              io.grpc.MethodDescriptor.<com.proto.generated.Input, com.proto.generated.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findFactorial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Output.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("findFactorial"))
              .build();
        }
      }
    }
    return getFindFactorialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getGetAllDoublesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllDoubles",
      requestType = com.proto.generated.Input.class,
      responseType = com.proto.generated.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getGetAllDoublesMethod() {
    io.grpc.MethodDescriptor<com.proto.generated.Input, com.proto.generated.Output> getGetAllDoublesMethod;
    if ((getGetAllDoublesMethod = CalculatorServiceGrpc.getGetAllDoublesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGetAllDoublesMethod = CalculatorServiceGrpc.getGetAllDoublesMethod) == null) {
          CalculatorServiceGrpc.getGetAllDoublesMethod = getGetAllDoublesMethod =
              io.grpc.MethodDescriptor.<com.proto.generated.Input, com.proto.generated.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllDoubles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Output.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("getAllDoubles"))
              .build();
        }
      }
    }
    return getGetAllDoublesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getSumAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sumAll",
      requestType = com.proto.generated.Input.class,
      responseType = com.proto.generated.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getSumAllMethod() {
    io.grpc.MethodDescriptor<com.proto.generated.Input, com.proto.generated.Output> getSumAllMethod;
    if ((getSumAllMethod = CalculatorServiceGrpc.getSumAllMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumAllMethod = CalculatorServiceGrpc.getSumAllMethod) == null) {
          CalculatorServiceGrpc.getSumAllMethod = getSumAllMethod =
              io.grpc.MethodDescriptor.<com.proto.generated.Input, com.proto.generated.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sumAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Output.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("sumAll"))
              .build();
        }
      }
    }
    return getSumAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getPlayUpTo100Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "playUpTo100",
      requestType = com.proto.generated.Input.class,
      responseType = com.proto.generated.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.generated.Input,
      com.proto.generated.Output> getPlayUpTo100Method() {
    io.grpc.MethodDescriptor<com.proto.generated.Input, com.proto.generated.Output> getPlayUpTo100Method;
    if ((getPlayUpTo100Method = CalculatorServiceGrpc.getPlayUpTo100Method) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPlayUpTo100Method = CalculatorServiceGrpc.getPlayUpTo100Method) == null) {
          CalculatorServiceGrpc.getPlayUpTo100Method = getPlayUpTo100Method =
              io.grpc.MethodDescriptor.<com.proto.generated.Input, com.proto.generated.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "playUpTo100"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.generated.Output.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("playUpTo100"))
              .build();
        }
      }
    }
    return getPlayUpTo100Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new CalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void findFactorial(com.proto.generated.Input request,
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      asyncUnimplementedUnaryCall(getFindFactorialMethod(), responseObserver);
    }

    /**
     * <pre>
     * server stream
     * </pre>
     */
    public void getAllDoubles(com.proto.generated.Input request,
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllDoublesMethod(), responseObserver);
    }

    /**
     * <pre>
     * client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.generated.Input> sumAll(
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      return asyncUnimplementedStreamingCall(getSumAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.generated.Input> playUpTo100(
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      return asyncUnimplementedStreamingCall(getPlayUpTo100Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindFactorialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.generated.Input,
                com.proto.generated.Output>(
                  this, METHODID_FIND_FACTORIAL)))
          .addMethod(
            getGetAllDoublesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.generated.Input,
                com.proto.generated.Output>(
                  this, METHODID_GET_ALL_DOUBLES)))
          .addMethod(
            getSumAllMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.generated.Input,
                com.proto.generated.Output>(
                  this, METHODID_SUM_ALL)))
          .addMethod(
            getPlayUpTo100Method(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.generated.Input,
                com.proto.generated.Output>(
                  this, METHODID_PLAY_UP_TO100)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractStub<CalculatorServiceStub> {
    private CalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void findFactorial(com.proto.generated.Input request,
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindFactorialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server stream
     * </pre>
     */
    public void getAllDoubles(com.proto.generated.Input request,
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllDoublesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.generated.Input> sumAll(
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSumAllMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bi-directional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.generated.Input> playUpTo100(
        io.grpc.stub.StreamObserver<com.proto.generated.Output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPlayUpTo100Method(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.proto.generated.Output findFactorial(com.proto.generated.Input request) {
      return blockingUnaryCall(
          getChannel(), getFindFactorialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server stream
     * </pre>
     */
    public java.util.Iterator<com.proto.generated.Output> getAllDoubles(
        com.proto.generated.Input request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllDoublesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.generated.Output> findFactorial(
        com.proto.generated.Input request) {
      return futureUnaryCall(
          getChannel().newCall(getFindFactorialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_FACTORIAL = 0;
  private static final int METHODID_GET_ALL_DOUBLES = 1;
  private static final int METHODID_SUM_ALL = 2;
  private static final int METHODID_PLAY_UP_TO100 = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_FACTORIAL:
          serviceImpl.findFactorial((com.proto.generated.Input) request,
              (io.grpc.stub.StreamObserver<com.proto.generated.Output>) responseObserver);
          break;
        case METHODID_GET_ALL_DOUBLES:
          serviceImpl.getAllDoubles((com.proto.generated.Input) request,
              (io.grpc.stub.StreamObserver<com.proto.generated.Output>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sumAll(
              (io.grpc.stub.StreamObserver<com.proto.generated.Output>) responseObserver);
        case METHODID_PLAY_UP_TO100:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.playUpTo100(
              (io.grpc.stub.StreamObserver<com.proto.generated.Output>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.generated.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getFindFactorialMethod())
              .addMethod(getGetAllDoublesMethod())
              .addMethod(getSumAllMethod())
              .addMethod(getPlayUpTo100Method())
              .build();
        }
      }
    }
    return result;
  }
}
