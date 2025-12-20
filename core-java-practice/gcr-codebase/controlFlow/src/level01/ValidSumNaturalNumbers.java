package level01;
import java.util.Scanner;
public class ValidSumNaturalNumbers {
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
		// Getting sum by while loop
		while(number>0) {
			sumByLoop += number;
			number--;
		}
		// Validate sum by loop and sum by formula are same or not
		if(sumByLoop == sumByFormula) {
			System.out.println("Sum is correct that is "+sumByLoop);
		}
		sc.close();
	}
}
