package com.languagefundamentals;

public class Testdemo12 {
	int result;

	void addition(int a, int b) {
		result = a + b;
		System.out.println("Addition: " + result);

	}

	void subtraction(int b) {

		result = result - b;
		System.out.println("Subtraction: " + result);

	}

	void multiplication(int b) {
		result = result * b;
		System.out.println("Multiplication: " + result);

	}

	void division(int b) {
		result = result / b;
		System.out.println("Division: " + result);

	}

	public static void main(String[] args) {
		Testdemo12 v1 = new Testdemo12();

		v1.addition(4, 3);
		v1.subtraction(5);
		v1.multiplication(5);
		v1.division(34);

	}

}
