package level02;
import java.util.Scanner;

public class PositiveNegativeNumber {
    public static String isPositive(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            String posStatus = isPositive(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + posStatus);
            if ("Positive".equals(posStatus)) {
                String evenOdd = isEven(numbers[i]);
                System.out.println(" and it is " + evenOdd + ".");
            } else if ("Negative".equals(posStatus)) {
                System.out.println(".");
            } else {
                System.out.println(" (Zero).");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[4]);
        System.out.print("Comparison of first and last elements: ");
        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        scanner.close();
    }
}