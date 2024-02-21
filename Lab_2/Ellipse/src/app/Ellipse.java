package app;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Ellipse extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Create a Graphics2D object for advanced drawing
        Graphics2D g2d = (Graphics2D) g;

        // Create an ellipse that touches the window boundaries
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, width, height);

        // Set the fill color to blue
        g2d.setColor(Color.BLUE);

        // Fill the ellipse with blue
        g2d.fill(ellipse);

        // Set the outline color to black
        g2d.setColor(Color.BLACK);

        // Draw the outline of the ellipse
        g2d.draw(ellipse);
    }
}
