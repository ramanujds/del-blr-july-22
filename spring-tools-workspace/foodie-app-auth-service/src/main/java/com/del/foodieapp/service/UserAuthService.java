package com.del.foodieapp.service;

import com.del.foodieapp.dto.UserCredentials;
import com.del.foodieapp.model.UserInfo;

public interface UserAuthService {

	public String authenticateUser(UserCredentials creds);
	
	public UserInfo saveUserInfo(UserInfo user);
	
	public UserInfo getUserByName(String username);
	
}
