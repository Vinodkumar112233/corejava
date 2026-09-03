package com.languagefundamentals.constructors;

public class A {
	int c;
	
	A(){
		this(2);
		System.out.println("Hii");
		
		
	}
	A(int c){
		
		System.out.println("hello");
	}
	

    public static void main(String[] args) {
    	A v1 = new A();
		
	}
}


