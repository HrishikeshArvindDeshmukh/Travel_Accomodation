package com.accomoda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accomoda.daos.ReviewsDaos;
import com.accomoda.entities.Reviews;
import com.accomoda.services.ReviewsServices;

@RestController
public class ReviewsResource {
	
	@Autowired
	private ReviewsServices reviewsServices;
	
	@Autowired
	private ReviewsDaos reviewsDaos;
	
	@GetMapping("/reviews")
	public @ResponseBody List<Reviews> findAll() {
		List<Reviews> result = reviewsDaos.findAll();
		return result;
	}
	
	@GetMapping("/reviews/{id}")
	public @ResponseBody Object findById(@PathVariable("id") int id) {
		Reviews result = reviewsServices.findReviewById(id);
		if(result == null)
			return "Review not found";
		return result;
	}
	
	@PostMapping("/reviews")
	public @ResponseBody Reviews save(@RequestBody Reviews reviews) {
		Reviews result = reviewsDaos.save(reviews);
		return result;
	}
	
	@PutMapping("/reviews/{id}")
	public @ResponseBody Reviews update(@PathVariable("id") int id, @RequestBody Reviews reviews) {
		System.out.println(id);
		System.out.println(reviews);
		reviews.setUserId(id);
		Reviews result = reviewsDaos.save(reviews);
		return result;
	}
	
	@DeleteMapping("/reviews/{id}")
	public @ResponseBody Reviews deleteById(@PathVariable("id") int id) {
		Reviews reviews = reviewsDaos.findByReviewId(id);
		if(reviews!=null) {
			reviewsDaos.deleteById(id);
			return reviews;
		}else {
			return null;
		}
	}
}
