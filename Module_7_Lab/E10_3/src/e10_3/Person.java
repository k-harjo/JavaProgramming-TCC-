package e10_3;

public class Person implements Measurable {
    private String name;
    private double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public double getMeasure() {
        return height;
    }

    public String getName() {
        return name;
    }
}
