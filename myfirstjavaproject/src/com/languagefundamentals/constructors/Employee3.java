package com.languagefundamentals.constructors;

public class Employee3 {
	int id;
	String name;
	double monthlySalary;
	
	Employee3(int id,String name,double monthlySalary){
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	
	double annualSalary() {
		return monthlySalary*12;
	}
	void employeeInfo() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee monthly Salary: "+monthlySalary);
		System.out.println("Employee Annual Salary: "+annualSalary());
	}

	public static void main(String[] args) {
		Employee3 v1 = new Employee3(12,"Vninod",50000);
		v1.employeeInfo();

	}

}
