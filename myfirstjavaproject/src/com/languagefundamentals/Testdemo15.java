package com.languagefundamentals;
import java.util.Scanner;

//problems i got during using Scanner:
//1.we have to give different way Scanner inputs to no return type + parameters and no return type + no parameters:
public class Testdemo15 {
// for no return type + no parameters we have to give scanner input inside the method not in main method .because, this way of method 
//	dont have parameters.
	void addition() {
		Scanner v = new Scanner(System.in);
		
		System.out.println("Enter a first Number: ");
		int a = v.nextInt();
		
		System.out.println("Enter a Second Number: ");
		int b = v.nextInt();
		
		System.out.println("Addition: "+(a+b));
		
		
	}
//for no return type + parameters we have to give scanner input inside the main method not in  method .because, this way of method 
// have parameters,so we have to pass arguements.
	void addition(int a , int b) { 
		int sum = a+b; 
		System.out.println("Addition: "+sum);
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Testdemo15 v1 = new Testdemo15();
		v1.addition();
		
		System.out.println("---------------------------------");
		
		System.out.println("Enter a First Number: ");
		int a = sc.nextInt();
		
		
		System.out.println("Enter a Second Number: ");
		int b = sc.nextInt();
		
		
		v1.addition(a, b);

	}

}
