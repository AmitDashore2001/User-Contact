package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.entity.User;
import com.user.exception.ResourceNotFoundException;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

	@Override
	public User userById(Long userId) {
		// TODO Auto-generated method stub
		User user= this.userDao.findById(userId).orElseThrow(()-> new ResourceNotFoundException("UserId","Id",userId));
	   return user;
	}
}