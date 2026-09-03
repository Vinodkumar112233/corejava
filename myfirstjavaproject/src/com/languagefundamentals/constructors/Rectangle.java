package com.languagefundamentals.constructors;

public class Rectangle {
	double length;
	double breadth;

	Rectangle() {

		length = 12;
		breadth = 45;

	}

	public static void main(String[] args) {
		Rectangle v = new Rectangle();
		v.rectangleInfo();

	}

	void rectangleInfo() {
		System.out.println("Area: " + (length * breadth));
	}

}
