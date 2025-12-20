package level01;
import java.util.Scanner;
public class AdditionTillZero {
	// Main Function
	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		// Declare total variable and set as 0
		double total = 0;
		// Take input of number
		double input = sc.nextDouble();
		// Check input condition and sum to total variable
		while(input!=0) {
			total += input;
			input = sc.nextDouble();
		}
		System.out.println("Total is "+total);
		sc.close();
	}
}
