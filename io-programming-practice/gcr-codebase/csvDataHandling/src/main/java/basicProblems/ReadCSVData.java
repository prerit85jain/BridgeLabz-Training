package basicProblems;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadCSVData {

	public static void main(String[] args) throws Exception {
		String file = "employee.csv";
		
		try(CSVReader reader = new CSVReader(new FileReader(file))){
			String[] nextLine;
			while((nextLine = reader.readNext()) != null) {
				System.out.printf("%-10s %-8s %-8s %-15s\n", nextLine[0], nextLine[1], nextLine[2], nextLine[3]);
			
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
