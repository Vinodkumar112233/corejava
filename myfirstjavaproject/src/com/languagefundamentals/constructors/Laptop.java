package com.languagefundamentals.constructors;

public class Laptop {
	String brand;
	String rom;
	int price;
	Laptop(){
		brand = "Hp";
		rom = "256";
		price = 50000;
		
		System.out.println("No arg Constructor Called!!");
		
	}

	public static void main(String[] args) {
		Laptop v1 =new Laptop();
		v1.laptopInfo();
		
		

	}
	void laptopInfo() {

		System.out.println("Brand: "+brand);
		System.out.println("Rom: "+rom);
		System.out.println("Price: "+price);
	}

}
