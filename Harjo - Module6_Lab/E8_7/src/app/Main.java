package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius (r): ");
        double r = scanner.nextDouble();

        System.out.print("Enter the height (h): ");
        double h = scanner.nextDouble();

        System.out.printf("Cube Volume with height %.2f: %.2f\n", h, Geometry.cubeVolume(h));
        System.out.printf("Cube Surface with height %.2f: %.2f\n", h, Geometry.cubeSurface(h));
        
        System.out.printf("Sphere Volume with radius %.2f: %.2f\n", r, Geometry.sphereVolume(r));
        System.out.printf("Sphere Surface with radius %.2f: %.2f\n", r, Geometry.sphereSurface(r));

        System.out.printf("Cylinder Volume with radius %.2f and height %.2f: %.2f\n", r, h, Geometry.cylinderVolume(r, h));
        System.out.printf("Cylinder Surface with radius %.2f and height %.2f: %.2f\n", r, h, Geometry.cylinderSurface(r, h));

        System.out.printf("Cone Volume with radius %.2f and height %.2f: %.2f\n", r, h, Geometry.coneVolume(r, h));
        System.out.printf("Cone Surface with radius %.2f and height %.2f: %.2f\n", r, h, Geometry.coneSurface(r, h));

        scanner.close();
    }
}

