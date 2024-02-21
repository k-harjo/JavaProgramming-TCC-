package intergerOperations;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the first integer
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        // Prompt the user for the second integer
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Calculate and print the sum
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Calculate and print the difference
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Calculate and print the product
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Calculate and print the average
        double average = (double) (num1 + num2) / 2;
        System.out.println("Average: " + average);

        // Calculate and print the distance 
        int distance = Math.abs(difference);
        System.out.println("Distance: " + distance);

        // Calculate and print the maximum 
        int maximum = Math.max(num1, num2);
        System.out.println("Maximum: " + maximum);

        // Calculate and print the minimum 
        int minimum = Math.min(num1, num2);
        System.out.println("Minimum: " + minimum);

        // Close the scanner
        input.close();
    }
}
