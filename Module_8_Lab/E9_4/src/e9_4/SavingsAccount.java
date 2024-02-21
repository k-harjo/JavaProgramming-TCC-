package e9_4;

//Step 5: SavingsAccount subclass
public class SavingsAccount extends BankAccount {
private double interestRate;
private double minimumBalance = balance;

public SavingsAccount() {
}

public void setInterestRate(double rate) {
   interestRate = rate;
}

@Override
public void withdraw(double amount) {
   super.withdraw(amount);
   minimumBalance = Math.min(minimumBalance, balance);
}

@Override
public void monthEnd() {
   balance += minimumBalance * interestRate / 100;
   minimumBalance = balance;
}
}

