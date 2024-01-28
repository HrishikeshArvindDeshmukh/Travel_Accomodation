package com.accomoda.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="dob")
	private Date dob;
	@Column(name="mobile")
	private int mobile;
	@Column(name="gender")
	private String gender;
	@Column(name="email")
	private String email;  
	@Column(name="password")
	private String password;
	@Column(name="address")
	private String address;
	@Column(name="is_host")
	private Short isHost;
	@Column(name="id_proof_no")
	private int idProofNo;
	@Column(name="id_proof_img")
	private String idProofImg;
	@Column(name="profile_pic")
	private String profilePic;
	public User() {
		super();
	}
	public User(int userId, String firstName, String lastName, Date dob, int mobile, String gender, String email,
			String password, String address, Short isHost, int idProofNo, String idProofImg, String profilePic) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobile = mobile;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.address = address;
		this.isHost = isHost;
		this.idProofNo = idProofNo;
		this.idProofImg = idProofImg;
		this.profilePic = profilePic;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", mobile=" + mobile + ", gender=" + gender + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", isHost=" + isHost + ", idProofNo=" + idProofNo + ", idProofImg="
				+ idProofImg + ", profilePic=" + profilePic + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Short getIsHost() {
		return isHost;
	}
	public void setIsHost(Short isHost) {
		this.isHost = isHost;
	}
	public int getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(int idProofNo) {
		this.idProofNo = idProofNo;
	}
	public String getIdProofImg() {
		return idProofImg;
	}
	public void setIdProofImg(String idProofImg) {
		this.idProofImg = idProofImg;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	} 
	
//	INSERT INTO users VALUES(0,"Sudarshan","Dasore","1999-05-14",7972,"male","sdasore@gmail.com","s123","Shegaon",1,2664,"idimg1","profileimg1","admin");
//	INSERT INTO users VALUES(0,"Hrishikesh","Deshmukh","1998-04-19",5292,"male","hdeshmukh@gmail.com","h123","Jalgaon",1,2664,"idimg2","profileimg2","user");
//	INSERT INTO users VALUES(0,"Ajit","Hirave","1998-06-22",6423,"male","ahirave@gmail.com","a123","Baramati",1,2664,"idimg3","profileimg3","user");
//	INSERT INTO users VALUES(0,"Shraddha","Jadhav","1998-10-20",5423,"female","sjadhav@gmail.com","s123","Pune",0,2664,"idimg4","profileimg4","user");
//	INSERT INTO users VALUES(0,"Vishal","Thakur","2000-02-26",9563,"male","vthakur@gmail.com","v123","Pune",0,2664,"idimg5","profileimg5","user");
//	INSERT INTO users VALUES(0,"Namrata","Kale","1999-05-30",2233,"female","nkale@gmail.com","n123","Mumbai",0,2664,"idimg6","profileimg6","user");
}
