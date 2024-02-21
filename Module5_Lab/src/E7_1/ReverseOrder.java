package E7_1;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read ten numbers
        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display them in reverse order
        System.out.println("\nNumbers in reverse order:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
