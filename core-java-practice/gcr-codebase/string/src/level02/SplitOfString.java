package level02;

import java.util.Arrays;
import java.util.Scanner;
public class SplitOfString{

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

    public static String[] customSplit(String str) {
        int length = getStringLength(str);
        
//        int wordCount = 0;
        boolean inWord = false;
        int[] spaceIndexes = new int[length + 1];
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceCount] = i;
                spaceCount++;
                inWord = false;
            } else {
                if (!inWord) {
                    inWord = true;
                }
            }
        }
        spaceIndexes[spaceCount] = length;
        spaceCount++;

        String[] words = new String[spaceCount];
        int startIdx = 0;

        for (int i = 0; i < spaceCount; i++) {
            int endIdx = spaceIndexes[i];
            StringBuilder word = new StringBuilder();

            for (int j = startIdx; j < endIdx; j++) {
                word.append(str.charAt(j));
            }

            words[i] = word.toString();
            startIdx = endIdx + 1;
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        String[] builtInSplit = inputText.split(" ");

        String[] customSplit = customSplit(inputText);

        boolean areEqual = compareStringArrays(customSplit, builtInSplit);

        System.out.println("Custom split: " + Arrays.toString(customSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Are both splits equal? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}