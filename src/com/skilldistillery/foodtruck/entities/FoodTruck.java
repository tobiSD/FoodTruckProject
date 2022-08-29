package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	// private fields
	private int id;
	private String name;
	private String foodType;
	private int rating;
	private int nextTruckId = 1;

	// no arg constructor
	public FoodTruck() {

	}

	// Constructor
	public FoodTruck(int id, String name, String foodType, int rating) {
		this.setId(id);
		this.setName(name);
		this.setFoodType(foodType);
		this.setRating(rating);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		id = nextTruckId;
		nextTruckId++;
	}

	// getters and setters
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
		return "ID= " + nextTruckId + " Name = " + name + " Foodtype= " + foodType + " Rating= " + rating;
	}

}
