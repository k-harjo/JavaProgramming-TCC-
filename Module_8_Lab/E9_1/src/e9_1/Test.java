package e9_1;

public class Test {

    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 50000, 5000);
        System.out.println(mgr); 

        mgr.setBonus(6000);
        System.out.println("Updated bonus: " + mgr.getBonus());
        System.out.println("Updated total salary (including bonus): " + mgr.getSalary());
    }
}
