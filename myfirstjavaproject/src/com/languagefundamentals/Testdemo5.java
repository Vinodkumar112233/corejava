package com.languagefundamentals;

public class Testdemo5 {
	String passengerName;
	int age;
	String source;
	String destination;
	int numberofTickets;
	static int totalTicketsBought ;
	int totalamount;
	static int price = 500;
	
	
	static {
		System.out.println("Welcome to Vande Express Thank you for Choosing us");
		
	}
	
	void bookTicket() {
		totalamount = numberofTickets * 500; 
		totalTicketsBought += numberofTickets;
		System.out.println("Total no . of tickets bought: "+numberofTickets);
		System.out.println("Total Amount: "+totalamount);
		System.out.println("Successfully booked");
	}
	
	void displayBookingDetails() {
		System.out.println("Passenger Name: "+passengerName);
		System.out.println("Age: "+age);
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);
		System.out.println("No. of Tickets: "+numberofTickets);
		System.out.println("Total Amount: "+(numberofTickets * 500));
	}
	
	static void ticketCounter() {
	
		System.out.println("Tickets bought by all Passengers: "+totalTicketsBought);
		System.out.println("Total Amount Collected: "+(totalTicketsBought * 500));
	}
	
	
	

	public static void main(String[] args) {
		
		Testdemo5 v1 = new Testdemo5();
		Testdemo5 v2 = new Testdemo5();
		
		v1.passengerName = "Vinod";
		v1.age = 22;
		v1.source = "kakinada";
		v1.destination = "Hyderabad";
		v1.numberofTickets = 5;
		
		
		
		v2.passengerName = "Hemanth";
		v2.age = 22;
		v2.source = "kakinada";
		v2.destination = "Hyderabad";
		v2.numberofTickets = 6;
		
		
		v1.bookTicket();
		
		System.out.println("------------------------------------------------------------------------");
		
	    v1.displayBookingDetails();
	    
	    System.out.println("------------------------------------------------------------------------");
	    
	    v2.bookTicket();
	    
	    System.out.println("------------------------------------------------------------------------");
	    
	    v2.displayBookingDetails();
	    
	    System.out.println("------------------------------------------------------------------------");
	    
	    ticketCounter();
	    
		

	}

}
