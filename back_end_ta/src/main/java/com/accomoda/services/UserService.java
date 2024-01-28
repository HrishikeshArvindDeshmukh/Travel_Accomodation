package com.accomoda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accomoda.daos.UserDao;
import com.accomoda.entities.User;

//@Transactional
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User findUserByEmailAndPassword(String email,String password) {
		User user = userDao.findByEmail(email);
		System.out.println("userfound pass = "+user);
		System.out.println("from service = "+password);
		if(user!=null) {
			return user;
		}
		System.out.println("from userService "+user);
		return null;
	}

	public User findUserById(int id) {
		return null;
	}
	
	public List<User> findAllUsers() {
		return userDao.findAll();
		
	}

	public User save(User user) {
		return userDao.save(user);
		
		
	}



}
