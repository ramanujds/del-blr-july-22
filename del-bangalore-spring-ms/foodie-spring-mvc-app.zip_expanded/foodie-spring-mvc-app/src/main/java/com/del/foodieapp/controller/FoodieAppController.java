package com.del.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.del.foodieapp.model.FoodItem;
import com.del.foodieapp.service.FoodItemService;

@Controller
public class FoodieAppController implements ErrorController  {

	@Autowired
	private FoodItemService service;
	
	@PostMapping("/add-item")
	public String addFoodItem(@ModelAttribute FoodItem item, Model m) {
		FoodItem savedItem = service.addFoodItem(item);
		m.addAttribute("item", savedItem);
		return "show-item.jsp";
	}
	
	@RequestMapping("/error")
	public String handleError() {
		return "error.jsp";
	}
	
	
	
	
}
