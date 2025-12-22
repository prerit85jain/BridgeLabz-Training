package level02;

import java.util.Scanner;

public class FindQuadraticRoots {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter coefficient a: ");
	    double a = scanner.nextDouble();
	    System.out.print("Enter coefficient b: ");
	    double b = scanner.nextDouble();
	    System.out.print("Enter coefficient c: ");
	    double c = scanner.nextDouble();
	    
	    double[] roots = findRoots(a, b, c);
	    if (roots == null || roots.length == 0) {
	    	System.out.println("No real roots exist.");
	    } else if (roots.length == 1) {
	    	System.out.println("One root: " + roots[0]);
	    } else {
	        System.out.println("Root 1: " + roots[0]);
	        System.out.println("Root 2: " + roots[1]);
	    }    
	    scanner.close();
	}
	public static double[] findRoots(double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
	        return new double[] { root1, root2 };
	    } else if (delta == 0) {
	    	double root = -b / (2 * a);
	        return new double[] { root };
	    } else {
	    	return new double[] {};
	    }
	}
}