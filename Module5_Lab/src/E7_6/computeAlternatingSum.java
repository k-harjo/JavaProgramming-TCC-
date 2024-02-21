package E7_6;

public class computeAlternatingSum {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int alternatingSum = computeSum(values);
        System.out.println("Alternating Sum: " + alternatingSum);
    }

    public static int computeSum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) { // Even index, add to sum
                sum += values[i];
            } else { // Odd index, subtract from sum
                sum -= values[i];
            }
        }
        return sum;
    }
}
