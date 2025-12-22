package extras;
import java.util.*;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                resultBuilder.append(ch);
            }
        }

        return resultBuilder.toString();
    }
}