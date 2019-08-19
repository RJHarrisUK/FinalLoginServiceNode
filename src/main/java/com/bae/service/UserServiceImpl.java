package com.bae.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bae.persistence.domain.User;
import com.bae.persistence.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository repo;

	@Autowired
	public UserServiceImpl(UserRepository repo) {
		this.repo = repo;
	}

	public UserServiceImpl() {
	}

	// LOGIN
	@Override
	public User loginUser(Long id, String password) {

		return null;
	}

	// AUTHENTICATE
	@Override
	public User verifyUser(Long id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	// CHECK INTERFACE TYPE
	@Override
	public User checkRole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	// CREATE
	@Override
	public User createUser(User user) {
		return repo.save(user);
	}

	// DELETE
	@Override
	public ResponseEntity<Object> deleteUser(Long id) {
		if (userExists(id)) {
			repo.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	// CHECK IF USER EXISTS
	private boolean userExists(Long id) {
		Optional<User> userOptional = repo.findById(id);
		return userOptional.isPresent();
	}

}
