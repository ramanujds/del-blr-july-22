package com.del.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.del.foodieapp.model.Recipe;
import com.del.foodieapp.service.IRecipeService;

@RestController
public class RecipeController {
	
	@Autowired
	private IRecipeService service;

	@GetMapping("/recipe/{item-name}")
	public Recipe getRecipe(@PathVariable("item-name") String itemName) {
		return service.findRecipe(itemName);
	}
	
}
