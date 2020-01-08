package com.infotech.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/welcome")
	public String welcome() {
		return "Welcome to spring boot v8";
		
	}
	
	@GetMapping(value = "/newPoint")
	public String added() {
		return "New point added in the latest version";
		
	}
	
	@GetMapping(value = "/latest")
	public String addedanother() {
		return "latest version for kubernets";
		
	}
}
