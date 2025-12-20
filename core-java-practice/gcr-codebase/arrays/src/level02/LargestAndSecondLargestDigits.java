package level02;
import java.util.Scanner;

public class LargestAndSecondLargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number != 0) {
            int digit = (int)(number % 10);
            digits[index] = digit;
            index++;
            if (index == maxDigit) {
                break;
            }
            number = number / 10;
        }
        
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < index; i++) {
            int currentDigit = digits[i];
            if (currentDigit > largest) {
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit != largest) {
                secondLargest = currentDigit;
            }
        }
        
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit (all digits are same or only one digit).");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
        
        scanner.close();
    }
}