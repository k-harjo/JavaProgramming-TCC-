package app;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("file.txt"); 

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    System.out.println(0);
                } else {
                    String[] numbers = line.split("\\s+"); 
                    double sum = 0;
                    for (String number : numbers) {
                        sum += Double.parseDouble(number);
                    }
                    double average = sum / numbers.length;
                    System.out.println(average);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Invalid number format in file");
        }
    }
}
