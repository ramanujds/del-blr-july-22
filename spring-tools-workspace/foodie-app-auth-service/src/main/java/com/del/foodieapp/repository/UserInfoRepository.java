package com.del.foodieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.foodieapp.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	UserInfo findByUsername(String username);
	
	boolean existsByUsernameAndPassword(String username, String password);
	
}
