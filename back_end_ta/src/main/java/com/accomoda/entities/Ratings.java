package com.accomoda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ratings")
public class Ratings {
	
	@Id
	@Column(name="rating_id")
	private int ratingId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="hotel_id")
	private int hotelId;
	
	@Column(name="rating")
	private int rating;

	public Ratings() {
		super();
	}

	public Ratings(int ratingId, int userId, int hotelId, int rating) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Ratings [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
				+ "]";
	}
	
}
