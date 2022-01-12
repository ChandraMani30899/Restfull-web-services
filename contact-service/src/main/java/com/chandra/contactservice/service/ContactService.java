package com.chandra.contactservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chandra.contactservice.model.Contact;

@Service
public class ContactService {

	   List<Contact> list = List.of(
		 new Contact(1,"abc@gmail.com","Abc",1),
		 new Contact(2,"cde@gmail.com","cde",1),
		 new Contact(3,"efg@gmail.com","Efg",2),
		 new Contact(4,"hij@gmail.com","Hij",3)
			   
			   );  
	   
	   public List<Contact> getContactsOfUser(int userId){
		   List<Contact> userList = new ArrayList<>(); 
		   
		   for(Contact contact:list) {
			   if(contact.getUserId() == userId) {
				   userList.add(contact);
			   }
		   } 
		   
		   return userList;
 	   }
}
