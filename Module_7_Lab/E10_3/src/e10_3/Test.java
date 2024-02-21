package e10_3;

public class Test {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 160),
            new Person("Bob", 175),
            new Person("Charlie", 168),
            new Person("David", 182)
        };

        double averageHeight = Data.average(people);
        Person tallest = (Person) Data.largest(people);

        System.out.println("Average height: " + averageHeight + " cm");
        System.out.println("Tallest person: " + tallest.getName() + " with height: " + tallest.getMeasure() + " cm");
    }
}