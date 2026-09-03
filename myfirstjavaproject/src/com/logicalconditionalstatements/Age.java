package com.logicalconditionalstatements;
import java.util.Scanner;

public class Age {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Age: ");
		double age = sc.nextDouble();
		
		if (age>=60) {
			System.out.println("Old Age");
		}
		else if(age>=40) {
			System.out.println("Middle Age");
		}
		else if(age>=20) {
			System.out.println("Young Age");
		}
		else if(age>=11) {
			System.out.println("Teenage");
		}
		else if(age >5) {
			System.out.println("Child");
		}
		else if(age >1) {
			System.out.println("Kid");
		}

	}

}
