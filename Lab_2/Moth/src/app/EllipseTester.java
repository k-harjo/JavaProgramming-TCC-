package app;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class EllipseTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ellipse Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EllipseTester ellipseDrawer = new EllipseTester();

        frame.add(ellipseDrawer);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
