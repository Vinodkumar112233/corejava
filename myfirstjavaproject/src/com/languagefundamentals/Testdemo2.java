package com.languagefundamentals;

public class Testdemo2 {
	String employeeName;
	int monthlySalary;
	int monthlyGst;
	int monthlyPf;
	
	double totalPf;
	double totalGst;
	double totalNetsalary;
	
	double totalAnnualGst;
	double totalAnnualPf;
	double totalAnnualSalary;
	
	void calculateMonthlyPf() {
		 totalPf = monthlySalary*(monthlyPf/100.0);
	}
	
	void calculateMonthlyGst() {
		 totalGst = monthlySalary*(monthlyGst/100.0);
	}
	
	void calculateNetmonthlysalary() {
		  totalNetsalary = monthlySalary - totalPf - totalGst;
	}
	void calculateAnnualGst() {
		 totalAnnualGst = totalGst*12;
	}
	void calculateAnnualPf() {
	    totalAnnualPf = totalPf*12;
	}
	void calculateAnnualSalary() {
		totalAnnualSalary = totalNetsalary * 12;
	}
	void displayEmployeedetails() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Monthly Salary: "+monthlySalary);
		System.out.println("Employee Monthly GST: "+monthlyGst);
		System.out.println("Employee Monthly PF: "+monthlyPf);
		System.out.println("Employee TOtal PF: "+totalPf);
		System.out.println("Employee Total GST: "+totalGst);
		System.out.println("Employee Net Salary: "+totalNetsalary);
		System.out.println("Employee Total Annual Gst: "+totalAnnualGst);
		System.out.println("Employee Total Annual PF: "+totalAnnualPf);
		System.out.println("Employee Total Annual Salary: "+totalAnnualSalary);
		
		
	}

	public static void main(String[] args) {
		Testdemo2 v = new Testdemo2();
		v.employeeName = "vinod";
		v.monthlyGst = 3;
		v.monthlyPf = 2;
		v.monthlySalary = 5000;
		v.calculateMonthlyPf();
		v.calculateMonthlyGst();  
		v.calculateNetmonthlysalary(); 
		v.calculateAnnualGst(); 
		v.calculateAnnualPf(); 
		v.calculateAnnualSalary();
		v.displayEmployeedetails();

	}

}
