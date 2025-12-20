package level01;
import java.util.Scanner;
public class CheckDivisibility {
	// Main Function
	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		// Take input of number
		int number = sc.nextInt();
		// Check divisility by 5
		System.out.print("Is the number "+number+" divisible by 5? "+(number%5==0));
		sc.close();
	}
}
