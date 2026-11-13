package com.oops.Abstraction;

public class TestaAbstractionDemo1 {

	public static void main(String[] args) {

		Animal d = new Dog();

		System.out.println("*****Dog Information********");
		d.eat();
		d.sound();
		d.walk();
		System.out.println("                             ");
		System.out.println("                             ");

		Animal c = new Cat();

		System.out.println("*****Cat Information********");
		c.eat();
		c.sound();
		c.walk();
		System.out.println("                             ");
		System.out.println("                             ");

		Animal m = new Monkey();

		System.out.println("*****Monkey Information********");
		m.eat();
		m.sound();
		m.walk();
		System.out.println("                             ");
		System.out.println("                             ");

	}

}
