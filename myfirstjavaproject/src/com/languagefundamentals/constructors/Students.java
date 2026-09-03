package com.languagefundamentals.constructors;

public class Students {
	Students(){
		this(10);
		System.out.println("No arguement");
	}
	Students(int x){
		System.out.println("Parameterized");
		System.out.println(x);
	}

	public static void main(String[] args) {
		Students v1 = new Students();

	}

}
