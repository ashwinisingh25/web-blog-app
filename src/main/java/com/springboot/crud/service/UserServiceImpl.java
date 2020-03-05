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
	public List<BlogUsers> findAll() {
		return userDAO.findAll();
		
	}
//
//	@Override
//	@Transactional
//	public void deleteById(int theId) {
//		userDAO.deleteById(theId);
//	}
//
	@Override
	public String registerUser(BlogUsers theuser) {
		return userDAO.registerUser(theuser);
	

	}
	
	
	@Override
	public BlogUsers findById(int userid) {
		return userDAO.findById(userid);
	}
	


	@Override
	public String userLogin(String userName, String password) {
		return userDAO.userLogin(userName, password);
		
	}

}
