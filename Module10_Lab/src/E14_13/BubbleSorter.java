package E14_13;

public class BubbleSorter {
    /**
     * Sorts an array using the bubble sort algorithm.
     * @param a the array to sort
     */
    public static void sort(int[] a) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    // Swap the elements
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        sort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
