package com.del.foodieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.foodieapp.dto.UserCredentials;
import com.del.foodieapp.model.UserInfo;
import com.del.foodieapp.repository.UserInfoRepository;
import com.del.foodieapp.util.JwtTokenUtil;

@Service
public class UserAuthServiceImpl implements UserAuthService {

	@Autowired
	private UserInfoRepository repo;
	
	@Autowired
	private JwtTokenUtil jwtUtil;
	
	@Override
	public String authenticateUser(UserCredentials creds) {
		boolean isValid = repo.existsByUsernameAndPassword(creds.getUsername(), creds.getPassword());
		if(isValid) {
			return jwtUtil.generateToken(creds.getUsername());
		}
		return null;
	}
	
	@Override
	public UserInfo saveUserInfo(UserInfo user) {
		UserInfo savedUser = repo.save(user);
		savedUser.setPassword("************");
		return savedUser;
	}
	@Override
	public UserInfo getUserByName(String username) {
		return repo.findByUsername(username);
	}
	
}
