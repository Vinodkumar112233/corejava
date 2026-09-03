package com.operators;

public class TestEvenOdd1 {

	public static void main(String[] args) {
		int n = 201;

		if ((n & 1) == 0) {
		    System.out.println("Even");
		} else {
		    System.err.println("odd");
		}
		
	}

}
