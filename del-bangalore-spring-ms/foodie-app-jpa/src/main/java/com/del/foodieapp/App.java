package com.del.foodieapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.del.foodieapp.model.FoodItem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("foodie-app");
    	
    	EntityManager em = factory.createEntityManager();
    	
    	EntityTransaction tx = em.getTransaction();
    	
    	// Insert new record
    	
//    	FoodItem item1 = new FoodItem(1002, "Burger", 149.0f);
//    	FoodItem item2 = new FoodItem(1003, "Pasta", 199.0f);
//    	FoodItem item3 = new FoodItem(1004, "Dosa", 99.0f);
//    	
//    	tx.begin();
//    	em.persist(item1);
//    	em.persist(item2);
//    	em.persist(item3);
//    	tx.commit();
    	
    	// Fetch an item
    	
//    	FoodItem item = em.find(FoodItem.class, 1002);
//    	
//    	System.out.println(item);
    	
    	// Delete a record
    	
//    	FoodItem item = em.find(FoodItem.class, 1002);
//    	tx.begin();
//    	em.remove(item);
//    	tx.commit();
    	
    	// Update a record
    	
//    	FoodItem item = em.find(FoodItem.class, 1003);
//    	tx.begin();
//    	item.setPrice(249.0f);
//    	tx.commit();
    	
    	// Update a record - Alternate Approach
    	
//    	FoodItem item = new FoodItem(1002, "Burger", 149.0f);
//    	tx.begin();
//    	em.merge(item);
//    	tx.commit();
    	
    	// Finding an item with item name
    	
//    	Query query1 = em.createQuery("from FoodItem where itemName=:itemName");
//    	query1.setParameter("itemName", "Dosa");
//    	FoodItem item = (FoodItem)query1.getSingleResult();
//    	System.out.println(item);
    	
    	// Finding all the records
    	
//    	Query query2 = em.createQuery("from FoodItem");
//    	
//    	List<FoodItem> items = (List<FoodItem>)query2.getResultList();
//    	
//    	items.forEach(System.out::println);
    	
    	
    	// Find the items with a price range
    	// 150<price<250
    	
    	// Using Native Query
    	
    	Query query3 = em.createNativeQuery("select * from food_item",FoodItem.class);
    	
    	List<FoodItem> items = (List<FoodItem>)query3.getResultList();
    	
    	items.forEach(System.out::println);
    	
    	
    }
}
