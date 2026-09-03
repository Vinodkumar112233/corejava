package com.languagefundamentals.constructors;

//Copying Constructor:
public class Mobiles {
	String model;
	String brand;
	double price;
	
	Mobiles(String model,String brand,double price){
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	Mobiles(Mobiles m){
		this.model = m.model;
		this.brand = m.brand;
		this.price = m.price;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started from mobile");
		Mobiles m1 = new Mobiles("17 pro max","Iphone",85000);
		m1.mobileInfo();
		
		Mobiles m2 = new Mobiles(m1);
		m2.mobileInfo();
		

	}
	void mobileInfo(){
		System.out.println("****************************");
		System.out.println("Mobile model: "+model);
		System.out.println("Mobile brand: "+brand);
		System.out.println("Mobile price: "+price);
	}

}
