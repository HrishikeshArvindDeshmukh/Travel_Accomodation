package com.accomoda.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accomoda.entities.Reviews;

public interface ReviewsDaos extends JpaRepository<Reviews, Integer>{
	
	Reviews findByReviewId(int reviewId);
	Reviews findByHotelId(int hotelId);

}
