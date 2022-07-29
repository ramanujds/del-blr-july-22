package com.del.foodieapp.controller;

import java.time.LocalDate;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.del.foodieapp.model.FoodItem;
import com.del.foodieapp.model.ItemType;
import com.del.foodieapp.service.IFoodItemService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/menu")
public class FoodItemController {
	
	@Autowired
	private IFoodItemService service;

	//@GetMapping(path = "/items/{item-code}", produces = {"application/json","application/xml"})
	@GetMapping(path = "/{item-code}")
	@CircuitBreaker(fallbackMethod = "getFoodItemFallback", name = "recipe-service-cb")
	public ResponseEntity<FoodItem> getFoodItem(@PathVariable("item-code") long itemCode) {
		FoodItem item = service.getFoodItem(itemCode);	
		if(item==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(item);
	}
	
	
	public ResponseEntity<FoodItem> getFoodItemFallback(@PathVariable("item-code") long itemCode, Exception ex) {
		FoodItem item = new FoodItem(itemCode, "Chocolate", 100, ItemType.VEG, LocalDate.now(), null);	
		System.err.println(ex);
		return ResponseEntity.ok(item);
	}
	
	@PostMapping(path = "/{item-code}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public FoodItem addFoodItem(@RequestBody FoodItem item) {
		return service.addFoodItem(item);
	}
	
	@GetMapping
	public List<FoodItem> getAllItems(){
		return service.getAllItems();
	}
	
	@DeleteMapping("/{item-code}")
	public boolean deleteFoodItem(@PathVariable("item-code") long itemCode) {
		return service.deleteFoodItem(itemCode);
	}
	
	@PutMapping
	public FoodItem updateFoodItem(@RequestBody FoodItem item) {
		return service.updateFoodItem(item);
	}
	
	@GetMapping("/item-name/{item-name}")
	public FoodItem getFoodItemByName(@PathVariable("item-name") String itemName) {
		return service.getItemByName(itemName);	
	}
	
}
