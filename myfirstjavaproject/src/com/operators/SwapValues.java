package com.operators;

//1. Write a Java Program to Swap two variables data using Arithmetic operators and using Temporary Variable
//
//Ex:- a=10,
//        b= 20

public class SwapValues {
	

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int temp = b;
		b = a;
		a = temp;
		
		System.out.println("Swapping a :"+a);
		System.out.println("Swapping b :" + b);
		
		

	}

}
