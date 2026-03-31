package extractionProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordExtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String text = scanner.nextLine();
		
		String regex = "^[A-Z][a-z]+";
		Pattern pattern = Pattern.compile(regex);
		
		String[] splitText = text.split(" ");
		for(String str : splitText) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.find()) {				
				System.out.println(matcher.group());
			}
		}
		scanner.close();
	}
}
