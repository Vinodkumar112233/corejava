package com.languagefundamentals;

import java.util.Scanner;

public class EmployeeSalary {
//	return type with no parameters 
	double salary1;
	double salary2;

	double employee1_Salary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		salary1 = sc.nextDouble();
		return salary1;

	}

	double employee2_Salary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		salary2 = sc.nextDouble();
		return salary2;
	}

	double calculate_salary() {
		double totalSalary = salary1 + salary2;
		return totalSalary;

	}

	public static void main(String[] args) {
		EmployeeSalary v1 = new EmployeeSalary();
		double salary1 = v1.employee1_Salary();
		double salary2 = v1.employee2_Salary();

		double totalSalary = v1.calculate_salary();
		
		System.out.println("Total_Salary: "+totalSalary);

	}

}
