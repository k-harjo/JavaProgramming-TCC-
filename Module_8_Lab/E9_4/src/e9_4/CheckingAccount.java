package e9_4;

//Step 5: CheckingAccount subclass
public class CheckingAccount extends BankAccount {
private static final int FREE_WITHDRAWALS = 3;
private static final double WITHDRAWAL_FEE = 1.0;
private static final double FIRST_OVERDRAFT_FEE = 20.0;
private static final double SUBSEQUENT_OVERDRAFT_FEE = 30.0;

private int withdrawalCount;
private boolean hasOverdrafted;

public CheckingAccount() {
 withdrawalCount = 0;
 hasOverdrafted = false;
}

@Override
public void withdraw(double amount) {
 super.withdraw(amount);
 withdrawalCount++;

 if (balance < 0) {
     if (!hasOverdrafted) {
         balance -= FIRST_OVERDRAFT_FEE;
         hasOverdrafted = true;
     } else {
         balance -= SUBSEQUENT_OVERDRAFT_FEE;
     }
 }

 if (withdrawalCount > FREE_WITHDRAWALS) {
     balance -= WITHDRAWAL_FEE;
 }
}

@Override
public void monthEnd() {
 withdrawalCount = 0;
 hasOverdrafted = false;
}
}