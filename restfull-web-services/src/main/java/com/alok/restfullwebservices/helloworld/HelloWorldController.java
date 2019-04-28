package com.alok.restfullwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path="/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world1")
	public String helloWorld1()
	{
		return "hello world 1:";
	}
	
	@GetMapping (path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping (path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBeanWithPath(@PathVariable String  name)	
	{
		return new HelloWorldBean(String.format("Hello World %s !", name));
		
	}
}
