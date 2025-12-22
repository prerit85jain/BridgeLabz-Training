package extras;
import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.nextLine().charAt(0);

        String modifiedString = removeCharacter(inputString, charToRemove);

        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char currentChar : str.toCharArray()) {
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}