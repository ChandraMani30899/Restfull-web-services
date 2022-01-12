package com.chandra.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.user.model.User;
import com.chandra.user.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController {

	
	@Autowired 
	UserService userService;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable int userId) {
		
		
		return userService.getUser(userId);
	}
}
