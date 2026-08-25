package com.languagefundamentals;

import java.util.Scanner;

public class Testdemo24 {

    static Scanner sc = new Scanner(System.in);

    double days;

    String companyName() {
        return "Zoomcar";
    }

    double dailyrent() {
        return 1500;
    }

    double days() {
        return days;
    }

    double calculateRentalCost() {
        return 1500 * days;
    }

    double fixedInsurance() {
        return 500;
    }

    double totalCost() {
        return 500 + calculateRentalCost();
    }

    public static void main(String[] args) {

        System.out.println("Main method Started:");

        Testdemo24 v1 = new Testdemo24();

        String companyName = v1.companyName();
        System.out.println("Company Name: " + companyName);

        double dailyRent = v1.dailyrent();
        System.out.println("Daily Rent: " + dailyRent);

        System.out.println("Enter days:");
        v1.days = sc.nextDouble();

        double totalDays = v1.days();
        System.out.println("Total Days: " + totalDays);

        double rentalCost = v1.calculateRentalCost();
        System.out.println("Total Rental Cost: " + rentalCost);

        double insurance = v1.fixedInsurance();
        System.out.println("Insurance: " + insurance);

        double totalCost = v1.totalCost();
        System.out.println("Total Cost: " + totalCost);
    }
}
