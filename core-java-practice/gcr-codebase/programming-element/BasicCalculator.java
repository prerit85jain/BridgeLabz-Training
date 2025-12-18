import java.util.Scanner;

public class BasicCalculator {
    // Main Function
    public static void main(String[] args) {
        // Creating scanner object
		Scanner sc = new Scanner(System.in);
        // Taking input of 2 numbers
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		float add = num1+num2; // Addition
		float sub = num1-num2; // Subtraction
		float multiply = num1*num2; // Multiplication
		float divide = num1/num2; // Division
		
		System.out.println(String.format("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f",num1, num2, add, sub, multiply, divide));
		sc.close();
	}
}
