package com.languagefundamentals;

public class Testdemo16 {
	static String storeName = "abc";
	String customerName;
	String productName;
	double price;
	int quantity;
	double discount_price;

	double totalPrice;

	void addProduct(String productName, double price, int quantity) {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("--------------------------------------------------");
	}

	void calculateTotal(double discount) {
//		formulas : Total price = price X quantity 
//		           Discount = (totalPrice x discount)/100

		totalPrice = (price * quantity);
		discount_price = (totalPrice * discount) / 100;
		totalPrice = totalPrice - discount_price;

		System.out.println("Total Price: " + totalPrice);
		System.out.println("--------------------------------------------------");
	}

	void displayCart() {
		System.out.println("Store Name: " + storeName);
		System.out.println("customer Name: " + customerName);
		System.out.println("Product Name: " + productName);
		System.out.println("Final Amount: " + totalPrice);
	}

	public static void main(String[] args) {
		Testdemo16 v1 = new Testdemo16();
		v1.customerName = "hemanth";
		v1.productName = "mobile";
		v1.price = 20000;
		v1.quantity = 2;
		v1.addProduct("mobile", 20000, 2);
		v1.calculateTotal(5);
		v1.displayCart();
		System.out.println("---------------------------------------------------");

		System.out.println("---------------------------------------------------------");

		Testdemo16 v2 = new Testdemo16();
		v2.customerName = "Vinod";
		v2.productName = "Laptop";
		v2.price = 40000;
		v2.quantity = 2;
		v2.addProduct("Laptop", 40000, 2);
		v2.calculateTotal(5);
		v2.displayCart();

	}

}
