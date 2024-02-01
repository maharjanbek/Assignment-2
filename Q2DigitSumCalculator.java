

import java.util.Scanner;

public class Q2DigitSumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");

        // Read the integer from the user
        int number = scanner.nextInt();

        // Validate the input range
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a valid integer between 0 and 1000.");
        } else {
            // Calculate the sum of digits
            int digitSum = 0;
            int originalNumber = number; // Save the original number for display

            while (number != 0) {
                digitSum += number % 10; // Add the last digit to the sum
                number /= 10; // Remove the last digit
            }

            // Display the result
            System.out.println("The sum of digits in " + originalNumber + " is: " + digitSum);
        }
    }
}
