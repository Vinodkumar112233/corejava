package com.languagefundamentals;

import java.util.Scanner;
public class Testdemo13 {
	void student_Information(int id,String name) {
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
	}

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
	   int id = v.nextInt();
	   
	   System.out.println("Enter Student Name: ");
	   String name = v.next();
	   
	   Testdemo13 v1 = new Testdemo13();
	   
	   v1.student_Information(id,name);

	}

}
///1.problem:we cannot call instance method with scanner object reference we have to create object through class then after we call the method with object reference.



