package com.languagefundamentals.constructors;

public class Test3 {
	Test3(){
		this(10);
		System.out.println("1");
	}
	Test3(int x){
		this(20,30);
		System.out.println("2");
		
	}
	Test3(int x,int y){
		System.out.println("3");
	}

	public static void main(String[] args) {
		Test3 v = new Test3();

	}

}
