package extractionProblems;

import java.util.Scanner;

public class ReplaceMultipleSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String text = scanner.nextLine();
		
		String replaceText = text.replaceAll("\\s+", " ").trim();
		System.out.println("Formated: "+replaceText);
		scanner.close();
	}
}
