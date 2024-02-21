package balloon;

import java.lang.Math;

public class Balloon {
    private double volume;

    public Balloon() {
        volume = 0.0;
    }

    public void addAir(double amount) {
        if (amount > 0) {
            volume += amount;
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        double radius = getRadius();
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return Math.cbrt((3 * volume) / (4 * Math.PI));
    }
}
