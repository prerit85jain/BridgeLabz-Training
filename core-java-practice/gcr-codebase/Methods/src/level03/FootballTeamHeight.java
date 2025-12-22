package level03;
import java.util.Random;

public class FootballTeamHeight {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = findSum(heights);

        double mean = findMean(sum, heights);

        int shortest = findShortest(heights);

        int tallest = findTallest(heights);

        System.out.println("Heights of players in cms: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
        System.out.printf("Mean height: %.2f cms\n", mean);
    }

    public static int findSum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static double findMean(int sum, int[] array) {
        return (double) sum / array.length;
    }

    public static int findShortest(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findTallest(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}