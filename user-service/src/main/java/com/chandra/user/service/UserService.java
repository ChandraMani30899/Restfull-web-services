package com.chandra.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandra.user.consumer.ContactConsumer;
import com.chandra.user.model.User;


@Service
public class UserService {

	@Autowired
	ContactConsumer contactConsumer;
	
	List<User> list = List.of(
			new User(1,"chandra","98777700"),
			new User(2,"amit","98344200"),
			new User(3,"sumit","93134700")
			);
	
	public User getUser(int id){
		for(User user:list) {
			if(user.getUserId()==id) {
				user.setContacts(contactConsumer.getContact(id));
				return user;
			}
		}
		
		
		return null;
	}
	
}
