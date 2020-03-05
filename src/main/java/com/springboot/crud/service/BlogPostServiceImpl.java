package com.springboot.crud.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.crud.dao.BlogPostDAO;
import com.springboot.crud.entity.BlogPost;

@Service
public class BlogPostServiceImpl implements BlogPostService{
	
	private BlogPostDAO blogPostDAO;
	
	//constructor injection
	@Autowired
	public BlogPostServiceImpl(BlogPostDAO theblog) {
		blogPostDAO = theblog;
	}
	
	@Override
	@Transactional 
	public List<BlogPost> findPost() {
		return blogPostDAO.findPost();
		
	}

	@Override
	public void createPost(BlogPost theblog) {
		 blogPostDAO.createPost(theblog);		
	}
	
	
	

}
