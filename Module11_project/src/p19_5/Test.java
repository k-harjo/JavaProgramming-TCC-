package p19_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        WordCollectionADT wordCollection = new SortedWordCollection();
        try {
            Scanner scanner = new Scanner(new File("words.txt"));
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCollection.add(word);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        // Test the contains method
        String[] testWords = {"apple", "zebra", "cucumber", "banana"};
        for (String word : testWords) {
            System.out.println("Does the collection contain \"" + word + "\"? " +
                    wordCollection.contains(word));
        }
    }
}
