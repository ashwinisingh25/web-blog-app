package com.springboot.crud.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.springboot.crud.entity.CommentPost;

@Repository
public class CommentDAOImpl implements CommentDAO{
	
	private EntityManager entityManager;
	
	
	public CommentDAOImpl(EntityManager entity) {
		
		entityManager = entity;
	}

	@Override
	public List<CommentPost> findAllComment() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<CommentPost> query = currentSession.createQuery("from CommentPost", CommentPost.class);
		List<CommentPost> result = query.getResultList();
		return result;
	}

	@Override
	public void createComment(CommentPost comment) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<CommentPost> query = currentSession.createQuery("from CommentPost", CommentPost.class);
		currentSession.save(comment);	 
	}
	

}
