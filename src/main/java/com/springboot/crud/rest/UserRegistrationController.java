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
	public List<BlogUsers> findAll() {
		return userService.findAll();
	}
//	
	@PostMapping("/register")
	public String registerUser(@RequestBody BlogUsers theBlogUser) {
		return userService.registerUser(theBlogUser);	
	}
	
	@GetMapping("/findbyId/{userid}")
	public BlogUsers findbyId(@PathVariable int userid) {
		return userService.findById(userid);
	}
	
	@PostMapping("/login")
	public void userLogin(@RequestBody BlogUsers theblog) {
		userService.userLogin(theblog.getEmail(), theblog.getPassword());
	}
	
	
}
