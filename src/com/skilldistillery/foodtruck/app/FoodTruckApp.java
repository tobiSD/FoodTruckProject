package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();

	}

	private void run() {

		int MAX_TRUCKS[];
		MAX_TRUCKS = new int[5];

		System.out.println("FoodTruck Rating App");

		FoodTruck[] ft = new FoodTruck[5];

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
		kb.nextInt();
		// choiceMenu();

	}

	public void choiceMenu(FoodTruck t, FoodTruck[] truck, int numTrucks) {
		// use switch for each Food Truck menu option
		int select = kb.nextInt();
		switch (select) {
		case 1:
			// keep count of the trucks user typed
			// ...if user typed 3 trucks only three trucks will print out
			for (int i = 0; i < truck.length; i++) {

//				truck[numTrucks] = t;
//				numTrucks++;
				System.out.println("Existing food trucks: " + i);

			}

			break;
//		case 2:
//			//calculate average
//			System.out.println("Average Score: ");
//			int rating = 0;
//			for (int i =0, i<rating; i++){
//	 			}
//			double average;
//			average = (r1 +r2 + r3)/3 ;
//			System.out.print(average);
//			break;
//		case 3:
		// highest rating
		default:
			System.out.println("Error");
		}
	}

}

// declare array
//FoodTruck ftArray[]= new FoodTruck[4];
//private int counter;

//array of foodTruck
//foodTruck ft =newFoodTruck();
//Scanner kb = new Scanner (System.in)

//ft.truckInput(kb);
//ft.truckmenu(kb);