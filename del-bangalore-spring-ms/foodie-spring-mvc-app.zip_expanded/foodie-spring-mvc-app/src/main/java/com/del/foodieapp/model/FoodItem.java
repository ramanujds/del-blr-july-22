package com.del.foodieapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "food_item")
public class FoodItem {

	@Id
	@Column(name = "item_code")
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int itemCode;
	@Column(name = "item_name", length = 50, nullable = false)
	private String itemName;
	private float price;
	
}
