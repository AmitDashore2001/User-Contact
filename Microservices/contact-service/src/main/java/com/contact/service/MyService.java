package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public interface MyService {

	
	public Contact addUser(Contact contact);
	public List<Contact> getAllContact();
	public Optional<Contact> getContact(long id);
	public List<Contact> getContactsByUserId(long userId);


}
