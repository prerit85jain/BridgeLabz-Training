package level02;
import java.util.Scanner;

public class EligibleStudents {

    public static int[] generateAges(int n, Scanner sc) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];  // [age, can vote or not]

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                results[i][0] = String.valueOf(age);
                results[i][1] = "Invalid";
            } else {
                results[i][0] = String.valueOf(age);
                if (age >= 18) {
                    results[i][1] = "Can Vote";
                } else {
                    results[i][1] = "Cannot Vote";
                }
            }
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("+------------+--------------+");
        System.out.println("| Age        | Voting Status|");
        System.out.println("+------------+--------------+");
        for (String[] row : results) {
            System.out.printf("| %-10s | %-12s |\n", row[0], row[1]);
        }
        System.out.println("+------------+--------------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = 10;

        int[] ages = generateAges(numberOfStudents, sc);

        String[][] votingResults = checkVotingEligibility(ages);

        displayResults(votingResults);

        sc.close();
    }
}