package P7_3;

import java.util.Random;

public class DieTosses {
    public static void main(String[] args) {
        int[] tosses = new int[20];
        Random rand = new Random();

        for (int i = 0; i < tosses.length; i++) {
            tosses[i] = rand.nextInt(6) + 1;
        }

        int longestRunStart = 0;
        int longestRunLength = 1;
        int currentRunStart = 0;
        int currentRunLength = 1;

        for (int i = 1; i < tosses.length; i++) {
            if (tosses[i] == tosses[i - 1]) {
                currentRunLength++;
                if (currentRunLength > longestRunLength) {
                    longestRunLength = currentRunLength;
                    longestRunStart = currentRunStart;
                }
            } else {
                currentRunStart = i;
                currentRunLength = 1;
            }
        }

        System.out.print("Die Tosses: ");
        for (int i = 0; i < tosses.length; i++) {
            if (i == longestRunStart) {
                System.out.print("(");
            }
            System.out.print(tosses[i]);
            if (i == longestRunStart + longestRunLength - 1) {
                System.out.print(") ");
            } else {
                System.out.print(" ");
            }
        }
    }
}
