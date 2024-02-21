//P3.9

package app;

public class Battery {
    private double capacity;
    private double remainingCapacity;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.remainingCapacity = capacity;
    }

    public void drain(double amount) {
        if (amount <= remainingCapacity) {
            remainingCapacity -= amount;
        } else {
            System.out.println("Battery drained beyond capacity.");
        }
    }

    public void charge() {
        remainingCapacity = capacity;
    }

    public double getRemainingCapacity() {
        return remainingCapacity;
    }
}
