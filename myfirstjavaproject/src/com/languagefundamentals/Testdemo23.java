package com.languagefundamentals;

import java.util.Scanner;

public class Testdemo23 {
	static Scanner sc = new Scanner(System.in);
//	void averageOfthreeNumbers(double a ,double b,double c) {
//		double average = (a+b+c)/3;
//		System.out.println("Total Average: "+average);
//		
//	}

//	void square(int a) {
//		int squareOfnumber = a*a;
//		System.out.println("Square of the Number: "+squareOfnumber);
//	}

//	void divisibleBy5and3(int a) {
//		if(a % 3 == 0 && a % 5 ==0) {
//			System.out.println("Divisible By 3 and 5");
//			
//		}else {
//			System.out.println("Not Divisible");
//		}
//	}
	////
//	void simpleInterest() {
//		
//	}

	int student_Age() {
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		return age;
	}

	public static void main(String[] args) {
		Testdemo23 v1 = new Testdemo23();
		int age = v1.student_Age();
		
		System.out.println("Age:"+age);

	}

}
