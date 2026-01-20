package intermediateProblems;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class SearchRecord {

	public static void main(String[] args) throws Exception {
		String fileName = "employee.csv";
		String searchEmp = "Deepak";
		try(CSVReader reader = new CSVReader(new FileReader(fileName))){
			String[] nextLine;
			while((nextLine = reader.readNext()) != null) {
				if(nextLine[1].equals(searchEmp)) {
					System.out.println(nextLine[2] + ", " + nextLine[3]);
				}
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
