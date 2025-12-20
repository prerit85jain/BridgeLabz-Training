package level02;
import java.util.Scanner;

public class TwoLargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = scanner.nextLong();
        if (number < 0) {
            number = -number;
        }

        int maxSize = 10;
        int[] digits = new int[maxSize];
        int index = 0;

        while (number != 0) {
            int digit = (int)(number % 10);
            number /= 10;

            if (index == maxSize) {
                int newMaxSize = maxSize + 10;
                int[] temp = new int[newMaxSize];

                System.arraycopy(digits, 0, temp, 0, maxSize);

                digits = temp;
                maxSize = newMaxSize;
            }

            digits[index] = digit;
            index++;
        }

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }

        scanner.close();
    }
}