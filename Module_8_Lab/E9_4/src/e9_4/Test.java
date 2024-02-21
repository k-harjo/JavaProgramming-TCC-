package e9_4;


public class Test {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount();
     sa.setInterestRate(1.0); 
     sa.deposit(100);
     sa.withdraw(50);
     sa.monthEnd();
     System.out.println("Savings Account balance: " + sa.getBalance()); 

     CheckingAccount ca = new CheckingAccount();
     ca.deposit(100);
     ca.withdraw(30); 
     ca.withdraw(30);
     ca.withdraw(30);
     ca.withdraw(30); 
     ca.withdraw(30); 
     ca.monthEnd();
     System.out.println("Checking Account balance: " + ca.getBalance());
 }
}
