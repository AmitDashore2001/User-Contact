package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public interface MyService {

	public User addUser(User user);
	
	public List<User> getAllUsers();
	
	public User userById(Long userId);
	
}
