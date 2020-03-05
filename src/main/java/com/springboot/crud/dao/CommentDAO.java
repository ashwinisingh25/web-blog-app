package com.springboot.crud.dao;

import java.util.List;

import com.springboot.crud.entity.CommentPost;

public interface CommentDAO {
	
	public List<CommentPost> findAllComment();
	
	public void createComment(CommentPost comment);
	
}
