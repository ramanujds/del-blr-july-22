package com.del.foodieapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.del.foodieapp.model.FoodItem;

@Repository
public class FoodItemRepositoryImpl implements FoodItemRepository {

	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public FoodItem saveFoodItem(FoodItem item) {
		return em.merge(item);
	}

	
	@Transactional
	public FoodItem getFoodItem(int itemCode) {
		FoodItem item = em.find(FoodItem.class, itemCode);
		return item;
	}

	
	@Transactional
	public FoodItem updateFoodItem(FoodItem item) {
		return em.merge(item);
	}

	
	@Transactional
	public void deleteFoodItem(int itemCode) {
		FoodItem item = em.find(FoodItem.class, itemCode);
		em.remove(item);

	}

	
	@Transactional
	public List<FoodItem> getAllItems() {
		Query query = em.createQuery("from FoodItem");
		List<FoodItem> items = query.getResultList();
		return items;
	}

}
