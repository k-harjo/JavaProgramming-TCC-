package app;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the input and output file paths as arguments.");
            return;
        }

        Path inputPath = Paths.get(args[0]);
        Path outputPath = Paths.get(args[1]);

        try {
            // Read all lines from the input file into a List
            List<String> lines = Files.readAllLines(inputPath);
            
            // Reverse the order of lines
            Collections.reverse(lines);
            
            // Write the reversed lines to the output file
            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
