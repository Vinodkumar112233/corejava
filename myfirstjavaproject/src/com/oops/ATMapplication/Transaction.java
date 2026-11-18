package com.oops.ATMapplication;

 class Transaction {


		
		private int accountNumnber;
		private String customerName;
		private double balance;
		private int pin;
		public int getAccountNumnber() {
			return accountNumnber;
		}
		public void setAccountNumnber(int accountNumnber) {
			this.accountNumnber = accountNumnber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public Transaction(int accountNumnber, String customerName, double balance, int pin) {
			super();
			this.accountNumnber = accountNumnber;
			this.customerName = customerName;
			this.balance = balance;
			this.pin = pin;
		}
		
		
		

	

}
