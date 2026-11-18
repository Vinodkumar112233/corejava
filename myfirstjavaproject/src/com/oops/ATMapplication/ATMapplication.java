package com.oops.ATMapplication;

import java.util.Scanner;

public class ATMapplication {

	Scanner sc = new Scanner(System.in);

	public void deposit(Transaction t) {

		System.out.print("Enter Deposit Amount: ");
		double amount = sc.nextDouble();

		if (amount > 0) {

			t.setBalance(t.getBalance() + amount);

			System.out.println("Amount Deposited Successfully!");
			System.out.println("Updated Balance: " + t.getBalance());

		} else {

			System.out.println("Invalid Deposit Amount!");

		}
	}

	public void withDraw(Transaction t) {

		System.out.print("Enter Withdrawal Amount: ");
		double amount = sc.nextDouble();

		if (amount > 0) {

			if (amount <= t.getBalance()) {

				t.setBalance(t.getBalance() - amount);

				System.out.println("Amount Withdrawn Successfully!");
				System.out.println("Remaining Balance: " + t.getBalance());

			} else {

				System.out.println("Insufficient Balance!");

			}

		} else {

			System.out.println("Invalid Amount!");

		}
	}

	public void checkBalance(Transaction t) {

		System.out.println("Customer Name: " + t.getCustomerName());
		System.out.println("Account Number: " + t.getAccountNumnber());
		System.out.println("Available Balance: " + t.getBalance());

	}

	public void changePin(Transaction t) {

		System.out.print("Enter Old PIN: ");
		int oldPin = sc.nextInt();

		if (oldPin == t.getPin()) {

			System.out.print("Enter New PIN: ");
			int newPin = sc.nextInt();

			if (newPin >= 1000 && newPin <= 9999 && newPin != oldPin) {

				t.setPin(newPin);

				System.out.println("PIN Changed Successfully!");

			} else {

				System.out.println("Invalid New PIN!");

			}

		} else {

			System.out.println("Incorrect Old PIN!");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ATMapplication atm = new ATMapplication();

		Transaction[] users = new Transaction[3];

		users[0] = new Transaction(101, "Vinod", 10000, 1234);
		users[1] = new Transaction(102, "Rahul", 15000, 2345);
		users[2] = new Transaction(103, "Kiran", 20000, 3456);

		System.out.println("================================");
		System.out.println("     WELCOME TO ATM");
		System.out.println("================================");

		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();

		System.out.print("Enter ATM PIN: ");
		int pin = sc.nextInt();

		Transaction currentUser = null;

		for (int i = 0; i < users.length; i++) {

			if (users[i].getAccountNumnber() == accNo && users[i].getPin() == pin) {

				currentUser = users[i];
				break;

			}
		}

		if (currentUser != null) {

			System.out.println("\nWelcome " + currentUser.getCustomerName());

			int choice;

			do {

				System.out.println("\n========== ATM MENU ==========");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Check Balance");
				System.out.println("4. Change PIN");
				System.out.println("5. Exit");

				System.out.print("Enter Your Choice: ");
				choice = sc.nextInt();

				switch (choice) {

				case 1:
					atm.deposit(currentUser);
					break;

				case 2:
					atm.withDraw(currentUser);
					break;

				case 3:
					atm.checkBalance(currentUser);
					break;

				case 4:
					atm.changePin(currentUser);
					break;

				case 5:
					System.out.println("Thank You For Using ATM!");
					break;

				default:
					System.out.println("Invalid Choice!");

				}

			} while (choice != 5);

		} else {

			System.out.println("Invalid Account Number or PIN!");

		}

		sc.close();
	}
}
