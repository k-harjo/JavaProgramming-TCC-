package e20_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorAppCheck {
    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Color Mixer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Panel to change color
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(new Color(0, 0, 0)); // Initial color
        frame.add(colorPanel, BorderLayout.CENTER);

        // Create checkboxes
        JCheckBox redCheckBox = new JCheckBox("Red");
        JCheckBox greenCheckBox = new JCheckBox("Green");
        JCheckBox blueCheckBox = new JCheckBox("Blue");

        // Add item listeners
        ItemListener listener = e -> {
            int red = redCheckBox.isSelected() ? 255 : 0;
            int green = greenCheckBox.isSelected() ? 255 : 0;
            int blue = blueCheckBox.isSelected() ? 255 : 0;

            colorPanel.setBackground(new Color(red, green, blue));
        };

        redCheckBox.addItemListener(listener);
        greenCheckBox.addItemListener(listener);
        blueCheckBox.addItemListener(listener);

        // Panel for checkboxes
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(redCheckBox);
        checkBoxPanel.add(greenCheckBox);
        checkBoxPanel.add(blueCheckBox);

        frame.add(checkBoxPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}
