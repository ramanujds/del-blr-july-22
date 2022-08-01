package com.del.foodieapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class UserInfo {
	
	@Id
	private int userId;
	@Column(unique = true)
	private String username;
	private String password;
	private String email;
	
}
