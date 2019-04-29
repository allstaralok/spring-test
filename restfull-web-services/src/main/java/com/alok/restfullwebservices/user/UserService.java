package com.alok.restfullwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		User user =  service.findOne(id);
		if(user == null )
			throw new UserNotFoundException("id - " + id);
		
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> setUser(@RequestBody User user)
	{
		User saved = service.save(user);
		
		// /user/{id} 
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
		
		
	}

}
