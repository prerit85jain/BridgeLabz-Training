package extraProblems;

import java.util.Scanner;

public class FactorialUsingTRecursion {
	static int number = 0;
	public static void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for factorial: ");
		number = sc.nextInt();
		sc.close();
	}
	
	public static int findFactorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*findFactorial((n-1));
	}
	
	public static void displayResult(int result) {
		System.out.println("Factorial of "+number+" is "+result);
	}
	public static void main(String[] args) {
		takeInput();
		int result = findFactorial(number);
		displayResult(result);
	}

}
