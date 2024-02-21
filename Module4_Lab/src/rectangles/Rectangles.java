package rectangles;

import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the length of the rectangle's sides
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Calculate and print the area of the rectangle
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);

        // Calculate and print the perimeter of the rectangle
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Calculate and print the length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("Length of the diagonal: " + diagonal);

        input.close();
    }
}