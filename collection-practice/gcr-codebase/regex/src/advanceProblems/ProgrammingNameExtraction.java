package advanceProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingNameExtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String text = scanner.nextLine();
		
		String regex = "\\b(Python|Java|JavaScript|Go|Ruby|C\\+\\+)\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		scanner.close();
	}
}
