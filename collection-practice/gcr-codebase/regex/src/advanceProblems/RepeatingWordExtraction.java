package advanceProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordExtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		String text = scanner.nextLine();
		
		String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
		scanner.close();
	}
}
