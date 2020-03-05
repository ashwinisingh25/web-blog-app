package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.entity.BlogPost;

public interface BlogPostService {
	
	public List<BlogPost> findPost();
	
	public void createPost(BlogPost theBlog);

}
