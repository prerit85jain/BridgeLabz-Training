package level01;
import java.util.Scanner;
public class IsFirstSmallest {
	// Main Function
	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of 3 numbers
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		// Checking whether first number is smallest or not 
		System.out.println("Is the first number the smallest? "+(num1<num2 && num1<num3));
		sc.close();
	}
}
