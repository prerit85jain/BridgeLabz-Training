package level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitTextWithLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        String[] words = manualSplit(text);

        String[][] result = createWordLengthArray(words);

        System.out.println("\nWord\tLength");
        for (String[] pair : result) {
            int length = stringToInt(pair[1]);
            System.out.println(pair[0] + "\t" + length);
        }

        scanner.close();
    }

    public static String[] manualSplit(String text) {
        List<String> wordsList = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        int len = getStringLength(text);
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                if (getStringLength(currentWord.toString()) > 0) {
                    wordsList.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }
        if (getStringLength(currentWord.toString()) > 0) {
            wordsList.add(currentWord.toString());
        }

        return wordsList.toArray(new String[0]);
    }

    public static String[][] createWordLengthArray(String[] words) {
        String[][] array = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            array[i][0] = words[i];
            array[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return array;
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

    public static int stringToInt(String str) {
        int num = 0;
        for (int i = 0; i < getStringLength(str); i++) {
            char ch = str.charAt(i);
            num = num * 10 + (ch - '0');
        }
        return num;
    }
}