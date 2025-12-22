package level02;
import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("Year is before 1582. The leap year check is only valid for years >= 1582.");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        boolean conditionA = (year % 4 == 0);
        boolean conditionB = (year % 100 != 0) || (year % 400 == 0);
        return conditionA && conditionB;
    }
}