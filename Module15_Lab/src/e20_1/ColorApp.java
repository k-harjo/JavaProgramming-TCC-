package e20_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorApp {
    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Panel to change color
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        frame.add(colorPanel, BorderLayout.CENTER);

        // Create buttons
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        // Add action listeners
        redButton.addActionListener(e -> colorPanel.setBackground(Color.RED));
        greenButton.addActionListener(e -> colorPanel.setBackground(Color.GREEN));
        blueButton.addActionListener(e -> colorPanel.setBackground(Color.BLUE));

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}

