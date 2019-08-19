package com.bae.service;

import org.springframework.http.ResponseEntity;

import com.bae.persistence.domain.User;

public interface UserService {

	User loginUser(Long id, String password);

	User verifyUser(Long id, String password);

	User checkRole(Long id);

	User createUser(User user);

	ResponseEntity<Object> deleteUser(Long id);

}
