package com.del.foodieapp.model;

import java.util.List;

import lombok.Data;
@Data
public class Recipe {

	private List<Meal> meals;
	
	private int serverPort;
	
}
