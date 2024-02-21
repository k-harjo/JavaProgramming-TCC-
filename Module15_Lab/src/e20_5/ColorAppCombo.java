package e20_5;

import javax.swing.*;
import java.awt.*;

public class ColorAppCombo {
    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Panel to change color
        JPanel colorPanel = new JPanel();
        frame.add(colorPanel, BorderLayout.CENTER);

        // Create combo box with color options
        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);

        // Add action listener to combo box
        colorComboBox.addActionListener(e -> {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            switch (selectedColor) {
                case "Red":
                    colorPanel.setBackground(Color.RED);
                    break;
                case "Green":
                    colorPanel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    colorPanel.setBackground(Color.BLUE);
                    break;
            }
        });

        // Add combo box to frame
        frame.add(colorComboBox, BorderLayout.NORTH);

        // Display the frame
        frame.setVisible(true);
    }
}
