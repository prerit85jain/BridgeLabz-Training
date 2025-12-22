package level01;

import java.util.Scanner;

public class TrigonometricCalculator {

	public static double[] calculateTrigonometricFunctions(double angle) {
		double radian = Math.toRadians(angle);
		double sin = Math.sin(radian);
		double cos = Math.cos(radian);
		double tan = Math.cos(radian);
		
		return new double[] {sin, cos, tan};
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angle = sc.nextDouble();
		
		double[] result = calculateTrigonometricFunctions(angle);
		System.out.println("Sine: "+result[0]);
		System.out.println("Cosine: "+result[1]);
		System.out.println("Tangent: "+result[2]);
		sc.close();
	}

}
