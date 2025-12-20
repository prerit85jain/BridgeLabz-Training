package level01;
import java.util.Scanner;
public class EligibleToVote {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of age
		int age = sc.nextInt();
		// Check the voter is eligible or not
		if(age>=18) {
			System.out.println("The person's age is "+age+" and can vote.");
		}else {
			System.out.println("The person's age is "+age+" and cannot vote.");			
		}
		sc.close();
	}
}
