package e13_5;


public class BinaryNumber {
    public static String toBinary(int n) {
        // convert to binary
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            int remainder = n % 2;
            int quotient = n / 2;
            String binaryPrefix = toBinary(quotient);
            return binaryPrefix + remainder;
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 24;
        String binaryRepresentation = toBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryRepresentation);
    }
}