package com.accomoda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accomoda.daos.UserDao;
import com.accomoda.dtos.Credential;
import com.accomoda.entities.*;
import com.accomoda.services.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/v1/users")
	public @ResponseBody List<User> findAll() {
		List<User> result = userDao.findAll();
		return result;
	}
	
	
	
	@GetMapping("/v1/users/{id}")
	public @ResponseBody Object findById(@PathVariable("id") int id) {
		User result = userService.findUserById(id);
		if(result == null)
			return "User not found";
		return result;
	}
	
	@PostMapping("/v1/users")
	public @ResponseBody User save(@RequestBody User user) {
		User result = userDao.save(user);
		return result;
	}
	
	@PutMapping("/v1/users/{id}")
	public @ResponseBody User update(@PathVariable("id") int id, @RequestBody User user) {
		System.out.println(id);
		System.out.println(user);
		user.setUserId(id);
		User result = userDao.save(user);
		return result;
	}
	
	@DeleteMapping("/v1/users/{id}")
	public @ResponseBody User deleteById(@PathVariable("id") int id) {
		User user = userDao.findByuserId(id);
		if(user!=null) {
			userDao.deleteById(id);
			return user;
		}else {
			return null;
		}
		
		
	}
	@PostMapping("/v1/users/signin")
	public @ResponseBody Object signIn(@RequestBody Credential cred) {
		System.out.println(cred);
		User user = userService.findUserByEmailAndPassword(cred.getEmail(),cred.getPassword());
		System.out.println(user);
		if(user == null)
			return "user not found";
		return user;
	}
	
	

}
