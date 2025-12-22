package extraProblems;

import java.util.Scanner;

public class TemperatureConvertor {
	
	public static void fahrenheitToCelsius(double temp) {
		double celsius = (temp-32)*5/9;
		System.out.println("Temperatue in celsius is: "+celsius);
	}
	
	public static void celsiusToFahrenheit(double temp) {
		double fahrenheit = (temp*(9/5))+32;
		System.out.println("Temperatue in celsius is: "+fahrenheit);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Convert to f/c: ");
		String conversion = sc.next();
		System.out.print("Enter temperature deegre: ");
		double temp = sc.nextDouble();
		
		switch(conversion) {
			case "f":
				celsiusToFahrenheit(temp);
				break;
			case "c":
				fahrenheitToCelsius(temp);
				break;
			default:
				System.out.println("Wrong Input!");
		}
		sc.close();
	}

}
