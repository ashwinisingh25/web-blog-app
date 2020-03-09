package com.springboot.crud.rest;

import com.springboot.crud.entity.BlogUsers;

public class DataObject {
	
	private int userid;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String email;
	
	public DataObject() {
		// TODO Auto-generated constructor stub
	}
	
	BlogUsers blogUser;
	
	public DataObject(BlogUsers theblog) {
		blogUser= theblog;
	}
	
	
	
	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public DataObject(int userid, String FirstName, String LastName, String Email) {
		this.userid = userid;
		this.firstName = FirstName;
		this.lastName = LastName;
		this.email = Email;
	}

}
