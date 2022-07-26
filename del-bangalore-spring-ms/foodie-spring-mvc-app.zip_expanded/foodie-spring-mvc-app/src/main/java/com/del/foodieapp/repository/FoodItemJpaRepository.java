package com.del.foodieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.foodieapp.model.FoodItem;

public interface FoodItemJpaRepository extends JpaRepository<FoodItem, Integer> {

}
