package com.laxman.portfolio.service;

import java.util.List;

import com.laxman.portfolio.model.Contact;

public interface ContactService {
	
	Contact addContact(Contact con);
	List<Contact> viewAllContacts();
	public void deleteContact(String id);
	public long countMessages();
	

}
