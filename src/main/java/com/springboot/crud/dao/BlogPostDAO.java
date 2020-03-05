package com.springboot.crud.dao;

import java.util.List;

import com.springboot.crud.entity.BlogPost;

public interface BlogPostDAO {
	
	public List<BlogPost> findPost();
	
	public void createPost(BlogPost theBlog);

}
