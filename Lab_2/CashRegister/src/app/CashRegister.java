package app;

import java.util.ArrayList;
import java.util.List;

public class CashRegister {
    private double total;
    private int itemCount;
    private List<Double> itemPrices; 

    public CashRegister() {
        total = 0;
        itemCount = 0;
        itemPrices = new ArrayList<>(); 
    }

    public void addItem(double price) {
        total += price;
        itemCount++;
        itemPrices.add(price); 
    }

    public double getTotal() {
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void clear() {
        total = 0;
        itemCount = 0;
        itemPrices.clear(); 
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("--------------------");
        System.out.println("Items purchased: " + itemCount);

        System.out.println("Item prices:");
        for (int i = 0; i < itemPrices.size(); i++) {
            System.out.println("Item " + (i + 1) + ": $" + itemPrices.get(i));
        }

        System.out.println("--------------------");
        System.out.println("Total amount due: $" + getTotal());
    }
}
