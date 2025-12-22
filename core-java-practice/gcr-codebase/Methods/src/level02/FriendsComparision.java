package level02;
import java.util.Scanner;

public class FriendsComparision {
    public static int findYoungestIndex(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findTallestIndex(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        int youngestIdx = findYoungestIndex(ages);
        int tallestIdx = findTallestIndex(heights);

        System.out.println(friends[youngestIdx] + " is the youngest with age " + ages[youngestIdx] + ".");
        System.out.println(friends[tallestIdx] + " is the tallest with height " + heights[tallestIdx] + " cm.");

        scanner.close();
    }
}