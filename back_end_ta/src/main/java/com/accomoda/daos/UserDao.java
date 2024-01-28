package com.accomoda.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accomoda.entities.User;


public interface UserDao extends JpaRepository<User, Integer>{
	User findByuserId(int userId);
	User findByEmail(String email);
	

}
