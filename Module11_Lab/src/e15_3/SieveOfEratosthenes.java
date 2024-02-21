package e15_3;

import java.util.HashSet;
import java.util.Set;

public class SieveOfEratosthenes {

    public static Set<Integer> findPrimes(int n) {
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }

        for (int factor = 2; factor * factor <= n; factor++) {
            if (primes.contains(factor)) {
                for (int j = factor * factor; j <= n; j += factor) {
                    primes.remove(j);
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30; 
        Set<Integer> primes = findPrimes(n);
        System.out.println("Primes up to " + n + ": " + primes);
    }
}
