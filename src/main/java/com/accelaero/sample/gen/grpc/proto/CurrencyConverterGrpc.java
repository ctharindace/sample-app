package com.accelaero.sample.gen.grpc.proto;

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
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: currency_converter.proto")
public final class CurrencyConverterGrpc {

  private CurrencyConverterGrpc() {}

  public static final String SERVICE_NAME = "CurrencyConverter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest,
      com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse> getCurrencyConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrencyConvert",
      requestType = com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest.class,
      responseType = com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest,
      com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse> getCurrencyConvertMethod() {
    io.grpc.MethodDescriptor<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest, com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse> getCurrencyConvertMethod;
    if ((getCurrencyConvertMethod = CurrencyConverterGrpc.getCurrencyConvertMethod) == null) {
      synchronized (CurrencyConverterGrpc.class) {
        if ((getCurrencyConvertMethod = CurrencyConverterGrpc.getCurrencyConvertMethod) == null) {
          CurrencyConverterGrpc.getCurrencyConvertMethod = getCurrencyConvertMethod = 
              io.grpc.MethodDescriptor.<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest, com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CurrencyConverter", "CurrencyConvert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CurrencyConverterMethodDescriptorSupplier("CurrencyConvert"))
                  .build();
          }
        }
     }
     return getCurrencyConvertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyConverterStub newStub(io.grpc.Channel channel) {
    return new CurrencyConverterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyConverterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CurrencyConverterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyConverterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CurrencyConverterFutureStub(channel);
  }

  /**
   */
  public static abstract class CurrencyConverterImplBase implements io.grpc.BindableService {

    /**
     */
    public void currencyConvert(com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrencyConvertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCurrencyConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest,
                com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse>(
                  this, METHODID_CURRENCY_CONVERT)))
          .build();
    }
  }

  /**
   */
  public static final class CurrencyConverterStub extends io.grpc.stub.AbstractStub<CurrencyConverterStub> {
    private CurrencyConverterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyConverterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyConverterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyConverterStub(channel, callOptions);
    }

    /**
     */
    public void currencyConvert(com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrencyConvertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CurrencyConverterBlockingStub extends io.grpc.stub.AbstractStub<CurrencyConverterBlockingStub> {
    private CurrencyConverterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyConverterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyConverterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyConverterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse currencyConvert(com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest request) {
      return blockingUnaryCall(
          getChannel(), getCurrencyConvertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CurrencyConverterFutureStub extends io.grpc.stub.AbstractStub<CurrencyConverterFutureStub> {
    private CurrencyConverterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurrencyConverterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyConverterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurrencyConverterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse> currencyConvert(
        com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrencyConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CURRENCY_CONVERT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurrencyConverterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CurrencyConverterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CURRENCY_CONVERT:
          serviceImpl.currencyConvert((com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest) request,
              (io.grpc.stub.StreamObserver<com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse>) responseObserver);
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

  private static abstract class CurrencyConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyConverterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurrencyConverter");
    }
  }

  private static final class CurrencyConverterFileDescriptorSupplier
      extends CurrencyConverterBaseDescriptorSupplier {
    CurrencyConverterFileDescriptorSupplier() {}
  }

  private static final class CurrencyConverterMethodDescriptorSupplier
      extends CurrencyConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CurrencyConverterMethodDescriptorSupplier(String methodName) {
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
      synchronized (CurrencyConverterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyConverterFileDescriptorSupplier())
              .addMethod(getCurrencyConvertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
