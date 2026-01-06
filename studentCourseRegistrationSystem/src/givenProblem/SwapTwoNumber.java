package givenProblem;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();
		num1 = num2^num1;
		num2 = num2^num1;
		System.out.println("After Swap: ");
		System.out.printf("Num1: %10s\nNum2: %10s", num1+num2, num2);
		sc.close();
	}
}
