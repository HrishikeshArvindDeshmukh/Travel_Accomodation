package com.accomoda.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.http.HttpStatus;

@Entity
@Table(name="requests")
public class Requests {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private int senderId;
	private int receiverId;
	private String status;
	
	public Requests()
	{
		
	}

	public Requests(int id, int senderId, int receiveId, String status) {
		super();
		this.id = id;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getreceiverId() {
		return receiverId;
	}

	public void setreceiverId(int receiveId) {
		this.receiverId = receiverId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Requests [id=" + id + ", senderId=" + senderId + ", receiveId=" + receiverId + ", status=" + status
				+ "]";
	}

	
	
}
