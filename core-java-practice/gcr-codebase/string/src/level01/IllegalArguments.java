package level01;
import java.util.Scanner;

public class IllegalArguments {

    public static void generateException(String input) {
        try {
            System.out.println("Attempting to substring with invalid indices...");
            String result = input.substring(5, 2);
            System.out.println("Substring result: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception inside generateException: " + e);
            throw new IllegalArgumentException("Invalid substring indices", e);
        }
    }

    public static void handleRuntimeException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException in handleRuntimeException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        String testInput = "Hello";
        try {
            generateException(testInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        handleRuntimeException();
    }
}
