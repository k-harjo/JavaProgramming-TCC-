package monthNumbers;

public class MonthNumbers {
    public static void main(String[] args) {
        // Create a long string containing all month names
        String allMonths = "January February March April May June July August September October November December";
        
        // Split the long string into an array of month names
        String[] monthArray = allMonths.split(" ");
        
        // Test cases for transforming numbers into month names
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        // Print the month names
        for (int num : numbers) {
            if (num >= 1 && num <= 12) {
                String monthName = monthArray[num - 1]; // Adjust for 0-based index
                System.out.println("Month " + num + ": " + monthName);
            } else {
                System.out.println("Invalid month number: " + num);
            }
        }
    }
}
