package bmiFitnessTracker;
import java.util.Scanner;
public class TrackerApp {
	// Main Function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create scanner object
		
		System.out.println("Welcome to Maya,s Fitness Center"); // Welcome message
		
		// taking height and weight of customer
		System.out.print("Enter height in m: ");
		double height = scanner.nextFloat();
		System.out.print("Enter weight in kg: ");
		double weight = scanner.nextFloat();
		
		// Calculate BMI
		double bmi = weight/(Math.pow(height, 2));
		
		// Leveling BMI
		if(bmi<18.5) {
			System.out.println("You are underweight");
		}else if(bmi<25) {
			System.out.println("You are normal");
		}else {
			System.out.println("You are overweight");
		}
		scanner.close();
	}
}
