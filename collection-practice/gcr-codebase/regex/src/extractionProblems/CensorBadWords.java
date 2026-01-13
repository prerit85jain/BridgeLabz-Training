package extractionProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class CensorBadWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String text = scanner.nextLine();
		
		ArrayList<String> censorWords = new ArrayList<>();
		censorWords.add("damn");
		censorWords.add("stupid");
		censorWords.add("idiot");
		
		String[] splitText = text.split(" ");
		for(String str : splitText) {
			if(censorWords.contains(str)) {
				text = text.replaceAll(str, "****");
			}
		}
		System.out.println(text);
		scanner.close();
	}
}
