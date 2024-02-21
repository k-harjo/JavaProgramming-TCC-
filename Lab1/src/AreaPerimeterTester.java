import java.awt.Rectangle;

public class AreaPerimeterTester {
    public static void main(String[] args) {
        double area = 42.0;
        double perimeter = 42.0;

        // For a rectangle: area = width * height, perimeter = 2 * (width + height)
        double width = Math.sqrt(area);  // Calculate width based on area
        double height = perimeter / 2 - width;  // Calculate height based on perimeter

        System.out.println("Rectangle with Area 42:");
        System.out.println("Width: " + width + ", Height: " + height);

        System.out.println("Rectangle with Perimeter 42:");
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

