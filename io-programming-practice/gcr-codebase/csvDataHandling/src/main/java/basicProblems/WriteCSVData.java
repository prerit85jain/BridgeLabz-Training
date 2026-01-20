package basicProblems;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class WriteCSVData {

	public static void main(String[] args) {
		String file = "employee.csv";
		
		try(CSVWriter writer = new CSVWriter(new FileWriter(file, true))) {
			String[] header = {"ID", "Name", "Department", "Salary"};
			String[] emp1 = {"001", "Aman", "HR", "5000"};
			String[] emp2 = {"002", "Bobby", "IT", "6000"};
			String[] emp3 = {"003", "Chirag", "HR", "5400"};
			String[] emp4 = {"004", "Deepak", "IT", "4500"};
			String[] emp5 = {"005", "Aarti", "HR", "5500"};
			writer.writeNext(header);
			writer.writeNext(emp1);
			writer.writeNext(emp2);
			writer.writeNext(emp3);
			writer.writeNext(emp4);
			writer.writeNext(emp5);
			System.out.println("Data added successfully");
		}catch (IOException e) {
			System.out.println("IOException occur: " + e.getMessage());
		}
	}

}
