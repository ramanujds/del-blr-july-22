package com.del.foodieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.foodieapp.model.Recipe;

@Service
public class RecipeServiceImpl implements IRecipeService {
	
	@Autowired
	private RestTemplate recipeApiClient;
	
	@Autowired
	private Environment env;
	
	@Value("${recipeApiUrl}")
	private String recipeApiUrl;

	@Override
	public Recipe findRecipe(String itemName) {
		
		System.out.println(recipeApiUrl);
		Recipe recipe = recipeApiClient.getForObject(recipeApiUrl+itemName, Recipe.class);
		String port = env.getProperty("local.server.port");
		recipe.setServerPort(Integer.parseInt(port));
		System.out.println(recipe);
		return recipe;
	}
	
}

