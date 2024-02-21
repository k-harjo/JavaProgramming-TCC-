package P6_20;

import javax.swing.*;
import java.awt.*;

public class Checkerboard extends JPanel {
    private static final int SIZE = 8;
    private static final int SQUARE_SIZE = 50;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                int x = col * SQUARE_SIZE;
                int y = row * SQUARE_SIZE;

                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }

                g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkerboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Checkerboard());
        frame.setSize(SIZE * SQUARE_SIZE, SIZE * SQUARE_SIZE);
        frame.setVisible(true);
    }
}
