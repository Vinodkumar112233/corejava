package javaintroduction;

public class StateBank {
	static long  accountNumber = 62310100120L;
	
	String accountholderName;
	
	int bankBalance;
	{
		 accountNumber = accountNumber + 1;
	}

	public static void main(String[] args) {
		StateBank v1 = new StateBank();
		v1.accountholderName = "vinod";
		v1.accountNumber = 62310100120l;
		
		v1.bankBalance = 2000;
		System.out.println("Account holder name: "+ v1.accountholderName);
		System.out.println("Account Number: "+v1.accountNumber);
		System.out.println("Account Balance: "+v1.bankBalance);
		System.out.println("-----------------------------------------------------------------------");
		
		StateBank v2 = new StateBank();
		v2.accountholderName = "hemanth";
		
		v2.bankBalance = 3000;
		System.out.println("Account holder name: "+ v2.accountholderName);
		System.out.println("Account Number: "+v2.accountNumber);
		System.out.println("Account Balance: "+v2.bankBalance);
		System.out.println("-----------------------------------------------------------------------");
		StateBank v3 = new StateBank();
		v3.accountholderName = "pavan";
		
		v3.bankBalance = 5000;
		System.out.println("Account holder name: "+ v3.accountholderName);
		System.out.println("Account Number: "+v3.accountNumber);
		System.out.println("Account Balance: "+v3.bankBalance);
		System.out.println("-----------------------------------------------------------------------");
		StateBank v4 = new StateBank();
		v4.accountholderName = "sai";
		
		v4.bankBalance = 10000;
		System.out.println("Account holder name: "+ v4.accountholderName);
		System.out.println("Account Number: "+v4.accountNumber);
		System.out.println("Account Balance: "+v4.bankBalance);
		System.out.println("-----------------------------------------------------------------------");


	}

}
