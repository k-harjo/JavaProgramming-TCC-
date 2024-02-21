package e20_2;

import javax.swing.*;
import java.awt.*;

public class ColorApp{
    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Color Changer with Icons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Panel to change color
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        frame.add(colorPanel, BorderLayout.CENTER);

        // Create buttons with icons
        JButton redButton = new JButton(new ImageIcon("red_1.png")); 
        JButton greenButton = new JButton(new ImageIcon("green_1.png")); 
        JButton blueButton = new JButton(new ImageIcon("blue_1.png")); 

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

