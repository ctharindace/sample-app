package com.accelaero.aeroinventory.rpc;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.accelaero.aeroinventory.adaptor.UserAdaptor;
import com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorGrpc.AuthenticatorImplBase;
import com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest;
import com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse;
import com.accelaero.aeroinventory.interceptor.AuthInterceptor;
import com.accelaero.aeroinventory.model.document.User;
import com.accelaero.aeroinventory.service.AuthenticationService;

import io.grpc.stub.StreamObserver;

@GRpcService(interceptors = AuthInterceptor.class)
public class AuthenticatorService extends AuthenticatorImplBase{
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Override
	public void authenticate(AuthenticateRequest request, StreamObserver<AuthenticateResponse> responseObserver) {
		User user = authenticationService.authenticate(request.getUsername(), request.getPassword());
		responseObserver.onNext(UserAdaptor.adapt(user));
		responseObserver.onCompleted();

	}

}