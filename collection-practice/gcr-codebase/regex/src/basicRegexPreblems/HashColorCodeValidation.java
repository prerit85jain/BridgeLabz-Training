package basicRegexPreblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashColorCodeValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "^#[A-Za-z0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		
		System.out.print("Enter hash code: ");
		String hashCode = scanner.nextLine();
		Matcher matcher = pattern.matcher(hashCode);
		
		System.out.println("Is hash code valid? "+ matcher.matches());
		scanner.close();
	}
}
