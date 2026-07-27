package javaintroduction;

public class Atm {
	static String bankName = "andhrabank";
	int accountNumber = 232323;
	int balance;

	void deposit() {

		int deposited_money = 2000;
		int remaining_money = balance + deposited_money;
		System.out.println("Bankname: " + bankName);
		System.out.println("Account_Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Deposited money: " + deposited_money);
		System.out.println("Total balance: " + (remaining_money));
		

	}

	void withdraw() {
		int withdraw_money = 1000;
		int total_remaining_money = balance - withdraw_money;
		System.out.println("Bankname: " + bankName);
		System.out.println("Account_Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Deposited money: " + withdraw_money);
		System.out.println("Total balance: " + (total_remaining_money));
		
	}

	void checkbalance() {
		System.out.println("Bankname: "+ bankName);
		System.out.println("Account_Number: "+ accountNumber);
		System.out.println("Total_balance: "+ balance);
	}
		
	
	public static void main(String[] args) {
		Atm v = new Atm();
		v.balance = 4000;
		v.checkbalance();
	}
}
	
		

