package com.operators;

public class TestTernaryOp {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 250;
		
		String result = (a>b && a>c)? "a i big": (b>a && b>c)?"b is big":"c is big"; 
		
		System.out.println(result);		     
		

	}

}
