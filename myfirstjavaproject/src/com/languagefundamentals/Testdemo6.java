package com.languagefundamentals;

public class Testdemo6{
	String name;
	int id;
	int age;
	Address address;
class Address{
	String place;
	int doorno;
	String city;
	
}
	
	

	public static void main(String[] args) {
		Testdemo6 v = new Testdemo6();
		v.name = "vinod";
		v.age = 22;
		v.id = 1;
		v.address.place = "moosapet";
		v.address.city = "hyderabad";
		v.address.doorno = 123;
		
		System.out.println(v.name);
		System.out.println(v.age);
		System.out.println(v.id);
		System.out.println(v.address.place);
		System.out.println(v.address.city);
		System.out.println(v.address.doorno);

	}

}
