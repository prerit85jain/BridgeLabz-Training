package level01;

import java.util.Scanner;

public class QuotientReminder {

	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient = number/divisor;
		int reminder = number%divisor;
		return new int[] {quotient, reminder};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] result = findRemainderAndQuotient(num1, num2);
		System.out.println("The Quotient is "+result[0]+" and Reminder is "+result[1]+" of two number "+num1+" and "+num2);
		sc.close();
	}

}
