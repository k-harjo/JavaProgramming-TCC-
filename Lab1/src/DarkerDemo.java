//E2.12

import java.awt.Color;
import javax.swing.JFrame;

public class DarkerDemo {
    public static void main(String[] args) {
        Color darkerColor = Color.RED.darker().darker();

        System.out.println("Original Color: " + Color.RED);
        System.out.println("Darker Color: " + darkerColor);
    }
}
