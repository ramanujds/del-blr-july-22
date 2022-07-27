package com.del.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.del.foodieapp.model.FoodItem;
import com.del.foodieapp.service.IFoodItemService;

@RestController
public class FoodItemController {
	
	@Autowired
	private IFoodItemService service;

	//@GetMapping(path = "/items/{item-code}", produces = {"application/json","application/xml"})
	@GetMapping(path = "/items/{item-code}")
	public ResponseEntity<FoodItem> getFoodItem(@PathVariable("item-code") long itemCode) {
		FoodItem item = service.getFoodItem(itemCode);	
		if(item==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(item);
	}
	
	@PostMapping(path = "/items/{item-code}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public FoodItem addFoodItem(@RequestBody FoodItem item) {
		return service.addFoodItem(item);
	}
	
	@GetMapping("/items")
	public List<FoodItem> getAllItems(){
		return service.getAllItems();
	}
	
	@DeleteMapping("/items/{item-code}")
	public boolean deleteFoodItem(@PathVariable("item-code") long itemCode) {
		return service.deleteFoodItem(itemCode);
	}
	
	@PutMapping("/items")
	public FoodItem updateFoodItem(@RequestBody FoodItem item) {
		return service.updateFoodItem(item);
	}
	
	@GetMapping("/items/item-name/{item-name}")
	public FoodItem getFoodItemByName(@PathVariable("item-name") String itemName) {
		return service.getItemByName(itemName);	
	}
	
}
