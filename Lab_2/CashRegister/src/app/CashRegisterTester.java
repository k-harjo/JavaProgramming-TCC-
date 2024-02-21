package app;

public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        register.addItem(10.0);
        register.addItem(15.0);
        register.addItem(8.5);

        register.printReceipt();
    }
}
