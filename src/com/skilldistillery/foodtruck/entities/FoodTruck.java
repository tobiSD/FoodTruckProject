package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	private int id;
	private String name;
	private String foodType;
	private int rating;
	
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(int id, String name, String foodType, int rating) {
		this.id = id;
		this.setName(name);
		this.setFoodType(foodType);
		this.setRating(rating);
	}

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

	
}



//id, name, foddType,rating 1-3
	//constructors
	//setter and getter 
	//tostring