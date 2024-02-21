package balloon;

public class BalloonTester {
    public static void main(String[] args) {
        Balloon myBalloon = new Balloon();

        myBalloon.addAir(100.0);
        System.out.println("Current Volume: " + myBalloon.getVolume());
        System.out.println("Current Surface Area: " + myBalloon.getSurfaceArea());
        System.out.println("Current Radius: " + myBalloon.getRadius());

        myBalloon.addAir(100.0);
        System.out.println("\nCurrent Volume: " + myBalloon.getVolume());
        System.out.println("Current Surface Area: " + myBalloon.getSurfaceArea());
        System.out.println("Current Radius: " + myBalloon.getRadius());
    }
}
