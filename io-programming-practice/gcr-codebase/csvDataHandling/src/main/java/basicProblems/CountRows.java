package basicProblems;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class CountRows {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		String fileName = "employee.csv";
		
		try(CSVReader reader = new CSVReader(new FileReader(fileName))){
			int count = 0;
			String[] nextLine;
			while((nextLine = reader.readNext()) != null) {
				count++;
			}
			System.out.println("Total Number of Records are: " + --count);
		}catch(IOException e) {
			System.out.println("IOException occur: " + e.getMessage());
		}
	}

}
