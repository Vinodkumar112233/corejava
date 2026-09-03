package com.languagefundamentals.constructors;

public class CircleArea {
//	double radius;

	CircleArea(double radius) {
		double r = radius;
		double calculate = Math.PI * r * r;
		System.out.println("Area of Circle: " + calculate);

	}

	public static void main(String[] args) {
		CircleArea v1 = new CircleArea(46);

	}

}
