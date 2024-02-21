package app;

public class EmployeeTester {
    public static void main(String[] args) {
        // Create an Employee object
        Employee harry = new Employee("Hacker, Harry", 50000);

        // Display initial name and salary
        System.out.println("Initial Employee Details:");
        System.out.println("Name: " + harry.getName());
        System.out.println("Salary: $" + harry.getSalary());

        // Raise Harry's salary by 10 percent
        harry.raiseSalary(10);

        // Display updated salary
        System.out.println("\nEmployee Details after Raise:");
        System.out.println("Name: " + harry.getName());
        System.out.println("Updated Salary: $" + harry.getSalary());
    }
}
