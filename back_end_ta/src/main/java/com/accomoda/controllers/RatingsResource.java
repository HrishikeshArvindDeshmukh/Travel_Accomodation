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

import com.accomoda.daos.RatingsDaos;
import com.accomoda.entities.Ratings;
import com.accomoda.services.RatingsServices;

@RestController
public class RatingsResource {
	
	@Autowired
	private RatingsServices ratingsServices;
	
	@Autowired
	private RatingsDaos ratingsDaos;
	
	@GetMapping("/ratings")
	public @ResponseBody List<Ratings> findAll() {
		List<Ratings> result = ratingsDaos.findAll();
		return result;
	}
	
	@GetMapping("/ratings/{id}")
	public @ResponseBody Object findById(@PathVariable("id") int id) {
		Ratings result = ratingsServices.findRatingsById(id);
		if(result == null)
			return "Ratings not found";
		return result;
	}
	
	@PostMapping("/ratings")
	public @ResponseBody Ratings save(@RequestBody Ratings ratings) {
		Ratings result = ratingsDaos.save(ratings);
		return result;
	}
	
	@PutMapping("/ratings/{id}")
	public @ResponseBody Ratings update(@PathVariable("id") int id, @RequestBody Ratings ratings) {
		System.out.println(id);
		System.out.println(ratings);
		ratings.setUserId(id);
		Ratings result = ratingsDaos.save(ratings);
		return result;
	}
	
	@DeleteMapping("/ratings/{id}")
	public @ResponseBody Ratings deleteById(@PathVariable("id") int id) {
		Ratings ratings = ratingsDaos.findByRatingId(id);
		if(ratings!=null) {
			ratingsDaos.deleteById(id);
			return ratings;
		}else {
			return null;
		}
	}
	
	
}




