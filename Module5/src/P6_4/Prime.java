package P6_4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        input.close();

        PrimeGenerator generator = new PrimeGenerator();
        int prime;

        while ((prime = generator.nextPrime()) <= n) {
            System.out.println(prime);
        }
    }
}

class PrimeGenerator {
    private int current = 1;

    public int nextPrime() {
        current++;
        while (!isPrime(current)) {
            current++;
        }
        return current;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
