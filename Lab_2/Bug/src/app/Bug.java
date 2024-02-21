package app;

public class Bug {
    private int position;
    private int direction; // 1 for right, -1 for left

    public Bug(int initialPosition) {
        position = initialPosition;
        direction = 1; // Initially, the bug moves to the right
    }

    public void turn() {
        direction = -direction; // Change direction (right to left or left to right)
    }

    public void move() {
        position += direction; // Move one unit in the current direction
    }

    public int getPosition() {
        return position;
    }
}