package advanceProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocialSecurityNumberValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		String text = sc.nextLine();
		
		String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		sc.close();
	}
}
