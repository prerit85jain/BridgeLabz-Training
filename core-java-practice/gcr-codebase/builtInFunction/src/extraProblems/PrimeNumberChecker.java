package extraProblems;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static boolean isPrime(int number) {
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void displayResult(boolean flag) {
		if(flag) {
			System.out.println("Number is prime.");
		}else {
			System.out.println("Number is not prime.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		displayResult(isPrime(number));
		
		sc.close();
	}

}
