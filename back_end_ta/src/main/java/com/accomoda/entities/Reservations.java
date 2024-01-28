package com.accomoda.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="reservations")
public class Reservations {
	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private int id;
	 
	 @Column(name="check_in")
	 @Temporal(TemporalType.DATE)
	 private Date checkIn;
	 
	 @Column(name="check_out")
	 @Temporal(TemporalType.DATE)
	 private Date checkOut;
	 
	 @Column(name="members_count")
	 private int membersCount;
	 
	 @Column(name="total_amount")
	 private double totalAmount;
	 
	 @Column(name="payment_status")
	 private String paymentStatus;
	 
	 @Column(name="room_id")
	 private int roomId;
	 
	 @Column(name="hotel_id")
	 private int hotelId;
	 
	 @Column(name="user_id")
	 private int userId;
	 
	 public Reservations() {
		
	 }
	 //INSERT INTO reservations VALUES(0,"2021-12-10","2021-12-15",3,1500,"paid",1,1,1);
	 
	 

	public Reservations(int id, Date checkIn, Date checkOut, int membersCount, double totalAmount,
			String paymentStatus, int roomId, int hotelId, int userId) {
		super();
		this.id = id;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.membersCount = membersCount;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
		this.roomId = roomId;
		this.hotelId = hotelId;
		this.userId = userId;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public int getMembersCount() {
		return membersCount;
	}

	public void setMembersCount(int membersCount) {
		this.membersCount = membersCount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double total_amount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "Reservations [id=" + id + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", membersCount="
				+ membersCount + ", totalAmount=" + totalAmount + ", paymentStatus=" + paymentStatus + ", roomId="
				+ roomId + ", hotelId=" + hotelId + ", userId=" + userId + "]";
	}
	 
	
		//INSERT INTO reservations VALUES(0,"2022-04-10","2022-04-15",4,1300,"paid",1,1,1)
}
