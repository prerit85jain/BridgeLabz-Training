package javaStream;

import java.io.*;

public class ByteStreamExample {
	public static void main(String[] args) {
		File file = new File("src/fileReading/byte-file.txt");
		
		System.out.println("Looking for file at: " + file.getAbsolutePath());
		
		try (FileInputStream fis = new FileInputStream(file)) {
			int data;
			
			while ((data = fis.read()) != -1) {
			// Cast byte to char and print
			System.out.print((char) data);
		}
		
		} catch (IOException e) {
			// Handle file not found or read error
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}