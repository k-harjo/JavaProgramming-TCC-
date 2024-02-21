package app;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Please provide a file path as an argument.");
            return;
        }

        Path path = Paths.get(args[0]);

        try {
            List<String> lines = Files.readAllLines(path);
            List<String> reversedLines = new ArrayList<>();
            for(String line : lines) {
                reversedLines.add(new StringBuilder(line).reverse().toString());
            }
            Files.write(path, reversedLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
