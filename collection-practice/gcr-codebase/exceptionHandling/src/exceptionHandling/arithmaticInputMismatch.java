package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class arithmaticInputMismatch {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        try{

            int a = scanner.nextInt();
            int b = a / 0;
            System.out.println(b);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception: Invalid input type.");
        }
        scanner.close();
    }
}