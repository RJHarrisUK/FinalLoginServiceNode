package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.persistence.domain.User;
import com.bae.service.UserService;

@RestController
public class UserController {

	public UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	public UserController() {
	}

	// READ
	@PostMapping("/loginUser/{userId}")
	public User loginUser(@PathVariable("userId") Long id, @RequestBody String password) {
		return service.loginUser(id, password);
	}

	// AUTHENTICATE

////AUTHENTICATE
//	@Override
//	public User verifyUser(Long id, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	// CHECK USER TYPE

////CHECK INTERFACE TYPE
//@Override
//public User checkRole(Long id) {
//	// TODO Auto-generated method stub
//	return null;
//}

	// CREATE
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return service.createUser(user);
	}

	// DELETE
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<Object> deleteUser(@PathVariable("userId") Long id) {
		return service.deleteUser(id);
	}

}
