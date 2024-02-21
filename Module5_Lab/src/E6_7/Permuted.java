package E6_7;

import java.util.Random;
import java.util.Scanner;

public class Permuted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        Random random = new Random();
        int wordLength = word.length();

        for (int repeat = 0; repeat < wordLength; repeat++) {
            int i = random.nextInt(wordLength - 1);
            int j = random.nextInt(wordLength - i - 1) + i + 1;

            String first = word.substring(0, i);
            char charI = word.charAt(i);
            String middle = word.substring(i + 1, j);
            char charJ = word.charAt(j);
            String last = word.substring(j + 1);

            word = first + charJ + middle + charI + last;
        }

        System.out.println("Randomly permuted word: " + word);
    }
}

