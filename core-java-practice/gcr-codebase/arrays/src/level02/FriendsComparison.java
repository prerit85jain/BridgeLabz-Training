package level02;
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");
            
            while (true) {
                System.out.print("  Age: ");
                if (scanner.hasNextInt()) {
                    int ageInput = scanner.nextInt();
                    if(ageInput > 0) {
                        ages[i] = ageInput;
                        break;
                    } else {
                        System.out.println("  Invalid input! Age must be positive. Please try again.");
                    }
                } else {
                    System.out.println("  Invalid input! Please enter an integer value.");
                    scanner.next();
                }
            }
            
            while (true) {
                System.out.print("  Height (in cm): ");
                if (scanner.hasNextDouble()) {
                    double heightInput = scanner.nextDouble();
                    if (heightInput > 0) {
                        heights[i] = heightInput;
                        break;
                    } else {
                        System.out.println("  Invalid input! Height must be positive. Please try again.");
                    }
                } else {
                    System.out.println("  Invalid input! Please enter a numerical value.");
                    scanner.next();
                }
            }
        }
        
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("Youngest friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
        
        scanner.close();
    }
}