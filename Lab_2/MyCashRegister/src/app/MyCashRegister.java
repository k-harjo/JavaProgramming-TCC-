package app;

public class MyCashRegister {
    private double total;
    private int itemCount;
    private double salesTotal; // New variable to track total sales
    private int salesCount; // New variable to track the number of sales

    public MyCashRegister() {
        total = 0;
        itemCount = 0;
        salesTotal = 0; // Initialize total sales to zero
        salesCount = 0; // Initialize sales count to zero
    }

    public void addItem(double price) {
        total += price;
        itemCount++;
        salesTotal += price; // Add the sale amount to total sales
        salesCount++; // Increment the sales count
    }

    public double getTotal() {
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getSalesTotal() {
        return salesTotal; // Return the total sales
    }

    public int getSalesCount() {
        return salesCount; // Return the number of sales
    }

    public void clear() {
        total = 0;
        itemCount = 0;
    }

    // Method to reset counters for the next day's sales
    public void reset() {
        salesTotal = 0; // Reset total sales to zero
        salesCount = 0; // Reset sales count to zero
    }
}
