package com.languagefundamentals.constructors;

public class Animal {
	String name;
	Animal(String name){
		this.name = name;
	}

	public static void main(String[] args) {

	}
	
	

}

class Dog extends Animal{
	String typeOfAnimal;

	Dog(String name,String typeOfAnimal) {
		super(name);
		this.typeOfAnimal = typeOfAnimal;
	}
	public static void main(String[] args) {
		Dog v = new Dog("Dog","Pet Animal");
		v.AnimalIntfo();
	}
	void AnimalIntfo() {
		System.out.println("Animal Name: "+name);
		System.out.println("Type of Animal: "+typeOfAnimal);}
	
}
