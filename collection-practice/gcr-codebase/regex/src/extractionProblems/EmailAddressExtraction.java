package extractionProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressExtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "^[a-zA-Z0-9+._]+@[a-zA-Z.]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		
		System.out.print("Enter text to extract email: ");
		String text = scanner.nextLine();
		
		String[] textSplit = text.split(" ");
		
		for(String word : textSplit) {
			Matcher matcher = pattern.matcher(word);
			if(matcher.find()) {
				System.out.println("Email: "+ matcher.group());
			}
		}
		scanner.close();
	}
}
