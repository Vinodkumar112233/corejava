package com.languagefundamentals.constructors;

public class EmployeeSalaries {
	String name;
	long salary;
//	long salary2;
//	long salary3;
	
	EmployeeSalaries(String name,long salary){
		System.out.println("Parameterised Constructor");
		this.name = name;
		this.salary = salary;
	}
	void EmployeeSalaryInfo() {
		System.out.println("******************************");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("******************************");
	}
	

	public static void main(String[] args) {
		EmployeeSalaries v1 = new EmployeeSalaries("vinod",20000);
		v1.EmployeeSalaryInfo();
		
		EmployeeSalaries v2 = new EmployeeSalaries("vinod",30000);
		v2.EmployeeSalaryInfo();  
		
		EmployeeSalaries v3 = new EmployeeSalaries("vinod",50000);
		v3.EmployeeSalaryInfo();
		

	}
	

}
