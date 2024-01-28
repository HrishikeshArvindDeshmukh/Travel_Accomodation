package com.accomoda.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accomoda.daos.RatingsDaos;
import com.accomoda.entities.Ratings;

@Transactional
@Service
public class RatingsServices {
	
	@Autowired
	private RatingsDaos ratingsDaos;
	
	public Ratings findRatingsById(int id) {
		return null;
	}
	
	public List<Ratings> findAllRatings(){
		return ratingsDaos.findAll();
	}
	
	public Ratings save(Ratings ratings) {
		return ratingsDaos.save(ratings);
	}

}
