package level01;
import java.util.*;
public class SumofNaturalNumbers {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of number
		int number = sc.nextInt();
		// Number is natural or not
		if(number>0) {
			System.out.println("The sum of "+number+" natural numbers is "+(number*(number-1)/2));
		}else {
			System.out.println("The number "+number+" is not a natural number");
		}
		sc.close();
	}
}
