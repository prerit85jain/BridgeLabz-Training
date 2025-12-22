package extraProblems;

import java.util.Scanner;

public class MaxNumber {
	static int num1, num2, num3;
	public static void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
	}
	
	public static void findMaximumNumber() {
		if(num1>num2 && num1>num3) {
			System.out.println("Maximum number is "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("Maximum number is "+num2);
		}else {
			System.out.println("Maximum number is "+num3);
		}
	}
	public static void main(String[] args) {
		takeInput();
		findMaximumNumber();
	}

}
