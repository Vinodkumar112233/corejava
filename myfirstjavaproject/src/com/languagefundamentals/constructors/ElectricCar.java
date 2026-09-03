package com.languagefundamentals.constructors;
class Vehicles{
	String  type;


	Vehicles(String type){
		this.type = type;
	}
	
	}

class Car extends Vehicles{
	String brand;
	int price;
	Car(String type,String brand,int price){
		super(type);
		this.brand = brand;
		this.price = price;
		
		
	}
	
}
public class ElectricCar extends Car {
	 int batteryCapacity;
	 ElectricCar(String type,String brand,int price,int batteryCapacity){
		 
		 super(type,brand,price);
		 this.batteryCapacity = batteryCapacity;
		 
	 }

	public static void main(String[] args) {
		ElectricCar v = new ElectricCar("Car","xyz",1500000,20000);
		v.display();
		

	}
	void display() {
		System.out.println("Type:"+type);
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Battery:"+batteryCapacity);
		}

}
