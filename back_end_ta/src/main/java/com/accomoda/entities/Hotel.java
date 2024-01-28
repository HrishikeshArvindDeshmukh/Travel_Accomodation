package com.accomoda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotel {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int hotelId;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="pin_code")
	private int pinCode;
	
	@Column(name="hotel_type")
	private String hotelType;
	
	@Column(name="amenities")
	private String amenities;
	
	@Column(name="no_of_rooms")
	private int noOfRooms;
	
	@Column(name="is_homestay")
	private boolean isHomestay;
	
	@Column(name="bed_img")
	private String bedImg;
	
	@Column(name="washroom_img")
	private String washroomImg;
	
	@Column(name="exterior_img")
	private String exteriorImg;
	
	@Column(name="other_img")
	private String otherImg;
	
	public Hotel() {
		
	}

	public Hotel(int hotelId, String hotelName, String city, String state, String country, int pinCode,
			String hotelType, String amenities, int noOfRooms, boolean isHomestay, String bedImg, String washroomImg,
			String exteriorImg, String otherImg) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.hotelType = hotelType;
		this.amenities = amenities;
		this.noOfRooms = noOfRooms;
		this.isHomestay = isHomestay;
		this.bedImg = bedImg;
		this.washroomImg = washroomImg;
		this.exteriorImg = exteriorImg;
		this.otherImg = otherImg;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getHotelType() {
		return hotelType;
	}

	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public boolean isHomestay() {
		return isHomestay;
	}

	public void setHomestay(boolean isHomestay) {
		this.isHomestay = isHomestay;
	}

	public String getBedImg() {
		return bedImg;
	}

	public void setBedImg(String bedImg) {
		this.bedImg = bedImg;
	}

	public String getWashroomImg() {
		return washroomImg;
	}

	public void setWashroomImg(String washroomImg) {
		this.washroomImg = washroomImg;
	}

	public String getExteriorImg() {
		return exteriorImg;
	}

	public void setExteriorImg(String exteriorImg) {
		this.exteriorImg = exteriorImg;
	}

	public String getOtherImg() {
		return otherImg;
	}

	public void setOtherImg(String otherImg) {
		this.otherImg = otherImg;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pinCode=" + pinCode + ", hotelType=" + hotelType + ", amenities="
				+ amenities + ", noOfRooms=" + noOfRooms + ", isHomestay=" + isHomestay + ", bedImg=" + bedImg
				+ ", washroomImg=" + washroomImg + ", exteriorImg=" + exteriorImg + ", otherImg=" + otherImg + "]";
	}

	

	
	
//	INSERT INTO hotels() values(0,"Atithi1","Shegaon","Maharashtra","India",44403,"Premium","Gym Pool Laundry",3,false,"img1","img2","img3","img4");	
//	INSERT INTO hotels() values(0,"Atithi2","Akola","Maharashtra","India",411003,"Budget","Gym ",4,false,"img1","img2","img3","img4");
//	INSERT INTO hotels() values(0,"Atithi3","Pune","Maharashtra","India",411222,"Premium","Gym Pool Laundry Breakfast",5,false,"img1","img2","img3","img4");	
//	INSERT INTO hotels() values(0,"Atithi Niwas","Indore","Madhya Pradesh","India",411456,"Free","Breakfast",5,true,"img1","img2","img3","img4");	
//	INSERT INTO hotels() values(0,"Reddy Niwas","Chennai","Tamilnadu","India",478486,"Free","Breakfast",3,true,"img1","img2","img3","img4");
//	INSERT INTO hotels() values(0,"Atithi6","Jaipur","Rajasthan","India",434001,"Premium","Gym Pool Breakfast",4,false,"img1","img2","img3","img4");	
//	INSERT INTO hotels() values(0,"Atithi7","Surat","Gujrat","India",400124,"Budget","Breakfast",3,false,"img1","img2","img3","img4");

}
