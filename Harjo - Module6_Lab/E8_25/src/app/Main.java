package app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.deposit(100);
        account.withdraw(50);
        
        ArrayList<Double> statement = account.getStatement();
        System.out.println("Statement: " + statement); // Prints: Statement: [100.0, -50.0]
        
        account.clearStatement();
        
        statement = account.getStatement();
        System.out.println("Statement after clear: " + statement); // Prints: Statement after clear: []
    }
}

