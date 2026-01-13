package basicRegexPreblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicenseNumberPlateValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "^[A-Z]{2}\\d{4}";
		Pattern pattern = Pattern.compile(regex);
		
		System.out.print("Enter License Plate Number: ");
		String plateNumber = scanner.nextLine();
		Matcher matcher = pattern.matcher(plateNumber);
		
		System.out.println("Is number plate valid? "+ matcher.matches());
		scanner.close();
	}
}
