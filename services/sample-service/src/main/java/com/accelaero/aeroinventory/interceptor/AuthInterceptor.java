package com.accelaero.aeroinventory.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class AuthInterceptor implements ServerInterceptor {

	private static Log log = LogFactory.getLog(AuthInterceptor.class);

    @Override
	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
			ServerCallHandler<ReqT, RespT> next) {
    	log.info("###################Authentication Service Invoked######################");
		return next.startCall(call, headers);
	}
}

