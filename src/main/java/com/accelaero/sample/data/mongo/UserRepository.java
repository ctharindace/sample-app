package com.accelaero.sample.data.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.accelaero.sample.model.document.User;


@Component
public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);
    public User findByUsername(String username);

}
