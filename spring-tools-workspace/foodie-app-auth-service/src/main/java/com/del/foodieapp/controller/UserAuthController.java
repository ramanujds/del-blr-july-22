package com.del.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.foodieapp.dto.UserCredentials;
import com.del.foodieapp.model.UserInfo;
import com.del.foodieapp.service.UserAuthService;
import com.del.foodieapp.util.JwtTokenUtil;

@RestController
@RequestMapping("/authenticate")
public class UserAuthController {

	@Autowired
	private UserAuthService service;
	
	
	
	@PostMapping
	public UserInfo registerUser(@RequestBody UserInfo user) {
		return service.saveUserInfo(user);
	}
	
	@PostMapping("/login")
	public String authenticateUser(@RequestBody UserCredentials creds) {
		
		return service.authenticateUser(creds);
	}
	
}
