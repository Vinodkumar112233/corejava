package com.languagefundamentals;

public class Testdemo21 {
	String customerName;
	double loanAmount;
	double rateOfInterest;
	double loanTenure;
	
	double totalAmount;
	double simpleInterest;
	double monthlyEmi;
	
	double calculateInterest(double loanAmount,double rateOfInterest) {
	    simpleInterest = (loanAmount*loanTenure*rateOfInterest)/100;
		return simpleInterest;
		
	}
	
	double calculateTotalAmount() {
		 totalAmount = loanAmount+simpleInterest;
		return totalAmount;
		
		
	}
	
	double calculateMonthlyEmi() {
		 monthlyEmi = totalAmount/(loanTenure*12);
		return monthlyEmi;
	}
	
	void displayLoanSummary() {
		System.out.println("Total Loan Amount: "+ loanAmount);
		System.out.println("loan Tenure: "+loanTenure);
		System.out.println("Rate of Interest: "+rateOfInterest);
		System.out.println("Total Amount: "+totalAmount);
		System.out.println("Total Monthly Emi: "+monthlyEmi);
	}

	public static void main(String[] args) {
		Testdemo21 v1 = new Testdemo21();
		v1.customerName = "Vinod Kumar";
		v1.loanAmount = 100000;
		v1.loanTenure = 2;
		v1.rateOfInterest = 5;
		double interest = v1.calculateInterest(100000, 5);
		double totalAmount = v1.calculateTotalAmount();
		double monthlyEmi=v1.calculateMonthlyEmi();
		
		System.out.println("Total Interest: "+interest);
		System.out.println("Total Amount: "+totalAmount);
		System.out.println("Monthly Emi: "+monthlyEmi);
		System.out.println("---------------------------------------");
		v1.displayLoanSummary();
		

	}

}
