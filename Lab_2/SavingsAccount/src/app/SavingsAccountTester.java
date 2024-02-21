package app;

public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000.0, 10.0);

        System.out.println("Initial Balance: $" + account.getBalance());
        System.out.println("Interest Rate: " + account.getInterestRate() + "%");

        account.addInterest();

        System.out.println("Balance after adding interest: $" + account.getBalance());
    }
}
