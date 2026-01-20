package intermediateProblems;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class SortRecord {

	public static void main(String[] args) throws Exception {
		String fileName = "employee.csv";
		
		CSVReader reader = new CSVReader(new FileReader(fileName));
		
		List<String[]> allData = reader.readAll();
		reader.close();
		String[] header = allData.remove(0);
		allData.sort((r1, r2) -> {
			double s1 = Double.parseDouble(r1[3]);
			double s2 = Double.parseDouble(r2[3]);
			return Double.compare(s2, s1);
		});
		System.out.println(header[0]+", "+header[1]+", "+header[2]+", "+header[3]);
		for(String[] rec : allData) {
			for(String str : rec) {
				System.out.print(str+", ");
			}
			System.out.println();
		}
	}

}
