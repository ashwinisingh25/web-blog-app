package com.springboot.crud.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.crud.entity.BlogViewEntity;
import com.springboot.crud.service.BlogViewService;

@RestController
@RequestMapping("/api")
public class BlogViewRestController {
	
	public BlogViewService theBlogViewService;
	
	public BlogViewRestController(BlogViewService blog) {
		theBlogViewService = blog;
	}
	
	//add methods
	@GetMapping("/blogview")
	public List<BlogViewEntity> getAllBlog(){
		return theBlogViewService.getALLBlog();
	}
	

}
