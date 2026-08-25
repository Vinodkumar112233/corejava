package com.languagefundamentals;
import java.util.Scanner;

public class Areas {
	static Scanner sc = new Scanner(System.in);
	
	double area0fSquare(double side) {
		return side * side;
	}
	
	double areaofRecatangle(double length ,double breadth) {
		return length*breadth;
	}
	double areaofTriangle(double base,double height) {
		return 0.5*base*height;
	}
	double areaofCircle(double radius) {
		return Math.PI*radius*radius;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started: ");
		Areas v1 = new Areas();
		
		System.out.println("Enter the side:");
		double side = sc.nextDouble();
		double areaofSquare=v1.area0fSquare(side);
		System.out.println("Area Of Square: "+areaofSquare);
		System.out.println("**************************************");
		
		System.out.println("Enter the Length: ");
		double length = sc.nextDouble();
		System.out.println("Enter the Breadth: ");
		double breadth = sc.nextDouble();
		double areaofRectangle = v1.areaofRecatangle(length, breadth);
		System.out.println("Area of Rectangle: "+areaofRectangle);
		System.out.println("**************************************");
		
		System.out.println("Enter the Base: ");
		double base = sc.nextDouble();
		System.out.println("Enter the Height: ");
		double height = sc.nextDouble();
		double areaofTriangle = v1.areaofTriangle(base, height);
		System.out.println("Area of Triangle: "+areaofTriangle);
		System.out.println("**************************************");
		
		System.out.println("Enter the Radius: ");
		double radius = sc.nextDouble();
		double areaofCircle = v1.areaofCircle(radius);
		System.out.println("Area of Circle: "+areaofCircle);
		System.out.println("**************************************");
		
		System.out.println("Main Method Ended: ");
		

	}

}
