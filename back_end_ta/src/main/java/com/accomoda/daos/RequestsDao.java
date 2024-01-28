package com.accomoda.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accomoda.entities.Requests;

public interface RequestsDao extends JpaRepository<Requests, Integer> {

	Requests findById(int id);
	
	
}