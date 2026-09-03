package com.languagefundamentals.constructors;

public class BankAccount {
	long accountNumber;
	String holderName;
	double balance;
	BankAccount(long accountNumber,String holderName,double balance){
		System.out.println("Parameterized Constructor Called!!!!");
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		
	}

	public static void main(String[] args) {
		BankAccount v = new BankAccount(12345443,"vinod",50000);
		v.bankAccountInfo();

	}
	void bankAccountInfo() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Holder Name: "+holderName);
		System.out.println("Balance: "+balance);
	}

}
