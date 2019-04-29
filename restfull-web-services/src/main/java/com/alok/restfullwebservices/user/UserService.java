package com.alok.restfullwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	
	@Autowired
	private UserDaoServices service;
	
	@GetMapping("/users")
	public List<User> retriveAllUsers()
	{
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveOne(@PathVariable int id)
	{
		return service.findOne(id);
	}

}
