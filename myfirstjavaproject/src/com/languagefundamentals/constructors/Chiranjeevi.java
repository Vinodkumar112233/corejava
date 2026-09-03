package com.languagefundamentals.constructors;

public class Chiranjeevi {
	int age;
	int moviesCount;
	Chiranjeevi(){
		System.out.println("No arg Constructor Called!!!");
	}

	Chiranjeevi(int age, int moviesCount) {
		System.out.println("Parameterised Constructor Called!!");
		this.age = age;
		this.moviesCount = moviesCount;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started From Chiru");

	}

}
class RamCharan extends Chiranjeevi{
	
	RamCharan (){
		super();
		System.out.println("ram no arg constructor called!!!");
	}
	
	RamCharan (int age,int moviesCount){
		super(age,moviesCount);
		System.out.println("ram arg constructor called!!!");
	}
	public static void main(String[] args) {
		System.out.println("main method Started from ram");
		RamCharan r1 = new RamCharan();
		r1.show();
		
		RamCharan r2 = new RamCharan(72,160);
		r2.show();
	}
	void show() {
		System.out.println("*************************");
		System.out.println("Show method Called");
		System.out.println("Age:"+age);
		System.out.println("moviesCount:"+moviesCount);
	}
}
