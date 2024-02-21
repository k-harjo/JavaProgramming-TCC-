package app;

import java.awt.geom.Ellipse2D;

public class Main {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 10, 5); // Example ellipse
        System.out.println("Perimeter of the ellipse: " + Geometry.perimeter(ellipse));
        System.out.println("Area of the ellipse: " + Geometry.area(ellipse));
    }
}
