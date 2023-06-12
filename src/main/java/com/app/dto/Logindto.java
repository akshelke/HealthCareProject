package com.app.dto;

import java.util.Date;

public class Logindto {
	private String email;
	private String password;
	private Date dob;
	public Logindto(String email, String password, Date dob) {
		super();
		this.email = email;
		this.password = password;
		this.dob = dob;
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
	
	

}
