package com.del.foodieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

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
		try {
		Recipe recipe = recipeApiClient.getForObject(recipeApiUrl+itemName, Recipe.class);
		String port = env.getProperty("local.server.port");
		recipe.setServerPort(Integer.parseInt(port));
		System.out.println(recipe);
		return recipe;
		}
		catch (Exception e) {
			System.err.println(e);
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
	}
	
}

