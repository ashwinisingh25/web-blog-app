package com.springboot.crud.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springboot.crud.dao.BlogUserDAO;
import com.springboot.crud.entity.BlogUsers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class BlogUserServiceTest {
	
	@Mock
	BlogUserDAO theBlogUserDAO;
	
	@InjectMocks
	private UserService theUserService = new UserServiceImpl(theBlogUserDAO);
	
//	@Autowired
//	private UserService theUserService;
//	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFindById() {
		when(theBlogUserDAO.findById(1)).thenReturn(new BlogUsers("Lokesh", "Gupta", "lgupta@gmail.com", "pass"));
		BlogUsers blog = theUserService.findById(1);
		System.out.println(blog.getLastName());
		assertEquals("Gupta", blog.getLastName() );	
		assertEquals("Lokesh", blog.getFirstName() );	
		assertEquals("lgupta@gmail.com", blog.getEmail() );	
		assertEquals("pass", blog.password);	
		
	}
	

}
