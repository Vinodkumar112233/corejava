package com.languagefundamentals.constructors;

public class BankAccounts {
	long accountNumber;
	String holderName;
	double balance;
	String branch;
	
	BankAccounts(long accountNumber,String holderName,double balance,String branch){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.branch = branch;
	}
	BankAccounts(BankAccounts v1,double balance,String branch){
		this.accountNumber =v1. accountNumber;
		this.holderName = v1.holderName;
		this.balance = balance;
		this.branch = branch;
	
	}

	public static void main(String[] args) {
		BankAccounts v1 = new BankAccounts(1234556,"Vinod",50000,"kukkatpally");
		v1.bankInfo();
		
		BankAccounts v2 = new BankAccounts(v1,40000,"Kphb");
		v2.bankInfo();
		

	}
	void bankInfo() {
		System.out.println("*****************************************");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+holderName);
		System.out.println("Account Balance: "+balance);
		System.out.println("Account Branch: "+branch);
	}

}
