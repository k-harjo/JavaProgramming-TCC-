package e15_4;

import java.util.Scanner;
import java.util.TreeMap;

public class StudentGrades {

    public static void main(String[] args) {
        TreeMap<String, String> grades = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String input, name, grade;

        while (true) {
            System.out.println("\nOptions: add, remove, modify, print, exit");
            System.out.print("What would you like to do? ");
            input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "add":
                    System.out.print("Enter student's name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter student's grade: ");
                    grade = scanner.nextLine();
                    grades.put(name, grade);
                    System.out.println("Grade added for " + name);
                    break;

                case "remove":
                    System.out.print("Enter student's name to remove: ");
                    name = scanner.nextLine();
                    if (grades.containsKey(name)) {
                        grades.remove(name);
                        System.out.println(name + " has been removed.");
                    } else {
                        System.out.println(name + " not found.");
                    }
                    break;

                case "modify":
                    System.out.print("Enter student's name whose grade to modify: ");
                    name = scanner.nextLine();
                    if (grades.containsKey(name)) {
                        System.out.print("Enter new grade for " + name + ": ");
                        grade = scanner.nextLine();
                        grades.put(name, grade);
                        System.out.println(name + "'s grade updated to " + grade);
                    } else {
                        System.out.println(name + " not found.");
                    }
                    break;

                case "print":
                    System.out.println("\nAll Grades (sorted by name):");
                    grades.forEach((student, studentGrade) -> System.out.println(student + ": " + studentGrade));
                    break;

                case "exit":
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
