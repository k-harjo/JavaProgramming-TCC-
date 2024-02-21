package app;

public class Product {
    private String name;
    private double price;

    public Product(String productName, double productPrice) {
        name = productName;
        price = productPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reducePrice(double amount) {
        if (amount >= 0) {
            price -= amount;
        } else {
            System.out.println("Invalid amount. Price reduction must be non-negative.");
        }
    }
}
