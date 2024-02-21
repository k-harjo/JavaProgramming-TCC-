package E7_7;

public class ReverseArray {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        reverse(values);
        System.out.println("Reversed Array:");
        for (int value : values) {
            System.out.print(value + " ");
        }
    }

    public static void reverse(int[] values) {
        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }
}
