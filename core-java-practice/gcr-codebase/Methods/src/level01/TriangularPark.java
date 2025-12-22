package level01;

import java.util.Scanner;

public class TriangularPark {

    public static double calculateRounds(double perimeter, double distance) {
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        double distance = 5000;

        double rounds = calculateRounds(perimeter, distance);

        System.out.printf("The athlete needs to complete approximately %.2f rounds to run 5 km.\n", rounds);
        
        scanner.close();
    }
}
