package intermediateProblems;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class FilterRecords {

	public static void main(String[] args) throws Exception {
		String fileName = "student.csv";
		
		try(CSVReader reader = new CSVReader(new FileReader(fileName))){
			String[] nextLine = reader.readNext();
			while((nextLine = reader.readNext()) != null) {
				int marks = Integer.parseInt(nextLine[3]);
				if(marks>80) {
					System.out.println(nextLine[0] + ", " + nextLine[1] + ", " + nextLine[2] + ", " + nextLine[3]);
				}
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
