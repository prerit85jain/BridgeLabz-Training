package level02;
import java.util.Scanner;

public class CharacterTypeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[][] charTypes = findCharTypes(input);
        displayCharTypes(charTypes);

        scanner.close();
    }

    public static String checkCharType(char ch) {
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

    public static String[][] findCharTypes(String str) {
        int len = getStringLength(str);
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            String type = checkCharType(c);
            result[i][0] = Character.toString(c);
            result[i][1] = type;
        }
        return result;
    }

    public static void displayCharTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        for (int i = 0; i < charTypes.length; i++) {
            System.out.println(charTypes[i][0] + "\t\t" + charTypes[i][1]);
        }
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