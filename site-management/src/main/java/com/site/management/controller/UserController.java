package com.site.management.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.site.management.service.UserService;

import jakarta.inject.Inject;

public class UserController {
@Autowired
	private UserService userService;
	
	
	
	public UserController() {
    	 System.out.println("UserController: Object created");
}
    @Inject
	private void init() {
		System.out.println("UserController: init Method called");
		filePath();
		findAll();
	}
	public void filePath() {
		userService.filePath();
	}
	
	public void findAll() {
		userService.findAll();;
	}
}
