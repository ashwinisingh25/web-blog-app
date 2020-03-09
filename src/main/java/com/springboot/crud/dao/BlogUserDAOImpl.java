package com.springboot.crud.dao;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.crud.entity.BlogUsers;


@Repository
public class BlogUserDAOImpl implements BlogUserDAO {
	
	private EntityManager entityManager;
	
	private BlogUsers blog;
	
	@Autowired
	public BlogUserDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public BlogUserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	
	}

	@Override
	public List<BlogUsers> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<BlogUsers> theQuery =
				currentSession.createQuery("from BlogUsers", BlogUsers.class);
		
		List<BlogUsers>  result = theQuery.getResultList();
		return result;
	}
//
//	@Override
//	public void deleteById(int theId) {
//		Session current_session = entityManager.unwrap(Session.class);
//		Query thequery = current_session.createQuery("delete from users where userid=:userid");
//		thequery.setParameter("userid", theId);
//		thequery.executeUpdate();
//		
//	}
//
	@Override
	public String  registerUser(BlogUsers theuser) {
		try {
			Session current_session = entityManager.unwrap(Session.class);
			
			current_session.save(theuser);
			return "Successful";
			
			
		}
		catch(ConstraintViolationException ex) {
			return "User already exist";
		}
		
	}
		
		
		
	@Override
	public BlogUsers findById(int userid) {
		Session currentSession = entityManager.unwrap(Session.class);
		BlogUsers theblog = currentSession.get(BlogUsers.class, userid);
		return theblog;
	}

	@Override
	public String userLogin(String email, String password) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<BlogUsers> query = currentSession.createQuery("FROM BlogUsers WHERE email= :email and password= :password", BlogUsers.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		

		try {
			
			if(query.uniqueResult()!=null) {
				return "login successful";
			}
			else{
				return "login failed";
			}	
			
		}
		catch(RuntimeException ex) {
			
		}
		return "login successful";
		
	}		
}
	


