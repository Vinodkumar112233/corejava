package com.languagefundamentals.constructors;

public class Message2 {
	int a;
	int b;
	int c;
	Message2(){
		this(10);
		System.out.println("you?");
		
	}
	Message2(int a){
		this(a,20);
		System.out.println("how are");
		
	}
	Message2(int a,int b){
		this(a,b,40);
		System.out.println("bro");
		
	}
	Message2(int a,int b,int c){
		System.out.println("Hii");
		
	}
	

	public static void main(String[] args) {
		Message2 v = new Message2();

	}

}
