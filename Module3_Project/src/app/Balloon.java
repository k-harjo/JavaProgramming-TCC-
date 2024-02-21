//P3.3

package app;

public class Balloon {
    private double radius; // Initial radius is 0

    public void inflate(double amount) {
        radius += amount;
    }

    public double getVolume() {
        // Calculate volume of a sphere using V = (4/3) * π * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
