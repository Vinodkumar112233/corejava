package com.languagefundamentals.constructors;

public class Employee2 {
	int id;
	String name;
	double salary;
	
	Employee2(){
		this(30);
		System.out.println("No arg Constructor Called!!!");
	}
	Employee2(int id){
		this(id,"vinod");
		this.id = id;
		System.out.println("1 arg Constructor Called!!");
		
	}
	Employee2(int id,String name){
		this(id,name,50000);
//		this.id = id;
		this.name = name;
		
		System.out.println("2 args Constructor Called!!");
		
	}
	Employee2(int id,String name,double salary){
//		this.id = id;
//		this.name = name;
		this.salary = salary;
		System.out.println("3 arg Constructor Called!!");
		
	}
	
	void employeeInfo() {
		System.out.println("******************************");
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Student Salary: "+salary);
	}

	public static void main(String[] args) {
		Employee2 v1 = new Employee2();
		v1.employeeInfo();

	}

}
