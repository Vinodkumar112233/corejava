package com.languagefundamentals;

public class Testdemo27 {

    static int result;

    int addition(int a, int b) {
        result = a + b;
        return substraction(result, b);
    }

    int substraction(int result, int b) {
        result = result - b;
        return division(result);
    }

    static int division(int result) {
        result = result / 2;
        return multiplication(result);
    }

    static int multiplication(int result) {
        result = result * 3;
        return result;
    }

    public static void main(String[] args) {

        // Only ONE object
        Testdemo27 obj = new Testdemo27();

        // Only ONE method call in main
        int arithmetic = obj.addition(3, 5);

        System.out.println(arithmetic);
    }
}