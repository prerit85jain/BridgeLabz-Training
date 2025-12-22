package extraProblems;
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String dateStr1 = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String dateStr2 = scanner.nextLine();

        try {
            LocalDate date1 = LocalDate.parse(dateStr1);
            LocalDate date2 = LocalDate.parse(dateStr2);

            if (date1.isBefore(date2)) {
                System.out.println("The first date is before the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is after the second date.");
            } else if (date1.isEqual(date2)) {
                System.out.println("Both dates are the same.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter dates in YYYY-MM-DD format.");
        }

        scanner.close();
    }
}