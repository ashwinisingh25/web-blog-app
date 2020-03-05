package com.springboot.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.crud.entity.BlogViewEntity;

@Repository
public class BlogViewDAOImpl implements BlogViewDAO{
	
	public EntityManager entityManager;
	
	@Autowired
	public BlogViewDAOImpl(EntityManager entityM) {
		entityManager = entityM;
	}

	@Override
	@Transactional
	public List<BlogViewEntity> getALLBlog() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<BlogViewEntity> query = currentSession.createQuery("from BlogViewEntity", BlogViewEntity.class);
		List<BlogViewEntity> result = query.getResultList();
		return result;
	}

	
}
