package com.languagefundamentals;

import java.util.Scanner;
public class Testdemo14 {
	
	void division(double a,float b) {
		double result = a/b;
		System.out.println("Addition: "+result);
		
		
	}
	static void addition(int a,int b) {
		int addition = a+b;
		System.out.println(addition);
	}

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int a = v.nextInt();
		
		System.out.println("Enter a Number: ");
		int b = v.nextInt();
		
//		System.out.println("Enter a Number: ");
//		int c = v.nextInt();
//		
//		System.out.println("Enter a Number: ");
//		int d = v.nextInt();
		
		Testdemo14 t = new Testdemo14();
		
		t.division(a, b);
//		addition()

	}

}
