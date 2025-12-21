package level02;
import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        int totalStudents = 10;
        int[][] scores = generateScores(totalStudents);
        double[][] totalsAndAverages = calculateTotalsAndAverages(scores);
        String[] grades = calculateGrades(totalsAndAverages);
        displayScorecard(scores, totalsAndAverages, grades);
    }

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateTotalsAndAverages(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;

            total = (int) Math.round(total);
            average = Math.round(average * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] totalsAndAverages) {
        int numStudents = totalsAndAverages.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = totalsAndAverages[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] totalsAndAverages, String[] grades) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.0f %-10.2f %-10s\n",
                    "Student " + (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    totalsAndAverages[i][0],
                    totalsAndAverages[i][2],
                    grades[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}