package com.del.foodieapp.service;

import java.util.List;

import com.del.foodieapp.model.FoodItem;

public interface FoodItemService {

	public FoodItem addFoodItem(FoodItem item);
	public FoodItem getFoodItem(int itemCode);
	public FoodItem updateFoodItem(FoodItem item);
	public void deleteFoodItem(int itemCode);
	public List<FoodItem> getAllItems();
	
}
