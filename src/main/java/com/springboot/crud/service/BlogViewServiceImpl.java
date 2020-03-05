package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.dao.BlogViewDAO;
import com.springboot.crud.entity.BlogViewEntity;

@Service
public class BlogViewServiceImpl implements BlogViewService {
	
	public BlogViewDAO theBlog;
	
	@Autowired
	public BlogViewServiceImpl(BlogViewDAO theBlogView) {
		
		theBlog = theBlogView;
	}

	@Override
	public List<BlogViewEntity> getALLBlog() {
		
		return theBlog.getALLBlog();
	}

}
