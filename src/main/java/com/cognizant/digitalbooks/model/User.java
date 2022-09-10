package com.cognizant.digitalbooks.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private Address address;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}

