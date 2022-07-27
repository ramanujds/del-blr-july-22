package com.del.foodieapp.service;

import java.util.List;

import com.del.foodieapp.model.FoodItem;

public interface IFoodItemService {

	public FoodItem addFoodItem(FoodItem item);
	public FoodItem getFoodItem(long itemCode);
	public FoodItem updateFoodItem(FoodItem item);
	public boolean deleteFoodItem(long itemCode);
	public List<FoodItem> getAllItems();
	public FoodItem getItemByName(String itemName);
	
}
