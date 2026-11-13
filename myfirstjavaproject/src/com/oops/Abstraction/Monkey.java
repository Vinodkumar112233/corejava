package com.oops.Abstraction;

public class Monkey implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Monkey can Eat Bananas");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can Always Jump");
	}

	@Override
	public void sound() {
		System.out.println("Monkey can Sound Like Kchhhhchhhch");
	}


}
