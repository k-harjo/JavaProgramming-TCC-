package e9_2;

public class Test {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100);
        account.deposit(50); 
        account.withdraw(50); 
        account.withdraw(150); 
        System.out.println("Final balance: " + account.getBalance());
    }
}
