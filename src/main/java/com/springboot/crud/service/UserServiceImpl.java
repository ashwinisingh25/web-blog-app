package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.crud.dao.BlogUserDAO;
import com.springboot.crud.entity.BlogUsers;

@Service
public class UserServiceImpl implements UserService {
	
	private BlogUserDAO userDAO;
	
	@Autowired
	public UserServiceImpl(BlogUserDAO theuserdao) {
		userDAO = theuserdao;
	}
	

	@Override
	@Transactional
	public List<BlogUsers> getAllUsers() {
		return userDAO.getAllUsers();
		
	}

	@Override
	public BlogUsers registerUser(BlogUsers theuser) throws Exception {
		return userDAO.registerUser(theuser);
	}
	
	
	@Override
	public BlogUsers getUserById(int userid) throws Exception {
		return userDAO.getUserById(userid);
	}
	


	@Override
	public String userLogin(String userName, String password) {
		return userDAO.userLogin(userName, password);
		
	}


	
}
