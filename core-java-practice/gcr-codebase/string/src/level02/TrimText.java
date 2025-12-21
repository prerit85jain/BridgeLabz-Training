package level02;
import java.util.Scanner;

public class TrimText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] positions = findTrimPositions(input);
        String trimmedManual = createSubstring(input, positions[0], positions[1]);

        String trimmedBuiltIn = input.trim();
        boolean areEqual = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("Manual trimmed string: \"" + trimmedManual + "\"");
        System.out.println("Built-in trimmed string: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both trimmed strings equal? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }

    public static int[] findTrimPositions(String str) {
        int start = 0;
        int end = getStringLength(str) - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end + 1 };
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (getStringLength(str1) != getStringLength(str2)) {
            return false;
        }
        for (int i = 0; i < getStringLength(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
}