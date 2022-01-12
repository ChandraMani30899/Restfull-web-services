package com.chandra.contactservice.model;

public class Contact {

	
	int contactId;
	String email;
	String contactName;
	int userId;
	
	
	
	
	public int getContactId() {
		return contactId;
	}




	public void setContactId(int contactId) {
		this.contactId = contactId;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getContactName() {
		return contactName;
	}




	public void setContactName(String contactName) {
		this.contactName = contactName;
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	/**
	 * @param contactId
	 * @param email
	 * @param contactName
	 * @param userId
	 */
	public Contact(int contactId, String email, String contactName, int userId) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	
	
}
