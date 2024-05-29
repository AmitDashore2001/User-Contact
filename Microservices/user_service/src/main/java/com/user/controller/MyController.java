package com.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.MyService;

@RestController
@RequestMapping("/user")
public class MyController {

	@Autowired
	private MyService myService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/")
	public User createUser(@RequestBody User user) {
		return this.myService.addUser(user);

	}

	@GetMapping("/")
	public List<User> getAllUser() {
		return this.myService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public User getByUserId(@PathVariable Long userId) {
		User user = this.myService.userById(userId);
		List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/" +user.getUserId(),List.class);
        user.setContacts(contacts);
        return user;
	}

//	@GetMapping("/{userId}")
//	public User getByUserId(@PathVariable Long userId) {
//		return this.myService.userById(userId);
//	}
}
