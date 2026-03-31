package basicJUnitTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {

	public void writeToFile(String fileName, String content) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		writer.write(content);
		writer.close();
	}
	
	public String readFromFile(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String fetch = reader.readLine();
		reader.close();
		return fetch;
	}
}
