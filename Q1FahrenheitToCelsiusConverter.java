package Assignment1;

import java.util.Scanner;

public class Q1FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a Fahrenheit degree
        System.out.print("Enter Fahrenheit degree: ");

        // Read the Fahrenheit degree from the user
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Celsius equivalent: " + celsius);
    }
}
