package com.oops;
//1. Create a parent class Device with private fields brand and price. Implement getters, setters, and a displaydetails() method.
//a). Create two child classes Laptop and Mobile extending Device
//
//class Laptop:-
//- Fields: ram, processor
//- Methods: CunIDE(), compilecode()
//- Override displayDetails().
//⁠
//class Mobile:
//- Fields: camera, battery
//- Methods: makeCall), takephoto()
//- override displayDetails().
//
//Main Class - Vcube:
//1. Create objects for Laptop and Mobile.
//
//2.Initialize properties using setter methods.
//1. Demonstrate inheritance and runtime polymorphism.
//4.Call class-specific methods using child class objects.

class Device{
	private String brand ;
	private double price;
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
	}

	
}

class Laptop extends Device{
	String ram;
	String processor;
	
	void CunIDE() {
		System.out.println("Ram: "+ram);
		System.out.println("Processor: "+processor);
		
	}
	void Compilecode() {
		System.out.println("Ram: "+ram);
		System.out.println("Processor: "+processor);
		System.out.println("Code is Compiled Successfull !!");
	}

	void displayDetails() {
		System.out.println("Laptop Details !!");
		System.out.println("Brand: "+getBrand());
		System.out.println("Price: "+getPrice());
	}
	
}

class Mobile extends Device{
	
	String camera;
	String battery;
	
	void makeCall() {
		System.out.println("Camera: "+camera);
		System.out.println("Battery: "+battery);
		System.out.println("Call is Ongoing !1");
		
	}
	void takePhoto() {
		System.out.println("Camera: "+camera);
		System.out.println("Photo is Taken Successfully!!");
	}

	void displayDetails() {
		System.out.println("Mobile  Details !!");
		System.out.println("Brand: "+getBrand());
		System.out.println("Price: "+getPrice());
	}
}


public class Vcube  {

	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		l.setBrand("Hp");
		l.setPrice(50000);
		l.displayDetails();
		
		
		l.ram = "8gb";
		l.processor = "Ryzon 5";
		
		
		System.out.println("*************************************");
		
		
		
		l.CunIDE();
		
		System.out.println("*************************************");
		
		l.Compilecode();
		
		System.out.println("*************************************");
		System.out.println("*************************************");
		
		Mobile m = new Mobile();
		m.setBrand("IQOO");
		m.setPrice(30000);
		m.displayDetails();
		System.out.println("*************************************");
		
		m.battery="5000 MAH";
		m.camera = "50 MP";
		
		m.makeCall();
		System.out.println("*************************************");
		m.takePhoto();
		System.out.println("*************************************");
	}

}

