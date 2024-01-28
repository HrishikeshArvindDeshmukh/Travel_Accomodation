package com.accomoda.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accomoda.entities.Ratings;

public interface RatingsDaos extends JpaRepository<Ratings, Integer>{

	Ratings findByRatingId(int ratingId);
	Ratings findByHotelId(int hotelId);
	
	
}
