package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        while (true) {
            System.out.println("Please enter a floating-point value:");

            for (int i = 0; i < 2; i++) {
                if (scanner.hasNextDouble()) {
                    double value = scanner.nextDouble();
                    sum += value;  
                    break; 
                } else {
                    if (i == 0) {
                        System.out.println("Invalid input. Please enter a valid floating-point value:");
                        scanner.next();  
                    }
                }
            }

            if (!scanner.hasNextDouble()) {
                System.out.println("You've entered invalid input twice. Exiting...");
                break;
            }
        }

        System.out.println("Sum of all correctly specified values: " + sum);
        scanner.close();
    }
}
