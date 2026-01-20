package advanceProblems;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import com.opencsv.CSVReader;

public class DetectDuplicates {

	public static void main(String[] args) throws Exception {
		String fileName = "student.csv";
		Set<Integer> set = new HashSet<>();
		
		CSVReader reader = new CSVReader(new FileReader(fileName));
		String[] nextLine = reader.readNext();
		
		while((nextLine = reader.readNext()) != null) {
			int id = Integer.parseInt(nextLine[0]);
			if(!set.contains(id)) {
				set.add(id);
			}else {
				for(String str : nextLine) {
					System.out.print(str + ", ");
				}
				System.out.println();
			}
		}
		reader.close();
	}

}
