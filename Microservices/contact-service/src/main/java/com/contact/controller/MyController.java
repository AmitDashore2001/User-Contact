package com.contact.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.MyService;

@RestController
@RequestMapping("/contact")
public class MyController {

	@Autowired
	private MyService myService;

	@PostMapping("/")
	public Contact createContact(@RequestBody Contact contact) {
		return this.myService.addUser(contact);

	}

	@GetMapping("/")
	public List<Contact> getAllContact() {
		return this.myService.getAllContact();
	}

	@GetMapping("/{contactId}")
	public Optional<Contact> getContact(@PathVariable long contactId) {
           return this.myService.getContact(contactId);
	}
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContactsByUser(@PathVariable long userId) {
		return this.myService.getContactsByUserId(userId);
	}
}