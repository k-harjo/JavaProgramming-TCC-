package e9_1;

public class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Getter and Setter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override getSalary to include the bonus
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager [name=" + getName() + ", baseSalary=" + getSalary() 
            + ", bonus=" + bonus + "]";
    }
}
