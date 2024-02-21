package e10_29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[10];

        System.out.println("Please enter 10 names:");

        for (int i = 0; i < 10; i++) {
            String name = scanner.nextLine();
            persons[i] = new Person(name);
        }

        Person firstPerson = persons[0];
        Person lastPerson = persons[0];

        for (Person p : persons) {
            if (p.compareTo(firstPerson) < 0) {
                firstPerson = p;
            }
            if (p.compareTo(lastPerson) > 0) {
                lastPerson = p;
            }
        }

        System.out.println("First person: " + firstPerson);
        System.out.println("Last person: " + lastPerson);
    }
}
