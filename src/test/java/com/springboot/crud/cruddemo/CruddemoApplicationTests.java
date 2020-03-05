package com.springboot.crud.cruddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

import org.hibernate.query.criteria.internal.expression.SearchedCaseExpression.WhenClause;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.crud.dao.BlogUserDAO;
import com.springboot.crud.entity.BlogUsers;
import com.springboot.crud.service.UserService;
import com.springboot.crud.service.UserServiceImpl;
import static org.mockito.Mockito.when;

import org.aspectj.lang.annotation.Before;



@SpringBootTest
class CruddemoApplicationTests {
	
	
	@Mock 
	BlogUserDAO blogUserDAO;
	
	@InjectMocks
	private UserService userService = new UserServiceImpl(blogUserDAO);
	
//	@DisplayName("Test Spring @Autowired Inetgration")
//	@Test
//	void testGet() {
//		String str = "Initial Test Successful";
//		assertEquals("Initial Test Succeessful ",str);
//		
//	}
//	
	@Test
	void getTest() {
		String str = "hello";
		assertEquals("hello", str);
	}
	
//	@BeforeEach
//	public void init() {
//		
//	}
	
	
	@Test
	void sampletest() {
		String username = "landrews@gmail.com";
		String password = "Password";
		when(userService.userLogin(username, password)).thenReturn("successful");
		assertEquals(userService.userLogin(username, password), "success");
			
	}
	
	
	
	

	

}
