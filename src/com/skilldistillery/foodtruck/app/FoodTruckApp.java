package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);
	public FoodTruck[] ft;

	// main
	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		System.out.println("FoodTruck Rating App");

		app.run();

	}

	public void run() {

		FoodTruck[] ft = new FoodTruck[5];

		for (int i = 0; i < ft.length; i++) {
			ft[i] = new FoodTruck();

			System.out.print("Enter name of food truck or type \"quit\" to stop entering food trucks: ");
			String name = kb.next();
			FoodTruck truckName = new FoodTruck();
			ft[i].setName(name);
			if (name.equals("quit")) {
				FoodTruckMenu(ft);

			} else {
				System.out.print("Enter food type: ");
				String foodType = kb.next();
				FoodTruck type = new FoodTruck();
				ft[i].setFoodType(foodType);

				System.out.print("Enter Rating(0-3): ");
				int rating = kb.nextInt();
				FoodTruck rating1 = new FoodTruck();
				ft[i].setRating(rating);
			}
		}
		FoodTruckMenu(ft);
	}

	public boolean FoodTruckMenu(FoodTruck[] ft) {
		if (ft[0] == null) {
			System.out.println("exit");
		} else {
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
				listOfTrucks(ft);
				break;
			case 2:
				averageRating(ft);
				break;
			case 3:
				higestRated(ft);
				break;
			case 4:
				quitProgram(ft);
			default:
				System.out.println("Error");
			}

		}
		return FoodTruckMenu(ft);
	}

	// show user the list of trucks user entered
	public void listOfTrucks(FoodTruck[] ft) {
		for (int i = 0; i < ft.length; i++) {
			if (ft != null) {
				System.out.println(ft[i].toString());
				System.out.println();
			}
		}
		System.out.println();
		FoodTruckMenu(ft);
	}

	// calculate average from the list user entered
	public void averageRating(FoodTruck[] ft) {
		double average = 0;
		double total = 0;
		double x = 0;
		int i;
		for (i = 0; i < ft.length; i++) {
			total = total + ft[i].getRating();
			x = i + 1;
			average = total / x;

		}

		System.out.println("Average rating: " + average);
		System.out.println();
		FoodTruckMenu(ft);

	}

	// use if else statement to determine the highest rated truck
	// ...also used the MAX and MIN to substitute highest rated and lowest rated
	public void higestRated(FoodTruck[] ft) {
		double highestRated = ft[0].getRating();
		double lowestRated = ft[0].getRating();
		for (int i = 0; i < ft.length; i++) {
			if (ft[i].getRating() > highestRated) {
				highestRated = ft[i].getRating();
			}
			if (ft[i].getRating() < lowestRated) {
				lowestRated = ft[i].getRating();
			}
		}
		System.out.println("Highest Rated: " + highestRated);
		System.out.println(ft[0].toString());
		System.out.println();
		FoodTruckMenu(ft);
	}

	// end program
	public void quitProgram(FoodTruck[] ft) {
		System.out.println("End of program");
	}
}