package javaintroduction;

public class Movie {
	static String theatreName = "xyz";
	String movieName;
	int ticketId;
	int seatno;
	String booked;
	
	void bookTicket(){
		System.out.println("Ticked Id: "+ticketId);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Ticket is booked or not : "+booked);
		
		
	}
	void cancelTicket() {
		System.out.println("Ticked Id: "+ticketId);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Ticket is Cancel");
		
		
	}
	
	void displayDetails() {
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Ticked Id: "+ticketId);
		System.out.println("Seat No: "+seatno);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Booking Status: booked");

		
	}
	void changeTheatrename() {
		theatreName = "abc";
		System.out.println("Theatre Name: "+theatreName);
	}
	

	public static void main(String[] args) {
		Movie v1 = new Movie();
		v1.movieName = "geetha govindham";
		v1.ticketId = 987;
		v1.seatno = 20;
		v1.booked = "yes";
		
		Movie v2 = new Movie();
		v2.movieName = "seetha ramam";
		v2.ticketId = 999;
		v2.seatno = 40;
		v2.booked = "yes";
		
		v1.displayDetails();
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		v2.displayDetails();
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		v2.cancelTicket();
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		
	v1.changeTheatrename();
	v2.changeTheatrename();
		
	System.out.println("---------------------------------------------------------------------------------------");
	
	v1.displayDetails();
	
	System.out.println("---------------------------------------------------------------------------------------");
	
	v2.displayDetails();

	}

}
