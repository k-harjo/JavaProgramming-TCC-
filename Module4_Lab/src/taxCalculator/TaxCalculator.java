package taxCalculator;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Your income tax is: $" + tax);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0.0;

        if (income <= 50000) {
            tax = income * 0.01;
        } else if (income <= 75000) {
            tax = 50000 * 0.01 + (income - 50000) * 0.02;
        } else if (income <= 100000) {
            tax = 50000 * 0.01 + 25000 * 0.02 + (income - 75000) * 0.03;
        } else if (income <= 250000) {
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + (income - 100000) * 0.04;
        } else if (income <= 500000) {
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + (income - 250000) * 0.05;
        } else {
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + 250000 * 0.05 + (income - 500000) * 0.06;
        }

        return tax;
    }
}

