package app;

public class ProductPrinter {
    public static void main(String[] args) {
        // Create two Product objects
        Product toaster = new Product("Toaster", 29.95);
        Product blender = new Product("Blender", 49.99);

        // Print the initial name and price of each product
        System.out.println("Initial Product Details:");
        System.out.println("Product 1: " + toaster.getName() + " - $" + toaster.getPrice());
        System.out.println("Product 2: " + blender.getName() + " - $" + blender.getPrice());

        // Reduce the prices of both products by $5.00
        toaster.reducePrice(5.00);
        blender.reducePrice(5.00);

        // Print the updated prices of each product
        System.out.println("\nProduct Details after Price Reduction:");
        System.out.println("Product 1: " + toaster.getName() + " - $" + toaster.getPrice());
        System.out.println("Product 2: " + blender.getName() + " - $" + blender.getPrice());
    }
}
