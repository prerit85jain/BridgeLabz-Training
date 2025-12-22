package level01;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static int sum(int number) {
		int total = 0;
		for(int i=0; i<=number; i++) {
			total += i;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Sum of "+number+" natural number is "+sum(number));
		sc.close();
	}

}
