package extraProblems;

import java.util.Scanner;

public class PalindromeChecker {
	static String text = "";
	
	public static void takeInput() {
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();
		sc.close();
	}
	
	public static boolean checkPalindrome() {
		int length = text.length();
		int start = 0;
		int end = length-1;
		while(start<end) {
			if(text.charAt(start)!=text.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void displayResult(boolean flag) {
		if(flag) {
			System.out.println("Text is Palindrome");
		}else {
			System.out.println("Text is not Palindrome");
		}
	}
	public static void main(String[] args) {
		takeInput();
		boolean result = checkPalindrome();
		displayResult(result);
	}

}
