package level01;

import java.util.Scanner;

public class TextToUpperCase {
    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the complete text:");
        String inputText = scanner.nextLine();

        String upperBuiltIn = inputText.toUpperCase();

        String upperManual = convertToUppercase(inputText);

        boolean areEqual = compareStrings(upperBuiltIn, upperManual);

        System.out.println("Original Text: " + inputText);
        System.out.println("Uppercase (Built-in): " + upperBuiltIn);
        System.out.println("Uppercase (Manual): " + upperManual);
        System.out.println("Do both methods produce the same uppercase text? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}