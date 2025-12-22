package level03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorTasks {

    // Method to find factors of a given number and return as a list
    public static List<Integer> findFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    // Method to find the greatest factor from the list
    public static int greatestFactor(List<Integer> factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of all factors
    public static int sumOfFactors(List<Integer> factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of all factors
    public static long productOfFactors(List<Integer> factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static long productOfCubes(List<Integer> factors) {
        long product = 1;
        for (int factor : factors) {
            long cube = (long) Math.pow(factor, 3);
            product *= cube;
        }
        return product;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> factors = findFactors(number);

        System.out.println("Factors of " + number + ": " + factors);
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of the cubes of the factors: " + productOfCubes(factors));
        
        sc.close();
    }
}