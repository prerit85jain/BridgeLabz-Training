package level01;
import java.util.*;
public class ValidSumNaturalNumForLoop {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of number
		int number = sc.nextInt();
		// Getting sum by Formula
		int sumByFormula = number*(number+1)/2;
		// Set Sum by loop variable to 0
		int sumByLoop = 0;
		// Getting sum by for loop
		for(int i=number; i>0; i--) {
			sumByLoop += i;
		}
		// Validate sum by loop and sum by formula are same or not
		if(sumByLoop == sumByFormula) {
			System.out.println("Sum is correct that is "+sumByLoop);
		}
		sc.close();
	}
}