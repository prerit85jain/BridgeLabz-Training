package advanceProblems;

import java.io.FileReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opencsv.CSVReader;

public class ValidateData {
	private static final String emailRegex = "^[a-zA-Z0-9+_.]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
	private static final String numberRegex = "^[6-9][0-9]{9}$";
	
	public static void main(String[] args) throws Exception{
		Pattern email = Pattern.compile(emailRegex);
		Pattern number = Pattern.compile(numberRegex);
		
		String fileName = "validate.csv";
		CSVReader reader = new CSVReader(new FileReader(fileName));
		
		List<String[]> allData = reader.readAll();
		boolean header = true;
		for(String[] rec : allData) {
			if(header) {
				header = false;
				continue;
			}
			Matcher emailMatcher = email.matcher(rec[0]);
			Matcher numberMatcher = number.matcher(rec[1]);
			if(!emailMatcher.find()) {
				System.out.println(rec[0]+", "+rec[1] + "\t Invalid Email");
			}else if(!numberMatcher.find()) {
				System.out.println(rec[0]+", "+rec[1] + "\t Invalid Number");
			}
		}
	}

}
