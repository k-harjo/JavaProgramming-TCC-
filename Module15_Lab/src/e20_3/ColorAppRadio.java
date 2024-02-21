package e20_3;

import javax.swing.*;
import java.awt.*;

public class ColorAppRadio {
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

        // Create radio buttons
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton greenButton = new JRadioButton("Green");
        JRadioButton blueButton = new JRadioButton("Blue");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(greenButton);
        group.add(blueButton);

        // Add action listeners
        redButton.addActionListener(e -> colorPanel.setBackground(Color.RED));
        greenButton.addActionListener(e -> colorPanel.setBackground(Color.GREEN));
        blueButton.addActionListener(e -> colorPanel.setBackground(Color.BLUE));

        // Panel for radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.add(redButton);
        radioPanel.add(greenButton);
        radioPanel.add(blueButton);

        frame.add(radioPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}
