package level02;
import java.util.Scanner;

public class BMICalculator {
	public static String[] bmiStatus(double[][] data) {
        String[] status = new String[10];
		for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
		return status;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble() / 100;
            
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
        }
        String[] status = bmiStatus(data);
        System.out.println("\nBMI Results:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: BMI = %.2f, Status = %s\n", i + 1, data[i][2], status[i]);
        }

        scanner.close();
    }
}