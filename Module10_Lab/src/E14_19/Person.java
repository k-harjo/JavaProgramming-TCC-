package E14_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": ");
            String name = scanner.nextLine();
            people.add(new Person(name));
        }

        Collections.sort(people);

        System.out.println("\nFirst person: " + people.get(0));
        System.out.println("Last person: " + people.get(people.size() - 1));
    }
}
