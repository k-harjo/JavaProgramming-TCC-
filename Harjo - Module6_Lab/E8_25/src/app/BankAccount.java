package app;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<Double> statement;

    public BankAccount() {
        this.balance = 0;
        this.statement = new ArrayList<>();
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            this.statement.add(amount); // Record deposit as a positive value
        } else {
            System.out.println("Amount to deposit should be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            this.balance -= amount;
            this.statement.add(-amount); // Record withdrawal as a negative value
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public ArrayList<Double> getStatement() {
        return new ArrayList<>(this.statement); // Return a copy of the statement
    }

    public void clearStatement() {
        this.statement.clear(); // Clear the statement
    }

    // ... other methods like getBalance, etc., if needed
}
