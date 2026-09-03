package com.logicalconditionalstatements;

import java.util.Scanner;

public class RestuarantBill {
	String foodItem(String foodItem) {
		return foodItem;
	}

	int qunatityOfFood(int quantity) {
		return quantity;
	}

	double PriceOfItem(double price, int quantity) {
		return price * quantity;
	}

	double calculateGST(double originalPrice, double gst) {
		return (originalPrice * gst) / 100;
	}

	double calculateDiscount(double originalPrice, double discount) {
		return originalPrice * (discount / 100);
	}

	double finalBill(double originalPrice, double gst, double discount) {
		return originalPrice + gst - discount;
	}

	public static void main(String[] args) {
		RestuarantBill a = new RestuarantBill();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Food Item");
		String foodItem = sc.next();
		String foodItems = a.foodItem(foodItem);

		System.out.println("Enter the Quantity");
		int quantity = sc.nextInt();
		int foodQuantity = a.qunatityOfFood(quantity);

		System.out.println("Enter the Price");
		double price = sc.nextDouble();
		double cost = a.PriceOfItem(price, quantity);

		System.out.println("Enter the Gst Percentage");
		double gst = sc.nextDouble();
		double totalGst = a.calculateGST(cost, gst);

		System.out.println("Enter the Discount: ");
		double discount = sc.nextDouble();
		double totalDiscount = a.calculateDiscount(cost, discount);

		double totalBill = a.finalBill(cost, totalGst, totalDiscount);

		a.display(foodItems, foodQuantity, cost, totalGst, totalDiscount, totalBill);

	}

	void display(String foodItems, int foodQuantity, double cost, double totalGst, double totalDiscount,
			double totalBill) {
		System.out.println(
				"*******************************************************************************************************");
		System.out.println("Food Item Name: " + foodItems);
		System.out.println("Quantity of Food: " + foodQuantity);
		System.out.println("Price of the Item : " + cost);
		System.out.println("Total Gst :" + totalGst);
		System.out.println("Total Discount: " + totalDiscount);
		System.out.println("Total Bill: " + totalBill);
		System.out.println(
				"*******************************************************************************************************");

	}

}
