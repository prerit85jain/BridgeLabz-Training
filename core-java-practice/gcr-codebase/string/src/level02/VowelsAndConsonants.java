package level02;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }

    public static String checkVowelConsonant(char ch) {
        int ascii = (int) ch;
        if (ascii >= 65 && ascii <= 90) {
            ch = (char) (ascii + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        int len = getStringLength(str);
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            String result = checkVowelConsonant(c);
            if (result.equals("Vowel")) {
                vowelsCount++;
            } else if (result.equals("Consonant")) {
                consonantsCount++;
            }
        }

        return new int[]{vowelsCount, consonantsCount};
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