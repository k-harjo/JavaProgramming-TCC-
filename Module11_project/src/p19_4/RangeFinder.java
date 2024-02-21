package p19_4;

import java.util.Arrays;

public class RangeFinder {


    public static int[] findSmallestRange(int[] data, int[] targets) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int target : targets) {
            int index = Arrays.binarySearch(data, target);
            
            if (index < 0) {
                index = -index - 1; 
            }

            if (index < start) {
                start = index;
            }
            if (index > end) {
                end = index;
            }
        }

        if (start > 0 && targets[0] < data[0]) {
            start = -1;
        }
        if (end < data.length - 1 && targets[targets.length - 1] > data[data.length - 1]) {
            end = data.length;
        }

        if (start == Integer.MAX_VALUE) {
            start = -1;
        }
        if (end == Integer.MIN_VALUE) {
            end = data.length;
        }

        return new int[] {start, end};
    }

    public static void main(String[] args) {
        int[] data = {1, 4, 7, 10, 12, 17, 21, 23, 26, 30};
        int[] targets = {8, 2, 9, 17};

        int[] range = findSmallestRange(data, targets);
        System.out.println("The smallest range is from " + range[0] + " to " + range[1]);
    }
}
