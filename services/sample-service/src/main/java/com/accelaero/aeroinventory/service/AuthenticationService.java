package com.accelaero.aeroinventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelaero.aeroinventory.dao.mongo.UserRepository;
import com.accelaero.aeroinventory.model.document.User;

@Component
public class AuthenticationService {
	
	@Autowired
	private UserRepository repository;
	
	public User authenticate(String username, String password) {
		return repository.findByUsername(username);
	}

}
