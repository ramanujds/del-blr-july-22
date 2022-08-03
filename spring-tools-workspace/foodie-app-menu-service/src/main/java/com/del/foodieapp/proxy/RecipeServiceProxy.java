package com.del.foodieapp.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.del.foodieapp.model.Recipe;

@FeignClient(name = "FOODIE-APP-RECIPE-SERVICE", value = "FOODIE-APP-RECIPE-SERVICE")
public interface RecipeServiceProxy {

	
	@GetMapping("/recipe/{item-name}")
	public Recipe getRecipe(@PathVariable("item-name") String itemName);
	
}
