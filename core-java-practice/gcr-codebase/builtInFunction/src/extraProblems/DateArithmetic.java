package extraProblems;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(inputDate);

            date = date.plusDays(7);
            date = date.plusMonths(1);
            date = date.plusYears(2);
            date = date.minusWeeks(3);

            System.out.println("The final date after calculations: " + date);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
        }

        scanner.close();
    }
}