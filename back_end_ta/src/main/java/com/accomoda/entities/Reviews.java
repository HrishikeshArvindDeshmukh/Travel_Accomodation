package com.accomoda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Reviews {
	
	@Id
	@Column(name="review_id")
	private int reviewId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="hotel_id")
	private int hotelId;
	
	@Column(name="review")
	private String review;

	public Reviews() {
		super();
	}

	public Reviews(int reviewId, int userId, int hotelId, String review) {
		super();
		this.reviewId = reviewId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.review = review;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
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

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Reviews [reviewId=" + reviewId + ", userId=" + userId + ", hotelId=" + hotelId + ", review=" + review
				+ "]";
	}
		
}
