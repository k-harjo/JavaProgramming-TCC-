package app;

public class Robot {
    private int x;
    private int y;
    private String direction;
    
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = "N"; // Initially facing North
    }
    
    public void turnLeft() {
        switch (direction) {
            case "N": direction = "W"; break;
            case "E": direction = "N"; break;
            case "S": direction = "E"; break;
            case "W": direction = "S"; break;
        }
    }
    
    public void turnRight() {
        switch (direction) {
            case "N": direction = "E"; break;
            case "E": direction = "S"; break;
            case "S": direction = "W"; break;
            case "W": direction = "N"; break;
        }
    }
    
    public void move() {
        switch (direction) {
            case "N": y++; break;
            case "E": x++; break;
            case "S": y--; break;
            case "W": x--; break;
        }
    }
    
    public String getLocation() {
        return "x=" + x + ", y=" + y; // return location as a string
    }
    
    public String getDirection() {
        return direction;
    }
}
