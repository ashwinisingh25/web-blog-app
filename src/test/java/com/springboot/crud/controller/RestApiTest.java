package com.springboot.crud.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.springboot.crud.entity.BlogUsers;
import com.springboot.crud.rest.DataObject;
import com.springboot.crud.rest.UserRegistrationController;
import com.springboot.crud.service.UserService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value=UserRegistrationController.class)
public class RestApiTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	UserService service;
	
	BlogUsers theblog = new BlogUsers("leo", "mckay", "lm@g.com", "pass");
	DataObject dataObject = new DataObject(1, "leo", "mckay", "lm@g.com");

	@Test
	public void registerUser() throws Exception{
		
		Mockito.when(service.registerUser(theblog)).thenReturn(theblog);
		
		String exampleJson = "{\"userid\":\"1\",\"firstname\":\"leo\", \"lastname\":\"mckay\", \"email\":\"lm@g.com\", \"password\":\"pass\"}";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/register")
				.accept(MediaType.APPLICATION_JSON).content(exampleJson).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());	
	}
	
	//get() method test - getAllUsers()
	@Test
	public void getAllUsers() throws Exception {
		List<BlogUsers> blog = new ArrayList<>();
		blog.add(theblog);
		Mockito.when(service.getAllUsers()).thenReturn(blog);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/users").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();
		//MockHttpServletResponse response = result.getResponse();
		String[] Json_example = new String[1];
		Json_example[0]= "[{\"userid\":0,\"firstName\":\"leo\",\"lastName\":\"mckay\",\"email\":\"lm@g.com\",\"password\":\"pass\"}]";
		System.out.println(Json_example[0]);
		assertEquals(Json_example[0], result.getResponse().getContentAsString().toString());
		
		

		
		
		
		
	}
}
