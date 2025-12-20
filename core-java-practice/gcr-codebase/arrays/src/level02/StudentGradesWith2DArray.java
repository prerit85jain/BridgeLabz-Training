package level02;
import java.util.Scanner;

public class StudentGradesWith2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();
        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Enter marks in Physics: ");
            marks[i][0] = inputPositiveMark(scanner);
            System.out.print("Enter marks in Chemistry: ");
            marks[i][1] = inputPositiveMark(scanner);
            System.out.print("Enter marks in Maths: ");
            marks[i][2] = inputPositiveMark(scanner);
        }
        for (int i = 0; i < number; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;
            
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
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15.2f %-10s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }

    private static double inputPositiveMark(Scanner scanner) {
        double mark;
        do {
            mark = scanner.nextDouble();
            if (mark < 0 || mark > 100) {
                System.out.print("Invalid input. Enter a valid mark between 0 and 100: ");
            }
        } while (mark < 0 || mark > 100);
        return mark;
    }
}