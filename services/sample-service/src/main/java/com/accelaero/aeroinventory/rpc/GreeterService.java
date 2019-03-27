package com.accelaero.aeroinventory.rpc;

import org.lognet.springboot.grpc.GRpcService;

import com.accelaero.aeroinventory.gen.grpc.proto.GreeterOuterClass;
import com.accelaero.aeroinventory.gen.grpc.proto.GreeterGrpc.GreeterImplBase;
import com.accelaero.aeroinventory.gen.grpc.proto.GreeterOuterClass.HelloReply;
import com.accelaero.aeroinventory.gen.grpc.proto.GreeterOuterClass.HelloRequest;
import com.accelaero.aeroinventory.interceptor.SpringBeanInterceptor;

import io.grpc.stub.StreamObserver;

@GRpcService(interceptors = SpringBeanInterceptor.class)
public class GreeterService extends GreeterImplBase{
	
	@Override
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		
		GreeterOuterClass.HelloReply.Builder responseBuilder = GreeterOuterClass.HelloReply.newBuilder();
		responseBuilder.setMessage("Hello World");
		responseObserver.onNext(responseBuilder.build());
		responseObserver.onCompleted();

	}

}