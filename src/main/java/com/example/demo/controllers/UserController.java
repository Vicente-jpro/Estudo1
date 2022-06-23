package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping( value = "/add", produces = "application/json")
	public ResponseEntity<User> create(@RequestBody User user){
		return new ResponseEntity<User>(userService.create(user), HttpStatus.CREATED);
	}
	
	@GetMapping( value = "/all", produces = "application/json")
	public ResponseEntity<List<User>> read(){
		return new ResponseEntity<List<User>>(userService.read(), HttpStatus.OK);
	}
	
	@GetMapping( value = "/get/{id}", produces = "application/json")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id){
		return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
	}
	
	@PutMapping( value = "/add", produces = "application/json")
	public ResponseEntity<User> update(@RequestBody User user){
		return new ResponseEntity<User>(userService.create(user), HttpStatus.OK);
	}
	
	@DeleteMapping( value = "/delete/{id}", produces = "application/json")
	public ResponseEntity<User> delete(@PathVariable("id") Long id){
		userService.delete(id);
		return new ResponseEntity<User>( HttpStatus.OK);
	}
	
	
}
