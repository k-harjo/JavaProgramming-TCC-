package app;
import app.Letter;

public class LetterPrinter {
    public static void main(String[] args) {
        // Create an object of the Letter class
        Letter letter = new Letter("Mary", "John");

        // Add lines to the body of the letter
        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");

        // Print the entire letter
        System.out.println(letter.getText());
    }
}
