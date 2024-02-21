package E14_9;

import java.util.Random;

public class InsertionSortPerformanceTest {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Change these values to adjust the range of array sizes
        int minSize = 1000;
        int maxSize = 10000;
        int step = 1000;
        
        System.out.printf("%-10s %-10s\n", "Array Size", "Time (ms)");
        for (int size = minSize; size <= maxSize; size += step) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }
            
            long startTime = System.currentTimeMillis();
            InsertionSorter.sort(array);
            long endTime = System.currentTimeMillis();
            
            System.out.printf("%-10d %-10d\n", size, endTime - startTime);
        }
    }
}
