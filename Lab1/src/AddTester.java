import java.awt.Rectangle;

public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);

        System.out.println("Expected Location: (0, 0)");
        System.out.println("Actual Location: (" + box.getX() + ", " + box.getY() + ")");
        System.out.println("Width: " + box.getWidth() + ", Height: " + box.getHeight());
    }
}
