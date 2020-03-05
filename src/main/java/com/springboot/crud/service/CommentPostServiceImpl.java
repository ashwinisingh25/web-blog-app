package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.dao.CommentDAO;
import com.springboot.crud.entity.CommentPost;

@Service
public class CommentPostServiceImpl implements CommentPostService {
	
	public CommentDAO theCommentDAO;
	
	@Autowired
	public CommentPostServiceImpl(CommentDAO commentDAO) {
		theCommentDAO = commentDAO;
	}

	@Override
	public List<CommentPost> findAllComment() {
		return theCommentDAO.findAllComment();
		
	}

	@Override
	public void createComment(CommentPost comment) {
		theCommentDAO.createComment(comment);

	}

}
