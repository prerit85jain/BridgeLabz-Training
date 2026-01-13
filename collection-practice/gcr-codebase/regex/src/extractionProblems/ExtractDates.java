package extractionProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String text = scanner.nextLine();
		
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}";
		Pattern pattern = Pattern.compile(regex);
		
		String[] splitText = text.split(" ");
		for(String str : splitText) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.find()) {
				System.out.println("Date: "+ matcher.group());
			}
		}
		scanner.close();
	}
}
