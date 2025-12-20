package level02;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();
        char[] digitsChar = numberStr.toCharArray();

        int[] frequency = new int[10];

        for (char c : digitsChar) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                frequency[digit]++;
            }
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}