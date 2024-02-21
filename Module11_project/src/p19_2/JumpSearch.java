package p19_2;

public class JumpSearch {

    public static int jumpSearch(int[] array, int target) {
        int n = array.length;
        int step = (int) Math.floor(Math.sqrt(n));

        int prev = 0;
        while (array[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; 
            }
        }

        while (array[prev] < target) {
            prev++;

            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (array[prev] == target) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int target = 55;
        System.out.println("Index of " + target + " is: " + jumpSearch(array, target));
    }
}
