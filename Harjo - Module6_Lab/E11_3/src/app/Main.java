package app;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("file.txt");
        
        try {
            List<String> lines = Files.readAllLines(path);
            while (!lines.isEmpty() && lines.get(0).trim().isEmpty()) {
                lines.remove(0);
            }
            while (!lines.isEmpty() && lines.get(lines.size() - 1).trim().isEmpty()) {
                lines.remove(lines.size() - 1);
            }
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
