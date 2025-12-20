package level03;
import java.util.*;
public class AbundantNumberCheck {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sumDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumDivisors += i;
            }
        }

        if (sumDivisors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        scanner.close();
    }
}
