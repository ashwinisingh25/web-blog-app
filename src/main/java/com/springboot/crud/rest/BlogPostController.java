package com.springboot.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.entity.BlogPost;
import com.springboot.crud.entity.BlogUsers;
import com.springboot.crud.service.BlogPostService;
import com.springboot.crud.service.BlogPostServiceImpl;

@RestController
@RequestMapping("/api")
public class BlogPostController {
	
	public BlogPostService theBlogService;
	
	@Autowired
	public BlogPostController(BlogPostService theBlog) {
		theBlogService = theBlog;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/findPosts")
	public List<BlogPost> findAllPosts(){
		return theBlogService.findPost();
	}
	
	@PostMapping("/createBlog")
	public void createBlog(@RequestBody BlogPost theblog) {
		theBlogService.createPost(theblog);
		
	}
	
	

}
