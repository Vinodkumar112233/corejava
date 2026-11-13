package com.oops.Abstraction;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat can Eat Rats");
	}

	@Override
	public void walk() {
		System.out.println("Cat can Walk like Cat-Walk");
	}

	@Override
	public void sound() {
		System.out.println("Cat can Sound Like Meow Meow");
	}

}
