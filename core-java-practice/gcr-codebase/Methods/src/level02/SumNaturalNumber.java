package level02;
import java.util.Scanner;

public class SumNaturalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (Natural number): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("The number is not a natural number. Please enter a positive integer.");
        } else {
            int sumRecursive = sumUsingRecursion(n);
            int sumFormula = sumUsingFormula(n);
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRecursive);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);
            if (sumRecursive == sumFormula) {
                System.out.println("Both methods give the same result. Calculation is correct!");
            } else {
                System.out.println("Results do not match. There might be an error.");
            }
        }
        scanner.close();
    }
    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}