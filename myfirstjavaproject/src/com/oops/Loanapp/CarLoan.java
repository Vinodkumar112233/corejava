package com.oops.Loanapp;

public class CarLoan extends Loan{
	public static void main(String[] args) {
		System.out.println("Welcome To Vk Personal Loan Banking ❤️❤️");
		
		CarLoan cl = new CarLoan();
		
		if(cl.getEmployeeSalary() >= 1000000 && cl.getCibilScore() >= 300 && cl.getCibilScore() <= 900) {
			System.out.println("Lets check more Details  !!");
			
			if(cl.isAdharValid() && cl.isPanValid() && cl.isPhoneValid()) {
				System.out.println("Congratulations Your Car Loan Got Approved !!");
				System.out.println("Your Home Loan Rate Of Interest is : "+ cl.getROI());
			}else {
				System.out.println("Something Went Wrong !!");
			}
		}else {
			System.out.println(" Car Loan Got Rejected !!");
		}
	}

}
