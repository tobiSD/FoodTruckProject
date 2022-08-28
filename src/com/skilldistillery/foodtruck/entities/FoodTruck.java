package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	//private fields
	private int id;
	private String name;
	private String foodType;
	private int rating;
	
	
	//no arg constructor
	public FoodTruck() {
		
	}
	
	//Constructor
	public FoodTruck(int id, String name, String foodType, int rating) {
		this.id = id;
		this.setName(name);
		this.setFoodType(foodType);
		this.setRating(rating);
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Name = "+name+ " " +foodType+ " " + rating;
	}
	
}
