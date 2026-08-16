package com.languagefundamentals;

public class Employees {

    static String companyName = "Google";
    static String companyLocation = "Hyderabad";

    String employeeName;
    int employeeId;
    String designation;
    String department;
    int salary;
    String remoteLocation;

    void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Remote Location: " + remoteLocation);
    }

    void promoteEmployee(String newDesignation) {
        this.designation = newDesignation;
    }

    void updateSalary() {
        salary += 5000;
    }

    void employeeLocation(String newLocation) {
        this.remoteLocation = newLocation;
    }

    public static void main(String[] args) {

        Employees v1 = new Employees();

        v1.employeeName = "Vinod";
        v1.employeeId = 123;
        v1.designation = "Associate";
        v1.department = "Development";
        v1.salary = 50000;
        v1.remoteLocation = "Hyderabad";

    
        v1.displayEmployeeDetails();
        
    	System.out.println("-----------------------------------------------------------------------------");
    	
        v1.promoteEmployee("Senior Associate");
        
        v1.updateSalary();
        
        v1.employeeLocation("Banglore ");

        System.out.println("-----------------------------------------------------------------------------");
        v1.displayEmployeeDetails();
    }
}
