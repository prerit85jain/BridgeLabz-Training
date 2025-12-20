package level03;
import java.util.*;
public class BMIStatus {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double heightCm = scanner.nextDouble();

        double heightM = heightCm / 100;
        double BMI = weight / (heightM * heightM);

        String status;

        if (BMI <= 18.4) {
            status = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            status = "Normal";
        } else if (BMI >= 25.0 && BMI <= 39.9) {
            status = "Overweight";
        } else { // BMI >= 40.0
            status = "Obese";
        }

        System.out.printf("Your BMI is: %.2f\n", BMI);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
