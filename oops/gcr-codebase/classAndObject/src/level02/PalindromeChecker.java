package level02;

import java.util.Scanner;

public class PalindromeChecker {

	String text;
	
	PalindromeChecker(String text){
		this.text = text;
	}
	
	public boolean check() {
		text = text.toLowerCase();
		int start = 0;
		int end = text.length()-1;
		while(start<end) {
			if(text.charAt(start)!=text.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public void displayResult() {
		if(check()==true) {
			System.out.println("Text is palindrome");
		}else {
			System.out.println("Text is not palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		PalindromeChecker checker = new PalindromeChecker(text);
		
		checker.displayResult();
		sc.close();
	}

}
