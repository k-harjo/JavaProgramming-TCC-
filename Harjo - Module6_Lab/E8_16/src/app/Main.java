package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Input.readInt(scanner, "Enter an integer between 1 and 10: ", "Invalid input! Please enter a valid integer between 1 and 10.", 1, 10);
        System.out.println("You entered: " + input);
        scanner.close();
    }
}

