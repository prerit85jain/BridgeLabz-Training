package advanceProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdressVelidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter IP Adress: ");
		String address = scanner.nextLine();
		
		String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[0-9]?\\d)(\\.(?!$)|$)){4}$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(address);
		System.out.println("Is IP Address correct? "+ matcher.find());
		scanner.close();
	}
}
