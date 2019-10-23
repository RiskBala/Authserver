package com.online.authserver.user.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.online.authserver.user.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUserId(String userId);

}