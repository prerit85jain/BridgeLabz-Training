package level01;
import java.util.Scanner;
public class PositiveNegativeZero {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of number
		int number = sc.nextInt();
		// Check number is +ve, -ve or 0
		if(number>0) {
			System.out.println("Positive");
		}else if(number<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");			
		}
		sc.close();
	}
}
