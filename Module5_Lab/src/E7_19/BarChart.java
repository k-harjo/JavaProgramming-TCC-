package E7_19;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of values
        System.out.print("Enter the number of values: ");
        int numValues = input.nextInt();

        int[] values = new int[numValues];

        // Read the values and find the maximum
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = input.nextInt();
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        // Calculate the scaling factor
        double scaleFactor = 40.0 / maxValue;

        // Display the bar chart
        for (int i = 0; i < numValues; i++) {
            int barLength = (int) (values[i] * scaleFactor);
            for (int j = 0; j < barLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
