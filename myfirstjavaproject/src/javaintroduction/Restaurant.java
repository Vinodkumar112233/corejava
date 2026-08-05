package javaintroduction;

public class Restaurant {
	static String restaurantName = "abc";

	int tableNumber;
	int seats;
	String reserved;

	void reserveTable() {

		reserved = "NOT RESERVED";
		System.out.println("Table Number: " + tableNumber);
		System.out.println("Reserveed: " + reserved);

	}

	void cancelReservation() {
		System.out.println("Table Number :" + tableNumber);
		System.out.println("This Reservation is Cancel");
	}

	void displayDetails() {
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Table Number: " + tableNumber);
		System.out.println("No.of seats available: " + seats);
		System.out.println("Reserved: " + reserved);

	}

	static void changRestaurantName() {
		restaurantName = "xyz";

	}

	static void displayRestaurantName() {
		System.out.println("Updated Restaurant Name: " + restaurantName);
	}

	public static void main(String[] args) {
		Restaurant v = new Restaurant();
		v.tableNumber = 101;
		v.seats = 5;
		v.reserved = "Yes";

		v.displayDetails();
		v.reserveTable();
		v.cancelReservation();

		System.out.println("-------------------------------------------------------------------");
		Restaurant v1 = new Restaurant();
		v1.tableNumber = 102;
		v1.seats = 5;
		v1.reserved = "Yes";
		
		v1.displayRestaurantName();
		v1.displayDetails();
		v1.reserveTable();
		v1.cancelReservation();
		

	}

}
