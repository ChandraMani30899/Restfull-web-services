package com.chandra.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.contactservice.model.Contact;
import com.chandra.contactservice.service.ContactService;

@RestController
@RequestMapping("/contact-service")
public class ContactController {

	
	@Autowired
	ContactService contactService;  
	
	
	@GetMapping("/user/{userId}") 
	public List<Contact> getContact(@PathVariable int userId) {
		return contactService.getContactsOfUser(userId);
	}
}
