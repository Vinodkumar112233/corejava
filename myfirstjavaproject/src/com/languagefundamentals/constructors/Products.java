package com.languagefundamentals.constructors;


//Create a Product class with default price 0.
public class Products {
	String productName;
	String quantity;
	int price;

	Products() {
		productName = "Mobile";
		quantity = "800g";
		int price;
	}

	public static void main(String[] args) {
		Products v1 = new Products();
		v1.productInfo();

	}

	void productInfo() {
		System.out.println("Product Name: " + productName);
		System.out.println("Product Quantity: " + quantity);
		System.out.println("Product Price: " + price);
	}

}
