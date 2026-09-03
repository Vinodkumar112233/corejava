package com.operators;

//1. Write a Java Program to Swap two variables data using Arithmetic operators and using Temporary Variable
//
//Ex:- a=10,
//        b= 20

public class SwappingBitwise {

	public static void main(String[] args) {
		int a = 20; 
		int b = 10;
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
