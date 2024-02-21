package app;

import java.util.Scanner;

public class Input {

    public static int readInt(Scanner in, String prompt, String error, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            while (!in.hasNextInt()) {
                System.out.println(error);
                System.out.print(prompt);
                in.next(); 
            }
            input = in.nextInt();
            if (input < min || input > max) {
                System.out.println(error);
            }
        } while (input < min || input > max);
        
        return input;
    }
}
