package javaStream;

import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) {
        // Source and destination file paths (adjust as needed)
        String sourcePath = "source.txt";
        String destPath = "copy.txt";

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourcePath);
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully to: " + destPath);
        } catch (IOException e) {
            // Properly handle IO exceptions
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}