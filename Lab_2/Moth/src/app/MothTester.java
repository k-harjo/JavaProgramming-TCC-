package app;

public class MothTester {
    public static void main(String[] args) {
        Moth moth = new Moth(10.0);

        moth.moveToLight(5.0);

        double actualPosition = moth.getPosition();
        double expectedPosition = 7.5; // (10.0 + 5.0) / 2.0 = 7.5

        System.out.println("Actual Position: " + actualPosition);
        System.out.println("Expected Position: " + expectedPosition);
    }
}