package level02;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number;
        }

        int count = 0;
        long tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        if (number == 0) {
            count = 1;
        }

        int[] digits = new int[count];
        tempNumber = number;
        int index = 0;
        while (tempNumber != 0) {
            digits[index] = (int)(tempNumber % 10);
            tempNumber /= 10;
            index++;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}