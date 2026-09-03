package com.languagefundamentals.constructors;

public class Employee {
	String name;
	long salary;
	String companyName;
	
	Employee() {
		System.out.println("no argument Constructor called");
	
		name = "vinod";
		salary = 50000;
		companyName = "Google";
	}
	Employee(String name,long salary,String companyName){
		System.out.println("1 argument Constructor called");
		
		this.name = name;
		this.salary = salary;
		this.companyName = companyName;
	}

	
	void EployeeInfo() {
		
		System.out.println("Employee Name: "+name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Company Name: "+companyName);
		System.out.println("***************************************************************");
	}

	public static void main(String[] args) {
		Employee v1 = new Employee();
		v1.EployeeInfo();
		
		Employee v2 = new Employee("Hemanth",100000,"microsoft");
		v2.EployeeInfo();
		

	}

}
