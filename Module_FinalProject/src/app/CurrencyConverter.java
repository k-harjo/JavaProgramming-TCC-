package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    private static final double EUR_TO_USD = 1.42;
    private static final double GBP_TO_USD = 1.64;
    private static final double GBP_TO_EUR = 1.13;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(0, 1));

        // Create and add components
        JLabel titleLabel = new JLabel("Currency Converter", SwingConstants.CENTER);
        JTextField amountField = new JTextField(10);
        String[] currencies = {"USD", "EUR", "GBP"};
        JComboBox<String> fromCurrency = new JComboBox<>(currencies);
        JComboBox<String> toCurrency = new JComboBox<>(currencies);
        JButton convertButton = new JButton("Convert");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");
        JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        frame.add(titleLabel);
        frame.add(amountField);
        frame.add(fromCurrency);
        frame.add(toCurrency);
        frame.add(convertButton);
        frame.add(resultLabel);
        frame.add(clearButton);
        frame.add(exitButton);

        // Convert button action
        convertButton.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                String from = (String) fromCurrency.getSelectedItem();
                String to = (String) toCurrency.getSelectedItem();
                if (from.equals(to)) {
                    JOptionPane.showMessageDialog(frame, "Please select different currencies.");
                    return;
                }
                double result = convertCurrency(amount, from, to);
                resultLabel.setText(String.format("Result: %.2f %s", result, to));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
            }
        });

        // Clear button action
        clearButton.addActionListener(e -> {
            amountField.setText("");
            resultLabel.setText("Result: ");
        });

        // Exit button action
        exitButton.addActionListener(e -> frame.dispose());

        // Display the frame
        frame.setVisible(true);
    }

    private static double convertCurrency(double amount, String from, String to) {
        if (from.equals("EUR") && to.equals("USD")) {
            return amount * EUR_TO_USD;
        } else if (from.equals("GBP") && to.equals("USD")) {
            return amount * GBP_TO_USD;
        } else if (from.equals("GBP") && to.equals("EUR")) {
            return amount * GBP_TO_EUR;
        } else if (from.equals("USD") && to.equals("EUR")) {
            return amount / EUR_TO_USD;
        } else if (from.equals("USD") && to.equals("GBP")) {
            return amount / GBP_TO_USD;
        } else if (from.equals("EUR") && to.equals("GBP")) {
            return amount / GBP_TO_EUR;
        }
        return amount; // In case of same currency
    }
}
