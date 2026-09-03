package com.logicalconditionalstatements;
import java.util.Scanner;

public class PizzaBill {

    // Method to get pizza price based on size
    double getPizzaPrice(char size) {

        if (size == 'S' || size == 's') {
            return 70;
        } 
        else if (size == 'M' || size == 'm') {
            return 100;
        } 
        else if (size == 'L' || size == 'l') {
            return 150;
        } 
        else {
            return -1; // Invalid size
        }
    }

    // Method to calculate pizza cost
    double calculatePizzaCost(double price, int quantity) {
        return price * quantity;
    }

    // Method to calculate delivery charge
    double calculateDeliveryCharge(double distance) {

        if (distance >= 0 && distance <= 10) {
            return 70;
        } 
        else if (distance > 10 && distance <= 20) {
            return 100;
        } 
        else if (distance > 20) {
            return 150;
        } 
        else {
            return -1; // Invalid distance
        }
    }

    // Method to calculate final bill
    double calculateFinalBill(double pizzaCost, double deliveryCharge) {
        return pizzaCost + deliveryCharge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PizzaBill obj = new PizzaBill();

        // User input for pizza size
        System.out.println("Enter Pizza Size (S/M/L): ");
        char size = sc.next().charAt(0);

        // User input for quantity
        System.out.println("Enter Quantity: ");
        int quantity = sc.nextInt();

        // User input for delivery distance
        System.out.println("Enter Delivery Distance (km): ");
        double distance = sc.nextDouble();

        // Validation
        double price = obj.getPizzaPrice(size);

        if (price == -1) {
            System.out.println("Invalid Pizza Size!");
        }
        else if (quantity <= 0) {
            System.out.println("Invalid Quantity! Quantity must be greater than 0.");
        }
        else if (distance < 0) {
            System.out.println("Invalid Distance! Distance cannot be negative.");
        }
        else {

            double pizzaCost = obj.calculatePizzaCost(price, quantity);

            double deliveryCharge = obj.calculateDeliveryCharge(distance);

            double finalBill =
                    obj.calculateFinalBill(pizzaCost, deliveryCharge);

            // Bill Summary
            System.out.println("\n========== PIZZA BILL ==========");
            System.out.println("Pizza Size       : " + size);
            System.out.println("Pizza Price      : Rs." + price);
            System.out.println("Quantity         : " + quantity);
            System.out.println("Pizza Cost       : Rs." + pizzaCost);
            System.out.println("Delivery Charge  : Rs." + deliveryCharge);
            System.out.println("--------------------------------");
            System.out.println("Final Bill       : Rs." + finalBill);
            System.out.println("================================");
        }

        sc.close();
    }
}