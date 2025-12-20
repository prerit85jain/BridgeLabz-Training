package level03;
import java.util.*;
public class CalculatorUsingSwitchCase {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = 0, second = 0;
        String op = "";

        first = scanner.nextDouble();
        second = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next();
        switch (op) {
            case "+":
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case "-":
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case "*":
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first + " / " + second + " = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        scanner.close();
    }
}
