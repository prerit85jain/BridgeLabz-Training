package level02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestLongestWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        String[] words = splitIntoWords(text);

        String[][] wordsWithLengths = createWordLengthArray(words);

        int[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        System.out.println("\nShortest word: " + words[shortestAndLongest[0]]);
        System.out.println("Longest word: " + words[shortestAndLongest[1]]);

        scanner.close();
    }

    public static String[] splitIntoWords(String text) {
        List<String> wordList = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        int len = getStringLength(text);
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                if (getStringLength(currentWord.toString()) > 0) {
                    wordList.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        if (getStringLength(currentWord.toString()) > 0) {
            wordList.add(currentWord.toString());
        }

        return wordList.toArray(new String[0]);
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

    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLen = stringToInt(wordLengthArray[i][1]);
            int minLen = stringToInt(wordLengthArray[minIdx][1]);
            int maxLen = stringToInt(wordLengthArray[maxIdx][1]);
            if (currentLen < minLen) {
                minIdx = i;
            }
            if (currentLen > maxLen) {
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static int stringToInt(String str) {
        int num = 0;
        for (int i = 0; i < getStringLength(str); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
        }
        return num;
    }
}