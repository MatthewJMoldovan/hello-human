package com.mattmoldovan.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class RouteController {
	
	@GetMapping("/")
	public String index(
			@RequestParam(value="firstName", required=false)String firstName,
			@RequestParam(value="lastName", required=false)String lastName,
			@RequestParam(value="times",required=false)Integer times)
	{
		
		if(firstName == null) {
			return "Hello Human";
		}
		
		if(lastName == null) {
			return "Hello " + firstName;
		}
		
		if(times != null) {
			return ("Hello " + firstName +  " " + lastName+" ").repeat(times);
		}
		
		return "Hello " + firstName +  " " + lastName;
		
		
	}
	
	

}
