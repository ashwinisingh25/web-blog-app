package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.entity.CommentPost;

public interface CommentPostService {
	public List<CommentPost> findAllComment();
	public void createComment(CommentPost comment);
}
