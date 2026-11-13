package com.oops.Loanapp;

public class HomeLoan extends Loan{

	public static void main(String[] args) {
		System.out.println("Welcome To Vk Personal Loan Banking ❤️❤️");
		
		HomeLoan hl = new HomeLoan ();
		
		if(hl.getEmployeeSalary() > 5000000.00 && hl.getCibilScore() >= 300 && hl.getCibilScore()<= 900) {
			System.out.println("Lets check more details for Home Loan ");
			
			if(hl.isAdharValid() && hl.isPanValid() && hl.isPhoneValid()) {
				System.out.println("Congratulations !! Your Home Loan Got Approved : ");
				System.out.println("Home Loan Rate Of Interest is: "+hl.getROI());
				
			}else {
				System.out.println("Something Went Wrong !!");
			}
		}else {
			System.out.println("Home Loan Got Rejected !!");
		}

	}

}
