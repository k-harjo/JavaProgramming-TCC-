package E7_4;

public class sumWithoutSmallest {
    public static void main(String[] args) {
        int[] values = {4, 7, 1, 9, 2, 8};
        int result = sumSmallest(values);
        System.out.println("Sum without the smallest value: " + result);
    }

    public static int sumSmallest(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int sum = values[0];
        int smallest = values[0];

        for (int i = 1; i < values.length; i++) {
            sum += values[i];
            if (values[i] < smallest) {
                sum -= smallest; // Subtract the previous smallest value
                smallest = values[i]; // Update the smallest value
            }
        }

        return sum - smallest; // Subtract the smallest value from the sum
    }
}
