package com.languagefundamentals;
import java.util.Scanner;

public class Testdemo19 {
	static Scanner sc = new Scanner(System.in);
	void calculateAverage() {
		System.out.println("Enter First Number: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter Second Number: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter Third Number: ");
		double c = sc.nextDouble();
		
		double result = (a+b+c)/2;
		System.out.println("Average: "+result);
	}

	public static void main(String[] args) {
		Testdemo19 v1 = new Testdemo19();
		v1.calculateAverage();
		

	}

}
