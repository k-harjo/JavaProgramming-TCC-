package e9_4;


//Step 4: Base class BankAccount
public class BankAccount {
protected double balance;

public void deposit(double amount) {
 balance += amount;
}

public void withdraw(double amount) {
 balance -= amount;
}

public void monthEnd() {
 // Default behavior is doing nothing
}

public double getBalance() {
 return balance;
}
}