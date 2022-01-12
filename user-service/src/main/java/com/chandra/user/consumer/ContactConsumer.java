package com.chandra.user.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.chandra.user.model.Contact;

@FeignClient("CONTACT-SERVICE")
public interface ContactConsumer {

	@GetMapping("/contact-service/user/{userId}") 
	public List<Contact> getContact(@PathVariable int userId);
}
