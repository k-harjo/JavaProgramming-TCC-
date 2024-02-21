package app;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        
        System.out.println("Location: {" + robot.getLocation() + "} Direction: " + robot.getDirection());
        
        robot.turnRight();
        robot.move();
        System.out.println("Location: {" + robot.getLocation() + "} Direction: " + robot.getDirection());
        
        robot.turnRight();
        robot.move();
        System.out.println("Location: {" + robot.getLocation() + "} Direction: " + robot.getDirection());
    }
}
