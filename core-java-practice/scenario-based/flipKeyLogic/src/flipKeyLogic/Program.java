package flipKeyLogic;

import java.util.Scanner;

public class Program {

	public static String CleanseAndInvert(String input) {
		input = input.trim();
		StringBuilder result = new StringBuilder();
		if(input.length()<6) {
			return null;
		}else if(!input.matches("[a-zA-Z]+")) {
			return null;
		}else {
			input =input.toLowerCase();
			StringBuilder sb = new StringBuilder();
			for(char ch : input.toCharArray()) {
				if(((int)ch) %2!=0) {
					sb.append(ch);
				}
			}
			input = sb.reverse().toString();
			for(int i=0; i<input.length(); i++) {
				if(i%2==0) {
					result.append(Character.toUpperCase(input.charAt(i)));
				}else {
					result.append(input.charAt(i));
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word");
		
		String input = in.nextLine();
		
		String res = CleanseAndInvert(input);
		if(res==null) {
			System.out.println("Invalid Input");
		}else {
			System.out.println(res);
		}
	}
}
