package level01;
import java.util.Scanner;
public class RocketLaunchWhile {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of counter
		int counter = sc.nextInt();
		// Start counter
		while(counter!=1) {
			System.out.println(counter);
			counter--;
		}
		// Launch after counter end
		System.out.println("Launch");
		sc.close();
	}
}
