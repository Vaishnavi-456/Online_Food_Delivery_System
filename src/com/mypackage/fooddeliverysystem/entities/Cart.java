package com.mypackage.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private Map<FoodItem, Integer> items;

	public Cart() {
		items = new HashMap<>();
	}
	
	public void addItem(FoodItem foodItem, int quantity) {
		
		if(items.containsKey(foodItem))
			items.put(foodItem, items.get(foodItem) + quantity);
		else
			items.put(foodItem, quantity);
		
	}
	
	
	public void removeItem(FoodItem foodItem, int quantity) {
		
		items.remove(foodItem);
		
	}
	
	 public Map<FoodItem, Integer> getItems() {
	        return items;
	 }

	 @Override
	    public String toString() {
	        StringBuilder cartContents = new StringBuilder("Cart Contents:\n");
	        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
	            cartContents.append(entry.getKey().getName())
	                        .append(" - Quantity: ")
	                        .append(entry.getValue())
	                        .append("\n");
	        }
	        return cartContents.toString();
	    }
}

	

	
	 

