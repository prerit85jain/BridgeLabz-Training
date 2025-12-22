package extras;
import java.util.Scanner;

public class SubstringOccurences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        int count = countOccurrences(mainString, subString);

        System.out.println("The substring occurs " + count + " times.");

        scanner.close();
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += 1;
        }

        return count;
    }
}