package com.languagefundamentals.constructors;
class Animals{
	String animalName;
	Animals(String animalName){
		this.animalName = animalName;
		System.out.println("Animal Name: "+animalName);
	}
}
class Dogs extends Animals{
	String dogName;
	Dogs(String animalName,String dogName){
		super(animalName);
		System.out.println("Dog Name: "+dogName);
	}
}
public class Puppy  extends Dogs{
	Puppy(String animalName,String dogName){
		super(animalName,dogName);
	}
//	void animalInfo() {
//		);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy v = new Puppy("Dog","Puppy");

	}

}
