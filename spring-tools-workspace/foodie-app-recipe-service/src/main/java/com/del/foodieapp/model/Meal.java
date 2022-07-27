package com.del.foodieapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Meal {

	 @JsonProperty("idMeal")
	 private long mealId;
	 @JsonProperty("strMeal")
     private String mealName;
     @JsonProperty("strCategory")
     private String category;
     @JsonProperty("strArea")
     private String region;
     @JsonProperty("strInstructions")
     private String instructions;
     @JsonProperty("strMealThumb")
     private String mealThumb;
	
     
}
