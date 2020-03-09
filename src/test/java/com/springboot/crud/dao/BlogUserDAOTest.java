package com.springboot.crud.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.crud.entity.BlogUsers;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class BlogUserDAOTest {
	

	
	@Mock
	private EntityManager theEntityManager;
	
	@Autowired
	private BlogUserDAOImpl theBlogUserDAO = new BlogUserDAOImpl(theEntityManager);
	
	
	
	@Test
	public void testregisterUser() {
		BlogUsers theblog = new BlogUsers();
		theblog.setFirstName("Andre");
		theblog.setLastName("Neil");
		BlogUsers user = theBlogUserDAO.registerUser(theblog);
		
		assertEquals( "Andre", user.getFirstName());
			
		
	}
	
	
//	@Test
//	public void testfindAll(){
//		
//		
//		theBlogUserDAO.registerUser(theblog);
////		
////		
////	
////		
////		List<BlogUsers> users = theBlogUserDAO.findAll();
////		System.out.println(users.get(0).getEmail());		
////		assertEquals("Andrew", users.get(0).getFirstName());
//////		
//////		assertEquals(13 , theBlogUserDAO.getUserid());
//////		assertEquals("Andrew", theblog.getFirstName());
//////		assertEquals("Morrison", theblog.getLastName());
//////		assertEquals("amorrison@gmail.com", theblog.getEmail());
//////		assertEquals("pass@123", theblog.getPassword());
////		
////	}
	
	
	
	

}
