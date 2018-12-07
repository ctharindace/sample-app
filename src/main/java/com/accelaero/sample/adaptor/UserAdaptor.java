package com.accelaero.sample.adaptor;

import com.accelaero.sample.gen.grpc.proto.AuthenticatorOuterClass;
import com.accelaero.sample.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse;
import com.accelaero.sample.model.document.User;

public class UserAdaptor {
	
	public static AuthenticateResponse adapt(User user) {
		
		AuthenticatorOuterClass.AuthenticateResponse.Builder resultBuilder = AuthenticatorOuterClass.AuthenticateResponse
				.newBuilder();
		if (user != null) {
			resultBuilder.setEmail(user.getEmail());
			resultBuilder.setFirstName(user.getFirstName());
			resultBuilder.setLastName(user.getLastName());
			resultBuilder.setUsername(user.getUsername());
			resultBuilder.setSuccess(true);
		} else {
			resultBuilder.setSuccess(false);
		}

		return resultBuilder.build();
	}

}
