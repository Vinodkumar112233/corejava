package com.languagefundamentals;

public class Testdemo9 {
	String customerName;
	int customerId;
	String source;
	String destination;
	int weight;
	int deliveryAmount;
	
	static int totalCouriers;
	static int totalWeight;
	static int totalAmountCollected;
	static int priceperkg = 100;
	
	
	static {
		System.out.println("Welcome to Quickship Courier!");
	}
	
	void bookCourier() {
		deliveryAmount = weight * priceperkg;
		totalCouriers ++;
		totalWeight += weight;
		totalAmountCollected += deliveryAmount;
		System.out.println("Total Delivery Amount: "+deliveryAmount);
		System.out.println("Total couriers:"+totalCouriers);
		System.out.println("Total Weight: "+totalWeight);
		System.out.println("Total Amount Collected: "+totalAmountCollected);
		System.out.println("Successfully Booked");
	}
		
	void displayCourierdetails() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Id: "+customerId);
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);
		System.out.println("Weight:"+weight);
		System.out.println("Delivery Amount: "+deliveryAmount);
		
		
		
	}
	
	static void displayTodaysCollection() {
		System.out.println("Total Couriers Booked "+totalCouriers);
		System.out.println("Total Weight: "+totalWeight);
		System.out.println("Total Amount Collected: "+totalAmountCollected);
	}
	
	
	

	public static void main(String[] args) {
		Testdemo9 v1 = new Testdemo9();
		Testdemo9 v2 = new Testdemo9();
		
		v1.customerName = "vinod";
		v1.customerId = 123;
		v1.source = "kakinada";
		v1.destination = "Hyderabad";
		v1.weight = 50;
		v1.deliveryAmount = 5000;
		
		
		v2.customerName = "Hemanth";
		v2.customerId = 143;
		v2.source = "kakinada";
		v2.destination = "Hyderabad";
		v2.weight = 70;
		v2.deliveryAmount = 1000;
		
		v1.bookCourier();
		
		System.out.println("--------------------------------------");
		
		v1.displayCourierdetails();
		
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
        v2.bookCourier();
		
		System.out.println("--------------------------------------");
		
		v2.displayCourierdetails();
		
		System.out.println("--------------------------------------");
		
		displayTodaysCollection();
		
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		
		

	}

}
