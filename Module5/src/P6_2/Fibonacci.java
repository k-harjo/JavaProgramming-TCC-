package P6_2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();

        int fold1 = 1;
        int fold2 = 1;
        int fnew;

        if (n == 1 || n == 2) {
            System.out.println("The " + n + "th Fibonacci number is 1");
        } else {
            for (int i = 3; i <= n; i++) {
                fnew = fold1 + fold2;
                fold2 = fold1;
                fold1 = fnew;
            }
            System.out.println("The " + n + "th Fibonacci number is " + fold1);
        }
    }
}
