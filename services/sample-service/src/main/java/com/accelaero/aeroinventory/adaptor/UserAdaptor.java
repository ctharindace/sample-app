package com.accelaero.aeroinventory.adaptor;

import com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass;
import com.accelaero.aeroinventory.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse;
import com.accelaero.aeroinventory.model.document.User;

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
