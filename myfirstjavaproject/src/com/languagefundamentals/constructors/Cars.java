package com.languagefundamentals.constructors;

public class Cars {
	String model;
	String brand;
	double price;
	
	Cars(){
		model = "FZ500";
		brand = "Unknown";
		price = 90000;
	}

	public static void main(String[] args) {
		Cars v1 = new Cars();
		v1.carInfo();

	}
	void carInfo() {
		System.out.println("Model of the Car:"+model);
		System.out.println("Brand of the Car: "+brand);
		System.out.println("Price of the Car: "+price);
	}

}
