package javaStream;

import java.io.*;

public class UpperToLowerFilter {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destPath = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String lower = line.toLowerCase();
                writer.write(lower);
                writer.newLine();
            }
            writer.flush();
            System.out.println("Converted content written to: " + destPath);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}