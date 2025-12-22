package extraProblems;

import java.util.Scanner;

public class BasicCalculator {
	
	public static void addition(int num1, int num2) {
		System.out.println("Addition is: "+(num1+num2));
	}
	public static void subtraction(int num1, int num2) {
		System.out.println("Subtraction is: "+(num1-num2));
	}
	public static void multiplication(int num1, int num2) {
		System.out.println("Multiplication is: "+(num1*num2));
	}
	public static void division(int num1, int num2) {
		System.out.println("Divisor is: "+(num1/num2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operation to perform(+, -, *, /): ");
		String operation = sc.next();
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		
		switch(operation) {
			case "+":
				addition(num1, num2);
				break;
			case "-":
				subtraction(num1, num2);
				break;
			case "*":
				multiplication(num1, num2);
				break;
			case "/":
				division(num1, num2);
				break;
			default:
				System.out.println("Wrong Input!");
		}
		sc.close();
	}

}
