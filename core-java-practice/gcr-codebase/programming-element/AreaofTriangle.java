import java.util.Scanner;

public class AreaofTriangle {
    // Main Function
    public static void main(String args[]) {
        // Creating scanner object
		Scanner scanner = new Scanner(System.in);
        // Taking input of base and height in inches
        double baseInches = scanner.nextDouble();
        double heightInches = scanner.nextDouble();
        double areaInches = 0.5 * baseInches * heightInches; // Area Calculation in square inches
        
        double baseCm = baseInches * 2.54; // Convert base to centimeters
        double heightCm = heightInches * 2.54; // Convert height to centimeters
        double areaCm = 0.5 * baseCm * heightCm; // Area Calculation in square centimeters
        System.out.println("Area of the triangle in square inches: " + areaInches);
        System.out.println("Area of the triangle in square centimeters: " + areaCm);
        scanner.close();
	}
}
