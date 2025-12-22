package level01;

import java.util.Scanner;

public class SimpleInterestCalculator {
	
	double calculate(double principle, double rate, double time) {
		double simpleInterest = (principle*rate*time)/100;
		return simpleInterest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		double principle = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		
		SimpleInterestCalculator si = new SimpleInterestCalculator();
		double interest = si.calculate(principle, rate, time);
		
		System.out.println("The Simple Interest is "+interest+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+ time);
		sc.close();
	}

}
