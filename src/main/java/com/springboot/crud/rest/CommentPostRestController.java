package com.springboot.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.service.CommentPostService;
import com.springboot.crud.entity.CommentPost;

@RestController
@RequestMapping("/api")
public class CommentPostRestController {
	
	public CommentPostService commentPostService;
	
	@Autowired
	public CommentPostRestController(CommentPostService theCommentPS) {
		commentPostService = theCommentPS;
	}
	
	//rest methods
	
	@GetMapping("/allcomments")
	public List<CommentPost> findAllComments(){
		return commentPostService.findAllComment();
	}
	
	@PostMapping("/createcomment")
	public void createComment(@RequestBody CommentPost comment) {
		commentPostService.createComment(comment);
		
	}
	

}
