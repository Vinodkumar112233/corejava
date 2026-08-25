package com.languagefundamentals;
import java.util.Scanner;

public class Testdemo20 {
	static Scanner sc = new Scanner(System.in);
//	void cubeOfNumber() {
//		System.out.println("Enter a Number: ");
//		int a = sc.nextInt();
//		
//		int b = a*a*a;
//		System.out.println("Cube Of a Number: "+b);
//		
//	}
	
//   void checkEvenOrOdd() {
//	   System.out.println("Enter a number: ");
//	   int a = sc.nextInt();
//	   if (a%2 == 0) {
//		   System.out.println("It is even");
//	   }
//	   else {
//		   System.out.println("It is odd");
//	   }
//   }
//	void checkPositiveNegativeZero() {
//		System.out.println("Enter a number: ");
//		int a = sc.nextInt();
//		
//		if (a==0) {
//			System.out.println("it is Zero");
//		}else if(a<0) {
//			System.out.println("it is Negative");
//		}else {
//			System.out.println("it is positive");
//		}
//	
//		
//	}
	
//	void checkLargest() {
//		System.out.println("Enter First Number:");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter Second Number:");
//		int b = sc.nextInt();
//		
//		if(a>b) {
//			System.out.println("a is bigger");
//		}else {
//			System.out.println("b is bigger");
//		}
//		
//	}
//	void simpleInterest() {
//		System.out.println("Enter a Principal Amount: ");
//		double a = sc.nextDouble();
//		
//		System.out.println("Enter Rate of Interest: ");
//		double b = sc.nextDouble();
//		b = b/100;
//		
//		System.out.println("Enter Time: ");
//		double c = sc.nextDouble();
//		
//		double simpleInterest = a*b*c;
//		System.out.println("Total Amount: "+(simpleInterest+a));
//		
//	}
	
//	void compounInterest() {
//		System.out.println("Enter a principal:");
//		double a = sc.nextDouble();
//		
//		System.out.println("Enter the rate of interest: ");
//		double b = sc.nextDouble();
//		b = b/100;
//		
//		System.out.println("Enter Times Interest");
//		double c = sc.nextDouble();
//		
//		System.out.println("Enter Time: ");
//		double d = sc.nextDouble();
//		
//		double compoundInterest = a*Math.pow(1+(b/c), c*d)-a;
//		double totalAmount = compoundInterest + a;
//		System.out.println("Total Amount: "+totalAmount);
//		
//	}
	
//	void profit() {
//		System.out.println("Enter Selling Price: ");
//		double a = sc.nextDouble();
//		
//		System.out.println("Enter Cost Price: ");
//		double b = sc.nextDouble();
//		
//		double profit = a - b;
//		
//		System.out.println("Profit: "+profit);
//				
//			
//	}
	
//  void gSt() {
//	  System.out.println("Enter Price: ");
//	  double a = sc.nextDouble();
//	  
//	  System.out.println("Enter Gst: ");
//	  double b = sc.nextDouble();
//	  
//	  double gSt = (a*b)/100;
//	  
//	  System.out.println("Total Price With Discount "+(a + gSt));
//  }
	
	void areaOfrectangle() {
		System.out.println("Enter the Length: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the width: ");
		double b = sc.nextDouble();
		
		double area = a*b;
		
		System.out.println("Area of Rectangle: "+area+"cmsquare");
				
			
	}
	
	
	
	

	
	
	
	public static void main(String[] args) {
		
		Testdemo20 v1 = new Testdemo20();
		v1.areaOfrectangle();
		
		
		
		
		

	}

}
