package com.languagefundamentals.constructors;



//Create a Counter class and increment a static counter inside the constructor
public class Counter {
	static int a = 0;
	Counter(){
		a++;
		
	}

	public static void main(String[] args) {
		Counter v1 = new Counter();
		Counter v2 = new Counter();
		Counter v3 = new Counter();
		Counter v4 = new Counter();
		Counter v5 = new Counter();
		System.out.println("Count of Number:"+a);

	}
}