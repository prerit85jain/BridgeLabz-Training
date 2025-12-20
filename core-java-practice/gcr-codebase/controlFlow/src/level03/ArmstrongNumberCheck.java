package level03;
import java.util.*;
public class ArmstrongNumberCheck {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNumber = sc.nextInt();

        int number = originalNumber;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
