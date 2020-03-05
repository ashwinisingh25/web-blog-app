package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.entity.BlogUsers;

public interface UserService {

	public List<BlogUsers> findAll();
//	
//	public void deleteById(int theId);
//	
	public String registerUser(BlogUsers theuser);
	
	public String userLogin(String userName, String password);
	
	public BlogUsers findById(int userid);
	
	
}
