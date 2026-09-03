package com.languagefundamentals.constructors;

public class Human {
	String name;
	int age;
	
	Human(){
		System.out.println("Human Constructor Called!!");
	}
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started from Human");

	}

}
class Person extends Human{
	{
		System.out.println("Instance Block Called!!!");
	}
	Person(){
		System.out.println("Person Constructor Called!!");
	}
	Person(String name,int age){
		super(name,age);
		System.out.println("Two arg Constructor Called!!");
		
	}
	public static void main(String[] args) {
		System.out.println("main method Started from Person");
		Person p = new Person();
		p.info();
		
		Person p1 = new Person("Vinod",22);
		p1.info();
	}
	void info() {
		System.out.println("****************************");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
}
