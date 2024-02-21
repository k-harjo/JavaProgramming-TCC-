package E6_12;

public class PowersOfTwo {
    public static void main(String[] args) {
        int exponent = 0;
        long result = 1;

        System.out.println("Powers of 2 from 2^0 to 2^20:");
        while (exponent <= 20) {
            System.out.println("2^" + exponent + " = " + result);
            result *= 2;
            exponent++;
        }
    }
}
