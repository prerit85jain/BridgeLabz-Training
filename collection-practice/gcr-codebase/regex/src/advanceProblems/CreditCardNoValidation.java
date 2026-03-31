package advanceProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardNoValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter card number: ");
		String cardNumber = scanner.nextLine();
		
		String regex = "^(4[0-9]{15})|(5[0-9]{15})$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(cardNumber);
		System.out.println("Is Card Valid? "+ matcher.find());
		scanner.close();
	}
}
