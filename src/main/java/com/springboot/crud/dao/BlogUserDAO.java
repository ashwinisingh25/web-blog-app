package com.springboot.crud.dao;

import java.util.List;

import com.springboot.crud.entity.BlogUsers;




public interface BlogUserDAO {
	
	public List<BlogUsers> getAllUsers();
//	
//	public void deleteById(int theId);
//	
	public BlogUsers registerUser(BlogUsers theuser) throws Exception;
//	
	public String userLogin(String userName, String password);
	
	public BlogUsers getUserById(int userid) throws Exception;
	
	
	

}
