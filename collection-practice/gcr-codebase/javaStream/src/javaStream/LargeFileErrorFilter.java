package javaStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileErrorFilter {
    public static void main(String[] args) {
        // Validate input
        if (args.length < 1) {
            System.err.println("Usage: java LargeFileErrorFilter <path-to-large-text-file>");
            System.exit(1);
        }

        String filePath = args[0];
        String target = "error";

        long matchCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Case-insensitive contains check
                if (line.toLowerCase().contains(target)) {
                    System.out.println(line);
                    matchCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("I/O error while processing file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Total matching lines: " + matchCount);
    }
}