package level01;
import java.util.Scanner;

public class NumberFormat {

    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    public static void handleRuntimeException(String input) {
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to parse as integer (non-numeric):");
        String userInput = scanner.nextLine();

//        generateException(userInput);

        handleRuntimeException(userInput);

        scanner.close();
    }
}