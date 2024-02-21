package E14_3;

import java.util.Random;
import java.util.Scanner;

public class SelectionSortTiming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the smallest value of n: ");
        int smallestN = scanner.nextInt();
        System.out.print("Enter the largest value of n: ");
        int largestN = scanner.nextInt();
        System.out.print("Enter the number of measurements: ");
        int measurements = scanner.nextInt();
        scanner.close();

        System.out.println("Size\tAverage Time (ms)");
        for (int n = smallestN; n <= largestN; n++) {
            long totalTime = 0;
            for (int i = 0; i < measurements; i++) {
                int[] array = generateRandomArray(n);
                long startTime = System.nanoTime();
                selectionSort(array);
                long endTime = System.nanoTime();
                totalTime += (endTime - startTime) / 1_000_000;  // Convert to milliseconds
            }
            double averageTime = (double) totalTime / measurements;
            System.out.println(n + "\t" + averageTime);
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
