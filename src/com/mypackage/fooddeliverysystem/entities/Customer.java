package com.mypackage.fooddeliverysystem.entities;

public class Customer extends User {
	
	private Cart cart;

	public Customer(int userId, String userName, long contactNo) {
		super(userId, userName, contactNo);
		 this.cart = new Cart();
	}
	
	public Cart getCart() {
		return cart;
	}

	 @Override
	    public String toString() {
	        return super.toString() + "\nCustomer's Cart: " + cart;
	 }
	
	
	

}
