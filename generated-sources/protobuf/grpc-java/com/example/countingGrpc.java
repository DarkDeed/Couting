package com.example;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: counting.proto")
public final class countingGrpc {

  private countingGrpc() {}

  public static final String SERVICE_NAME = "com.example.counting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.Counting.sendNumbers,
      com.example.Counting.responseNumber> getCountingNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countingNumbers",
      requestType = com.example.Counting.sendNumbers.class,
      responseType = com.example.Counting.responseNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.Counting.sendNumbers,
      com.example.Counting.responseNumber> getCountingNumbersMethod() {
    io.grpc.MethodDescriptor<com.example.Counting.sendNumbers, com.example.Counting.responseNumber> getCountingNumbersMethod;
    if ((getCountingNumbersMethod = countingGrpc.getCountingNumbersMethod) == null) {
      synchronized (countingGrpc.class) {
        if ((getCountingNumbersMethod = countingGrpc.getCountingNumbersMethod) == null) {
          countingGrpc.getCountingNumbersMethod = getCountingNumbersMethod =
              io.grpc.MethodDescriptor.<com.example.Counting.sendNumbers, com.example.Counting.responseNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countingNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Counting.sendNumbers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Counting.responseNumber.getDefaultInstance()))
              .setSchemaDescriptor(new countingMethodDescriptorSupplier("countingNumbers"))
              .build();
        }
      }
    }
    return getCountingNumbersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static countingStub newStub(io.grpc.Channel channel) {
    return new countingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static countingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new countingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static countingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new countingFutureStub(channel);
  }

  /**
   */
  public static abstract class countingImplBase implements io.grpc.BindableService {

    /**
     */
    public void countingNumbers(com.example.Counting.sendNumbers request,
        io.grpc.stub.StreamObserver<com.example.Counting.responseNumber> responseObserver) {
      asyncUnimplementedUnaryCall(getCountingNumbersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCountingNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.Counting.sendNumbers,
                com.example.Counting.responseNumber>(
                  this, METHODID_COUNTING_NUMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class countingStub extends io.grpc.stub.AbstractStub<countingStub> {
    private countingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private countingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected countingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new countingStub(channel, callOptions);
    }

    /**
     */
    public void countingNumbers(com.example.Counting.sendNumbers request,
        io.grpc.stub.StreamObserver<com.example.Counting.responseNumber> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCountingNumbersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class countingBlockingStub extends io.grpc.stub.AbstractStub<countingBlockingStub> {
    private countingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private countingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected countingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new countingBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.Counting.responseNumber> countingNumbers(
        com.example.Counting.sendNumbers request) {
      return blockingServerStreamingCall(
          getChannel(), getCountingNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class countingFutureStub extends io.grpc.stub.AbstractStub<countingFutureStub> {
    private countingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private countingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected countingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new countingFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COUNTING_NUMBERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final countingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(countingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNTING_NUMBERS:
          serviceImpl.countingNumbers((com.example.Counting.sendNumbers) request,
              (io.grpc.stub.StreamObserver<com.example.Counting.responseNumber>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class countingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    countingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.Counting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("counting");
    }
  }

  private static final class countingFileDescriptorSupplier
      extends countingBaseDescriptorSupplier {
    countingFileDescriptorSupplier() {}
  }

  private static final class countingMethodDescriptorSupplier
      extends countingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    countingMethodDescriptorSupplier(String methodName) {
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
      synchronized (countingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new countingFileDescriptorSupplier())
              .addMethod(getCountingNumbersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
