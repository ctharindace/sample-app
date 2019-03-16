package com.accelaero.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelaero.sample.data.mongo.UserRepository;
import com.accelaero.sample.model.document.User;

@Component
public class AuthenticationService {
	
	@Autowired
	private UserRepository repository;
	
	public User authenticate(String username, String password) {
		return repository.findByUsername(username);
	}

}
