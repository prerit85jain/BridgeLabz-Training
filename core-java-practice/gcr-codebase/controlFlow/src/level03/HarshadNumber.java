package level03;
import java.util.*;
public class HarshadNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;

        int tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            tempNumber /= 10;
        }
        boolean isHarshad = false;
        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            isHarshad = true;
        }

        if (isHarshad) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}
