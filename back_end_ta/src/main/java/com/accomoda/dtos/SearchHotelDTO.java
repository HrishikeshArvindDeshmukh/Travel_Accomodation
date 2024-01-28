package com.accomoda.dtos;

import java.util.Date;

public class SearchHotelDTO {
	private String location;
	private Date checkInDate;
	private Date checkOutDate;
	private int adultCount;
	private int childCount;
	private boolean hotelType;
	
	public SearchHotelDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SearchHotelDTO(String location, Date checkInDate, Date checkOutDate, int adultCount, int childCount,
			boolean hotelType) {
		super();
		this.location = location;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.adultCount = adultCount;
		this.childCount = childCount;
		this.hotelType = hotelType;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}
	public int getChildCount() {
		return childCount;
	}
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	public boolean getHotelType() {
		return hotelType;
	}
	public void setHotelType(boolean hotelType) {
		this.hotelType = hotelType;
	}

	@Override
	public String toString() {
		return "SearchHotel [location=" + location + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", adultCount=" + adultCount + ", childCount=" + childCount + ", hotelType=" + hotelType + "]";
	}
	
	
	
	

}
