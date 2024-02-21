package app;

public class Moth {
    private double position;

    public Moth(double initialPosition) {
        position = initialPosition;
    }

    public void moveToLight(double lightPosition) {
        position = (position + lightPosition) / 2.0; // Move halfway to the light
    }

    public double getPosition() {
        return position;
    }
}


