package com.languagefundamentals;
import java.util.Scanner;

public class Testdemo18 {
	void cricketerDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Cricketer Name: ");
		String cricketerName = sc.nextLine();
		
		System.out.println("Jersy No: ");
		int jersyNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Category: ");
		String category = sc.nextLine();
		
		System.out.println("Enter Country Name: ");
		String countryName = sc.nextLine();
		
		System.out.println("Cricketer Name: "+cricketerName);
		System.out.println("Jersy No: "+jersyNo);
		System.out.println("Category: "+category);
		System.out.println("Country Name: "+countryName);
	}

	

	public static void main(String[] args) {
		Testdemo18 v1 = new Testdemo18();
		v1.cricketerDetails();

	}

}
