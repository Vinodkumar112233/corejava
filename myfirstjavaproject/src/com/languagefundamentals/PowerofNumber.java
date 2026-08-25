package com.languagefundamentals;
import java.util.Scanner;

public class PowerofNumber {
	static Scanner sc = new Scanner(System.in);
	
	double squaringNumber(double n) {
		return Math.pow(n,2);
	}
	double cubingNumber(double n) {
		return Math.pow(n, 3);
	}
	double fourthpowerofNumber(double n) {
		return Math.pow(n, 4);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started: ");
		PowerofNumber v1 = new PowerofNumber();
		
		System.out.println("Enter the number: ");
		double n = sc.nextDouble();
		double squaring= v1.squaringNumber(n);
		System.out.println("Squaring of a number: "+squaring);
		System.out.println("******************************************");
		
		
		double cubing= v1.cubingNumber(n);
		System.out.println("Cubing of a number: "+cubing);
		System.out.println("******************************************");
		
		
		double fourthPower= v1.fourthpowerofNumber(n);
		System.out.println("fourth power of a number: "+fourthPower);
		System.out.println("******************************************");
		
		System.out.println("Main Method Ended: ");

	}

}
