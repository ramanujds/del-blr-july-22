package com.del.foodieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.del.foodieapp.model.FoodItem;

public interface IFoodItemRepository extends JpaRepository<FoodItem, Long> {

	@Query("from FoodItem where itemName=:itemName")
	public FoodItem searchByName(@Param("itemName") String itemName);
	
	public boolean existsByItemName(String itemName);
	
	
}
