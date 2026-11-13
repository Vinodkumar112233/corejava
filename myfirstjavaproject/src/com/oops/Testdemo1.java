package com.oops;

//Single Inheritance 
// Parent Class
class Animal{
	void sound() {
		System.out.println("Animal Sounds Different Not Like Humans");
	}
}
// Child Class

class Dog extends Animal{
@Override
void sound() {
	System.out.println("Dog can Sounds Like Bow Bow ");
}

	

}
class BabyDog extends Dog{
	
	void sound() {
		System.out.println("Babu Dog can Sounds Like ufff ufff ");
	}
	
}

//Driver Class
public class Testdemo1 {

	public static void main(String[] args) {
		
		BabyDog v = new BabyDog();
		v.sound();

	}

}
