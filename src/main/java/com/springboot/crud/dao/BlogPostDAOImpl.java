package com.springboot.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.crud.entity.BlogPost;
import com.springboot.crud.entity.BlogUsers;

import javax.persistence.EntityManager;

@Repository
public class BlogPostDAOImpl implements BlogPostDAO {
	
	private EntityManager entityManager;
	
	public BlogPost theBlogPost;
	
	@Autowired
	public BlogPostDAOImpl(EntityManager theEntity) {
		entityManager = theEntity;
	}

	@Override
	public List<BlogPost> findPost() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<BlogPost> query = currentSession.createQuery("from BlogPost", BlogPost.class);
		List<BlogPost>  result = query.getResultList();
		return result;
	}

	@Override	
	@Transactional
	public void createPost(BlogPost theBlog) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(theBlog);
		
	}

}
