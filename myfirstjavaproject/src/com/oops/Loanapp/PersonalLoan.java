package com.oops.Loanapp;


public class PersonalLoan extends Loan {


	public static void main(String[] args) {

		System.out.println("Welcome To Vk Personal Loan Banking ❤️❤️");
		
//		By using child object & child Reference 
//		We can Access both Parent & child class functionalities
		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getEmployeeSalary();
		int cibil = pl.getCibilScore();

		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Lets Check More Details ");

			if (pl.isAdharValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("Congratulations !! Your Loan Got Approved !!");
				System.out.println("Your Loan Rate of interest is : " + pl.getROI());

			} else {
				System.out.println("Something went wrong with Personal Details !! can you re chech your Details !!");
			}

		} else {
			System.out.println("Your Loan got Rejeted !!");
		}

	}
}
