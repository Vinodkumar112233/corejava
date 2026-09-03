package com.languagefundamentals.constructors;
//Create a Java program to implement an Employee Login Access System.
//Create a class Employee with the following fields: employeeName, salary, doorpower, blocked
//
//Initialize all the values using a parameterized constructor.
//Create a method checkAccess() that performs the following checks:
//› check whether the door has power or not using a logical/relational expression.
//› Check whether the employee is blocked or not.
//›The employee should get access only when the door has power and the employee is not blocked. 
// > Display the employee name, salary, door power status, blocked status, and the final access status.

public class EmployeeLogin {
	String employeeName;
	double salary;
	boolean doorpower;
	boolean blocked;
	String finalAccess;
	
	EmployeeLogin(String employeeName,double salary,boolean doorpower,boolean blocked){
		this.employeeName = employeeName;
		this.salary = salary;
		this.doorpower =doorpower;
		this.blocked = blocked;
	}
	
	String checkAccess() {
		if (doorpower && blocked == false) {
			System.out.println("Grant Access");
			return "Grant Access";
			
				
			
		}else {
//			System.out.println("Not Grant Access");
			return "Not Grant Access"; 
		}
		
		
	}
	
	void display() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Door Power: "+doorpower);
		System.out.println("Employee blocked: "+blocked);

		System.out.println("Access Status: "+(finalAccess = checkAccess()));
		
	}

	public static void main(String[] args) {
		EmployeeLogin v = new EmployeeLogin("vinod",6000,true,false);
		v.display();

	}

}
