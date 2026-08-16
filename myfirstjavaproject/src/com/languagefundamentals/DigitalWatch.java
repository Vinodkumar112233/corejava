package com.languagefundamentals;

public class DigitalWatch {
	String brandName;
	String watchType;
	int hours;
	int minutes;
	int seconds;
	int price;

	void displayTime() {
		System.out.println("Brand Name: " + brandName);
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);
	}

	void displayWatchDetails() {
		System.out.println("Brand Name: " + brandName);
		System.out.println("Watch Type: " + watchType);
		System.out.println("Price:: " + price);

	}

	void updateHours() {
		hours++;

	}

	void updateMinutes() {
		minutes += 5;
	}

	public static void main(String[] args) {
		DigitalWatch v1 = new DigitalWatch();
		v1.brandName = "Wrogn";
		v1.watchType = "Normal Watch";
		v1.price = 9999;
		v1.hours = 12;
		v1.minutes = 30;
		v1.seconds = 45;

		v1.displayTime();
		v1.displayWatchDetails();
		v1.updateHours();
		v1.updateMinutes();

		System.out.println("-------------------------------------------------------");

		v1.displayTime();
		v1.displayWatchDetails();
		System.out.println("-------------------------------------------------------");

//		DigitalWatch v2 = new DigitalWatch();
//		v2.brandName = "Bolt";
//		v2.watchType = "Normal Watch";
//		v2.price= 599;
//		v2.updateHours();
//		v2.updateMinutes();
//		v2.displayTime();
//		v2.displayWatchDetails();

	}

}
