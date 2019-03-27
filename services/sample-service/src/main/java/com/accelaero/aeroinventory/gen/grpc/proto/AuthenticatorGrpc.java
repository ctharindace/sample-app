package com.accelaero.aeroinventory.gen.grpc.proto;

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
    comments = "Source: authenticator.proto")
public final class AuthenticatorGrpc {

  private AuthenticatorGrpc() {}

  public static final String SERVICE_NAME = "Authenticator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest,
      com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest.class,
      responseType = com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest,
      com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest, com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthenticatorGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthenticatorGrpc.class) {
        if ((getAuthenticateMethod = AuthenticatorGrpc.getAuthenticateMethod) == null) {
          AuthenticatorGrpc.getAuthenticateMethod = getAuthenticateMethod = 
              io.grpc.MethodDescriptor.<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest, com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Authenticator", "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticatorMethodDescriptorSupplier("Authenticate"))
                  .build();
          }
        }
     }
     return getAuthenticateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticatorStub newStub(io.grpc.Channel channel) {
    return new AuthenticatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthenticatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthenticatorFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthenticatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void authenticate(com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest,
                com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   */
  public static final class AuthenticatorStub extends io.grpc.stub.AbstractStub<AuthenticatorStub> {
    private AuthenticatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticatorStub(channel, callOptions);
    }

    /**
     */
    public void authenticate(com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthenticatorBlockingStub extends io.grpc.stub.AbstractStub<AuthenticatorBlockingStub> {
    private AuthenticatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse authenticate(com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthenticatorFutureStub extends io.grpc.stub.AbstractStub<AuthenticatorFutureStub> {
    private AuthenticatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse> authenticate(
        com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthenticatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthenticatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse>) responseObserver);
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

  private static abstract class AuthenticatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authenticator");
    }
  }

  private static final class AuthenticatorFileDescriptorSupplier
      extends AuthenticatorBaseDescriptorSupplier {
    AuthenticatorFileDescriptorSupplier() {}
  }

  private static final class AuthenticatorMethodDescriptorSupplier
      extends AuthenticatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthenticatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthenticatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticatorFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
