package com.oops;

//In OOps Concept Polymorphism Provides Code Reusability and Flexibility . 
// Polymorphism means same method with Different parameters.
//Example:

// Find Areas :

// Area Of Rectangle is Length * Breadth 
// Area of Square is Side * Side 
//Area of Triangle is 0.5 * base * height 
// Area of Circle is Pi* r* r

public class TestdemoPoly1 {

	double findArea(double l, double b) {
		return l * b;
	}

	double findArea(double s) {
		return s * s;
	}

	double findArea(double b, float h) {
		return 0.5 * (b * h);
	}

	double findArea(int r) {
		return Math.PI * (r * r);
	}

	void main(String[] args) {

		System.out.println("Area of Rectangle :" + findArea(24.0, 25.0));
		System.out.println("Area of Square :" + findArea(5.0));
		System.out.println("Area of Triangle: " + findArea(9.0, 8.0F));
		System.out.println("Area of Circle: " + findArea(6));

	}

}
