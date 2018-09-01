package com.rayweb.service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String message() {
		return "Hello from " + instance;
	}

}
