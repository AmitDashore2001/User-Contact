package com.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.dao.ContactDao;
import com.contact.entity.Contact;
import com.contact.exception.ResourceNotFoundException;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	private ContactDao contactDao;

	@Override
	public Contact addUser(Contact contact) {
		// TODO Auto-generated method stub
		return this.contactDao.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return this.contactDao.findAll();
	}

	public Optional<Contact> getContact(long id) {
		// TODO Auto-generated method stub
		return this.contactDao.findById(id);
	}

	@Override
	public List<Contact> getContactsByUserId(long userId) {
		//
		return this.contactDao.findByUserId(userId);
	}
}
