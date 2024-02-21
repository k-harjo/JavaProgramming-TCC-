package app;

import java.awt.geom.Ellipse2D;

public class Geometry {

    public static double cubeVolume(double h) {
        return Math.pow(h, 3);
    }

    public static double cubeSurface(double h) {
        return 6 * Math.pow(h, 2);
    }

    public static double sphereVolume(double r) {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double coneVolume(double r, double h) {
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double coneSurface(double r, double h) {
        return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
    } 
    
    public static double perimeter(Ellipse2D.Double e) {
        double a = e.getWidth() / 2; 
        double b = e.getHeight() / 2; 

        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public static double area(Ellipse2D.Double e) {
        double a = e.getWidth() / 2; 
        double b = e.getHeight() / 2; 

        return Math.PI * a * b;
    }
}
