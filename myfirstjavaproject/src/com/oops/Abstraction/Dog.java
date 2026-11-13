package com.oops.Abstraction;

public class Dog implements Animal{

	@Override
	public void eat() {
		
		System.out.println("Dog can eat Non - Veg");
		
	}

	@Override
	public void walk() {
			System.out.println("Dog can Walk Like AnyWhere ");
	}

	@Override
	public void sound() {
		System.out.println("Dog can Sound Like Bow Bow");
		
	}
	
	

}
