package com.oops.Copy;

class Customer{
	int id;
	String name;
	Address address;
	Customer(int id,String name,Address address){
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	Customer(Customer c){
		this.id = c.id;
		this.name = c.name;
		this.address = c.address;
	}
}

class Address{
	String city;
	
	Address (String city){
		this.city = city;
	}
}

public class TestDemoShallowCopy1 {

	public static void main(String[] args) {
		Address a = new Address("Hyderabad");
		Customer c1 = new Customer(1,"vinod",a);
		
		Customer c2 = new Customer(c1);
		
		System.out.println("Before Modification");
		System.out.println(c1.id);
		System.out.println(c2.id);
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c1.address.city);
		System.out.println(c2.address.city);
		
		c2.id = 2;
		c2.name = "Hemanth";
		c2.address.city = "Banglore";
		
		System.out.println("**************************************************************************");
		System.out.println("After  Modification");
		System.out.println(c1.id);
		System.out.println(c2.id);
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c1.address.city);
		System.out.println(c2.address.city);
		
		
		

	}

}
