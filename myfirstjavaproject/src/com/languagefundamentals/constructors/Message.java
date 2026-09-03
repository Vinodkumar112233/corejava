package com.languagefundamentals.constructors;



//Create a constructor that prints a message every time an object is created.//
public class Message {
	Message() {
		System.out.println("Java Is Simple !!");
	}

	public static void main(String[] args) {
		Message v2 = new Message();
		Message v3 = new Message();
		Message v4 = new Message();
		Message v5 = new Message();

	}

}