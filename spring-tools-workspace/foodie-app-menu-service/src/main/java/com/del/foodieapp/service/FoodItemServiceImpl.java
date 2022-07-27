package com.del.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.foodieapp.model.FoodItem;
import com.del.foodieapp.model.Recipe;
import com.del.foodieapp.repository.IFoodItemRepository;

@Service
public class FoodItemServiceImpl implements IFoodItemService {
	
	@Value("${recipeServiceUrl}")
	private String recipeServiceUrl;
	
	@Autowired
	private IFoodItemRepository repo;
	
	@Autowired
	RestTemplate recipeClinet;

	@Override
	public FoodItem addFoodItem(FoodItem item) {
		FoodItem savedItem = repo.save(item);
		Recipe recipe = getRecipe(item.getItemName());
		savedItem.setRecipe(recipe);
		return savedItem;
	}

	@Override
	public FoodItem getFoodItem(long itemCode) {
		FoodItem savedItem =  repo.findById(itemCode).orElse(null);
		Recipe recipe = getRecipe(savedItem.getItemName());
		savedItem.setRecipe(recipe);
		return savedItem;
	}

	@Override
	public FoodItem updateFoodItem(FoodItem item) {
		return repo.save(item);
	}

	@Override
	public boolean deleteFoodItem(long itemCode) {
		repo.deleteById(itemCode);
		return !repo.existsById(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		return repo.findAll();
	}

	@Override
	public FoodItem getItemByName(String itemName) {
		FoodItem savedItem = repo.searchByName(itemName);
		Recipe recipe = getRecipe(savedItem.getItemName());
		savedItem.setRecipe(recipe);
		return savedItem;
	}
	
	public Recipe getRecipe(String itemName) {
		return recipeClinet.getForObject(recipeServiceUrl+itemName, Recipe.class);
	}
	
}
