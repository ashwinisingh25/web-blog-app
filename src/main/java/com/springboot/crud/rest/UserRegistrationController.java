package com.springboot.crud.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.crud.entity.BlogUsers;
import com.springboot.crud.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRegistrationController {
	
	private UserService userService;
	
	//constructor - injection, passing UserService object as constructor param
	@Autowired
	public UserRegistrationController(UserService theuserService) {
		userService = theuserService;
		
	}
	
	@GetMapping("/greeting")
	public @ResponseBody String greeting() {
		return "Hello World";
	}
	
	@GetMapping("/users")
	public List<BlogUsers> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/register")
	public BlogUsers registerUser(@RequestBody BlogUsers theBlogUser) throws Exception {
		return userService.registerUser(theBlogUser);	
	}
	
	@GetMapping("/findbyId/{userid}")
	public BlogUsers getUserById(@PathVariable int userid) throws Exception {
		
		BlogUsers theblog = userService.getUserById(userid);
		return theblog;	
	}
	
	@PostMapping("/login")
	public void userLogin(@RequestBody BlogUsers theblog) {
		userService.userLogin(theblog.getEmail(), theblog.getPassword());
	}
	
	
}
