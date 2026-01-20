package advanceProblems;

import java.util.List;
import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class ReadLargeCSVFile {
	private static final int CHUNK_SIZE = 100;
	public static void main(String[] args) throws Exception {
		String fileName = "large_file.csv";
		int totalRecord = 0;
		
		CSVReader reader = new CSVReader(new FileReader(fileName));
		String[] row;
		List<String[]> chunk = new ArrayList<>(CHUNK_SIZE);
		while((row = reader.readNext()) != null) {
			chunk.add(row);
			
			if(chunk.size() == CHUNK_SIZE) {
				totalRecord += chunk.size();
				System.out.println("Processed Records: "+ totalRecord);
				chunk.clear();
			}
		}
		
		if(!chunk.isEmpty()) {
			totalRecord += chunk.size();
			System.out.println("Processed Records: "+ totalRecord);
		}
		reader.close();
	}

}
