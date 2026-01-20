package advanceProblems;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class MergeCSVFiles {

	public static void main(String[] args) throws Exception {
		String file1 = "student.csv";
		String file2 = "student1.csv";
		
		CSVReader file1reader = new CSVReader(new FileReader(file1));
		CSVReader file2reader = new CSVReader(new FileReader(file2));
		String[] nextLine = file2reader.readNext();
		List<String[]> list = file1reader.readAll();
		list.remove(0);
		
		while((nextLine = file2reader.readNext()) != null) {
			list.add(nextLine);
		}
		
		list.sort((o1, o2)->{
			int id1 = Integer.parseInt(o1[0]);
			int id2 = Integer.parseInt(o2[0]);
			return Integer.compare(id1, id2);
		});
		
		CSVWriter writer = new CSVWriter(new FileWriter("mergerd.csv"));
		writer.writeAll(list);
		writer.close();
		file1reader.close();
		file2reader.close();
		System.out.println("Write done");
	}

}
