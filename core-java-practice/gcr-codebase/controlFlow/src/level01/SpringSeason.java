package level01;
import java.util.Scanner;
public class SpringSeason {
	// Main Function
	public static void main(String[] args) {
		// create Scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of month and date
		String month = sc.next();
		int date = sc.nextInt();
		// Checking weather is spring
		if(month.equals("April") || month.equals("May")) {
			System.out.println("Its a Spring Season");
		}else if((month.equals("March") && date>19) || (month.equals("June") && date<21)) {
			System.out.println("Its a Spring Season");
		}else {
			System.out.println("Not a Spring Season");
		}
		sc.close();
	}
}
