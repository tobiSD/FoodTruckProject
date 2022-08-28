package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);
	private FoodTruck[] truck;

	int MAX_TRUCKS = 1;

	FoodTruck[] ft = new FoodTruck[MAX_TRUCKS]; // change to 5
	int count =0;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		System.out.println("FoodTruck Rating App");
		app.run();

	}

	private void run() {

		for (int i = 0; i < ft.length; i++) {

			System.out.print("Enter name of food truck: ");
			String name = kb.next();
			FoodTruck truck = new FoodTruck();
			truck.setName(name);

			if (name == "quit") {
				// exit
			} else {
				System.out.print("Enter food type: ");
				String foodType = kb.next();
				FoodTruck type = new FoodTruck();
				type.setFoodType(foodType);

				System.out.print("Enter Rating(0-3): ");
				int rating = kb.nextInt();
				FoodTruck truck1 = new FoodTruck();
				truck1.setRating(rating);
				// after input see the menu
			}
		}
		FoodTruckMenu();
	}

	public void FoodTruckMenu() {
		// see menu
		System.out.println();
		System.out.println("Choose form the following options:");
		System.out.println("1. List of all exisitng foodtrucks");
		System.out.println("2. See the average rating of food trucks. ");
		System.out.println("3. Display the highest-rated food truck. ");
		System.out.println("4. Quit the program.");
		int choice = kb.nextInt();
		switch (choice) {
		case 1:
			listOfTrucks(truck);
			break;
		case 2:
			// calculate average
			break;
		case 3:
			// highest rating
			break;
		default:
			System.out.println("Error");
		}
	}

	public void listOfTrucks(FoodTruck[] truck) {
		for (int i = 0; i < truck.length; i++) {
			System.out.println(i);
		}
	}
}