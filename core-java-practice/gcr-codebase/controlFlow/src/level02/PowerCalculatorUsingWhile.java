package level02;
import java.util.Scanner;

public class PowerCalculatorUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		
		int result = 1;
        int i = 1;
        while(i <= power) {
            result *= number;
            i++;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        sc.close();
	}
}
