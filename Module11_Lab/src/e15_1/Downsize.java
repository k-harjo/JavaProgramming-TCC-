package e15_1;

import java.util.LinkedList;
import java.util.Arrays;

public class Downsize {
    public static void downsize(LinkedList<String> employeeNames, int n) {
        if (n <= 0 || employeeNames == null || employeeNames.size() < n) {
            return;
        }

        for (int index = n - 1; index < employeeNames.size(); index += n) {
            employeeNames.remove(index);
            index--; 
        }
    }

    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>(Arrays.asList("John", "Amanda", "Mary", "Bob", "Alice", "Tom", "Daisy", "Peter", "Lilly"));
        int n = 3;
        downsize(employees, n); 
        
        System.out.println("Downsized list of employees: ");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
