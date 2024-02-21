package app;

public class BugTester {
    public static void main(String[] args) {
        Bug bugsy = new Bug(10);
        
        // Move and turn the bug, then move again
        bugsy.move(); // Now the position is 11
        bugsy.turn();
        bugsy.move(); // Now the position is 10
        
        // Print the actual and expected positions
        int actualPosition = bugsy.getPosition();
        int expectedPosition = 10;
        System.out.println("Actual Position: " + actualPosition);
        System.out.println("Expected Position: " + expectedPosition);
    }
}