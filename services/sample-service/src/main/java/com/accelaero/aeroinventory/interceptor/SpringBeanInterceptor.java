package com.accelaero.aeroinventory.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class SpringBeanInterceptor implements ServerInterceptor {
	
	private static Log log = LogFactory.getLog(SpringBeanInterceptor.class);
    
	@Override
	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
			ServerCallHandler<ReqT, RespT> next) {
		log.info("############# Spring Bean Interceptor ####################");
		return next.startCall(call, headers);
	}
}

