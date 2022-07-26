package com.del.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.foodieapp.exception.DuplicateItemException;
import com.del.foodieapp.model.FoodItem;
import com.del.foodieapp.repository.FoodItemJpaRepository;
import com.del.foodieapp.repository.FoodItemRepository;

@Service
public class FoodItemServiceImpl implements FoodItemService{
	
	@Autowired
	private FoodItemJpaRepository repo;
	

	@Override
	public FoodItem addFoodItem(FoodItem item) {
		if(repo.existsById(item.getItemCode())) {
			throw new DuplicateItemException("Item with Code : "+item.getItemCode()+" Already Exists");
		}
		return repo.save(item);
	}

	@Override
	public FoodItem getFoodItem(int itemCode) {
		return repo.findById(itemCode).get();
	}

	@Override
	public FoodItem updateFoodItem(FoodItem item) {
		return repo.save(item);
	}

	@Override
	public void deleteFoodItem(int itemCode) {
		repo.deleteById(itemCode);
	}

	@Override
	public List<FoodItem> getAllItems() {
		return repo.findAll();
	}

	
	
}
