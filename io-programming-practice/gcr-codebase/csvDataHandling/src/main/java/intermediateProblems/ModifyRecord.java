package intermediateProblems;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ModifyRecord {
	
	public static void write(List<String[]> allData, String fileName) throws Exception {
		CSVWriter writer = new CSVWriter(new FileWriter(fileName));
		for(String[] record : allData) {
			writer.writeNext(record);
		}
		writer.close();
		System.out.println("Write Successfully");
	}
	

	public static void main(String[] args) throws Exception {
		String fileName = "employee.csv";
		
		CSVReader reader = new CSVReader(new FileReader(fileName));
		
		List<String[]> allData = reader.readAll();
		reader.close();
		
		for(String[] str : allData) {
			if(str[2].equals("IT")) {
				double salary = Double.parseDouble(str[3]);
				salary += salary*0.1;
				str[3] = String.valueOf(salary);
			}
		}
		
		write(allData, fileName);
	}

}
