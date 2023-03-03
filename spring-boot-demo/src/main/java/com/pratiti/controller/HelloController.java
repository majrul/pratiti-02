package com.pratiti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//@RequestMapping(path = "/hello", method = RequestMethod.GET)
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to Spring Boot and REST API Development";
	}
}
