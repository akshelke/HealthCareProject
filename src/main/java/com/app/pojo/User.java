package com.app.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="p_registration")
public class User extends BaseEntity{
      
	private String fullname;
	private String address;
	private String email;
	private String password;
	private Date dob;
	private String mob_no;


	
	public User() {
		super();
	}



	public User(String fullname, String address, String email, String password, Date dob, String mob_no) {
		super();
		this.fullname = fullname;
		this.address = address;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.mob_no = mob_no;
	}



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
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



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getMob_no() {
		return mob_no;
	}



	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}



	

}

