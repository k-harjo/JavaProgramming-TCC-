package e15_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class IdentifierIndexer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java IdentifierIndexer <JavaSourceFile.java>");
            return;
        }
        String filename = args[0];

        Map<String, Set<Integer>> identifiers = new TreeMap<>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^A-Za-z0-9_]+");

            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNumber++;
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("[^A-Za-z0-9_]+");

                while (lineScanner.hasNext()) {
                    String identifier = lineScanner.next();
                    if (!identifiers.containsKey(identifier)) {
                        identifiers.put(identifier, new TreeSet<>());
                    }
                    identifiers.get(identifier).add(lineNumber);
                }
                lineScanner.close();
            }
            scanner.close();

            for (Map.Entry<String, Set<Integer>> entry : identifiers.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
