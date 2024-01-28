package com.accomoda.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accomoda.daos.ReviewsDaos;
import com.accomoda.entities.Reviews;

@Transactional
@Service
public class ReviewsServices {
	
	@Autowired
	private ReviewsDaos reviewDaos;
	
	public Reviews findReviewById(int id) {
		return null;
	}
	
	public List<Reviews> findAllReviews(){
		return reviewDaos.findAll();
	}
	
	public Reviews save(Reviews reviews) {
		return reviewDaos.save(reviews);
	}

}
