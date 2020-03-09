package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.entity.BlogUsers;

public interface UserService {

	public List<BlogUsers> getAllUsers();

	public BlogUsers registerUser(BlogUsers theuser) throws Exception;
	
	public String userLogin(String userName, String password);
	
	public BlogUsers getUserById(int userid) throws Exception;

	
}
