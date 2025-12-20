package level01;
import java.util.Scanner;
public class RocketLaunchFor {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of counter
		int counter = sc.nextInt();
		// Counter start by for loop
		for(int i=counter; i!=1; i--) {
			System.out.println(i);
		}
		// Rocket launch after counter end
		System.out.println("Launch");
		sc.close();
	}
}
