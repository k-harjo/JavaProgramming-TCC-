//E2.4

import java.awt.Rectangle;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10, 20, 30);
        double perimeter = 2 * (rect.getWidth() + rect.getHeight());
        System.out.println("Expected Perimeter: " + perimeter);
        System.out.println("Actual Perimeter: " + rect.getWidth() + rect.getHeight());
    }
}
