package basicRegexPreblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,14}";
		Pattern pattern = Pattern.compile(regex);
		
		System.out.print("Enter username: ");
		String input = scanner.nextLine();
		Matcher matcher = pattern.matcher(input);
		
		System.out.println("Is username valid? "+ matcher.matches());
		scanner.close();
	}
}
