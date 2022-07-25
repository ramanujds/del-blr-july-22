package com.del.foodieapp.repository;

import java.util.List;

import com.del.foodieapp.model.FoodItem;

public interface FoodItemRepository {

	public FoodItem saveFoodItem(FoodItem item);
	public FoodItem getFoodItem(int itemCode);
	public FoodItem updateFoodItem(FoodItem item);
	public void deleteFoodItem(int itemCode);
	public List<FoodItem> getAllItems();
	
	
}
