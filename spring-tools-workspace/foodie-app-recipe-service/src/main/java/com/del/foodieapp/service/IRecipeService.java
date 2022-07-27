package com.del.foodieapp.service;

import com.del.foodieapp.model.Recipe;

public interface IRecipeService {

	Recipe findRecipe(String itemName);
	
}
