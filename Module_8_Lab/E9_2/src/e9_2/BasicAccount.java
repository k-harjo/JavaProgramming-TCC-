package e9_2;

public class BasicAccount extends BankAccount {

    public BasicAccount() {
        super();
    }

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds the current balance. Transaction declined.");
        }
    }
}
