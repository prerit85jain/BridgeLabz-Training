package level01;
import java.util.Scanner;
public class AdditionTillZeroOrNegative {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Set total to 0
		double total = 0;
		// Starting infinite while loop
		while(true) {
			double input = sc.nextDouble(); // taking input as number
			if(input<=0)	break; // check condition to break the loop
			total += input; // Add input to total variable
		}
		System.out.println("Total is "+total);
		sc.close();
	}
}
