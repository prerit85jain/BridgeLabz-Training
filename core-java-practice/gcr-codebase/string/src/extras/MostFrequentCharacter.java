package extras;
import java.util.*;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + result + "'");

        scanner.close();
    }

    public static char findMostFrequentChar(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

            if (frequencyMap.get(ch) > maxCount) {
                maxCount = frequencyMap.get(ch);
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}