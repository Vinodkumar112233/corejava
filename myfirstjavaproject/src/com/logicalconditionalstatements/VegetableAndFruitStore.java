package com.logicalconditionalstatements;

import java.util.Scanner;

public class VegetableAndFruitStore {

	public static void main(String[] args) {
		System.out.println("Hii Sir/Madam, Welcome To Our Vegetable And Fruit Store 🍅🍇");

		Scanner sc = new Scanner(System.in);
		String yesno;
		double totalVegetableCost = 0;
		double totalFruitCost = 0;

		do {
			System.out.println("Enter Your Category Sir/Madam : Vegetables/Fruits");
			String category = sc.next().toLowerCase();

			switch (category) {
			case "vegetables" -> {

				do {
					System.out.println("Enter Vegetable :");
					String vegetable = sc.next().toLowerCase();

					double quantity;

					switch (vegetable) {
					case "tomato" -> {
						System.out.println("Tomato per kg is : 50");
						System.out.println("Enter Quantity: ");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalVegetableCost += 50 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}

					}
					case "brinjal" -> {
						System.out.println("Brinjal per kg is : 60");
						System.out.println("Enter Quantity: ");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalVegetableCost += 60 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					case "ladiesfinger" -> {
						System.out.println("Ladies Finger per kg is : 40");
						System.out.println("Enter Quantity: ");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalVegetableCost += 40 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					case "capsium" -> {
						System.out.println("Capscorn per kg is : 70");
						System.out.println("Enter Quantity: ");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalVegetableCost += 70 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					case "potato" -> {
						System.out.println("Potato per kg is : 30");
						System.out.println("Enter Quantity: ");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalVegetableCost += 30 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					default -> {
						System.out.println("Please Enter a Valid vegetable 😊😊😊");
					}

					}

					System.out.println("If You want to Bought More Vegetable Select Yes");
					System.out.println("If You want to Stop Bought  Vegetables Select No");
					yesno = sc.next();

				} while (yesno.equalsIgnoreCase("yes"));
				System.out.println("Your Total Vegetables Price is : " + totalVegetableCost);
			}
			case "fruits" -> {

				do {
					System.out.println("Enter Fruit : ");
					String fruit = sc.next();
					double quantity;

					switch (fruit) {
					case "apple" -> {
						System.out.println("Apple Per Kg is : 100");
						System.out.println("Enter the Quantity");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalFruitCost += 100 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					case "banana" -> {
						System.out.println("Banana Per Dozen is : 70");
						System.out.println("Enter the Quantity");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalFruitCost += 70 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					case "grapes" -> {
						System.out.println("Grapes Per Kg is : 80");
						System.out.println("Enter the Quantity");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalFruitCost += 80 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					case "pineapple" -> {
						System.out.println("Pine Apple Per Kg is : 150");
						System.out.println("Enter the Quantity");
						quantity = sc.nextDouble();
						if (quantity > 0) {
							totalFruitCost += 150 * quantity;
						} else {
							System.out.println("Quantity must be greater than 0.");
						}
					}
					default -> {
						System.out.println("Entered Fruit is Out Of Stock in Our Store 😊😊😊");
					}
					}
					System.out.println("If You want to Bought More Fruits Select Yes");
					System.out.println("If You want to Stop Bought  Fruits Select No");
					yesno = sc.next();

				} while (yesno.equalsIgnoreCase("yes"));
				System.out.println("Your Total Fruits  Price is : " + totalFruitCost);

			}
			}
			System.out.println("If You want to Bought More Vegetable/Fruits  Select Yes");
			System.out.println("If You want to Stop Bought  Vegetables/Fruits Select No");
			yesno = sc.next();

		} while (yesno.equalsIgnoreCase("yes"));
		System.out.println("*******************************************************");

		System.out.println("Your Total Vegetables Price is : " + totalVegetableCost);
		System.out.println("Your Total Fruits  Price is : " + totalFruitCost);

		System.out.println("Your Total Bill  is : " + (totalFruitCost + totalVegetableCost));
		System.out.println("*******************************************************");

		System.out.println("Thank you for choosing our store ❤️");
		sc.close();

	}

}
