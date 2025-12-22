package level03;

import java.util.Scanner;

public class LineEquationAndDistance {

	public static double euclideanDistance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		return distance;
	}
	
	public static double[] equation(int x1, int y1, int x2, int y2) {
		double m = (y2 - y1)/(x2 - x1);
		double b = y1 - m*x1;
		return new double[] {m, b};
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x cooredinate of point 1: ");
		int x1 = sc.nextInt();
		System.out.println("Enter y cooredinate of point 1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter x cooredinate of point 2: ");
		int x2 = sc.nextInt();
		System.out.println("Enter y cooredinate of point 2: ");
		int y2 = sc.nextInt();
		
		double[] result = equation(x1,y1,x2,y2);
		System.out.println("Distance of the line is "+euclideanDistance(x1,y1,x2,y2));
		System.out.println("Equation of the line is: y = "+result[0]+" * x + "+result[1]);
		sc.close();
	}

}
