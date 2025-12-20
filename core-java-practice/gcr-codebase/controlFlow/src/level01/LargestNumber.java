package level01;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of 3 numbers
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		// Checking 3 numbers are greatest or not
		System.out.println("Is the first number the largest? "+(num1>num2 && num1>num3));
		System.out.println("Is the second number the largest? "+(num2>num1 && num2>num3));
		System.out.println("Is the third number the largest? "+(num3>num2 && num3>num2));
		sc.close();
	}
}
