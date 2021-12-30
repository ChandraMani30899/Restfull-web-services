package com.chandra.rest.webservices.restfulwebservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.chandra.rest.webservices.restfulwebservices.Exception.UserNotFoundException;
import com.chandra.rest.webservices.restfulwebservices.component.UserDaoService;
import com.chandra.rest.webservices.restfulwebservices.model.User;

@RestController
public class UserController {

	@Autowired
	UserDaoService service;
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello world";
	} 
	
	@GetMapping("/users")
	public List<User> retrieveAllUser(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		
				User user=service.findOne(id); 
				
				if(user==null) {
					throw new UserNotFoundException("id-"+id);
				}
				
				return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		User savedUser = service.save(user);
		
		URI location=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("{/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
