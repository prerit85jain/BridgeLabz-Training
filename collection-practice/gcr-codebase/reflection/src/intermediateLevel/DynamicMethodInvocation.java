package intermediateLevel;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{
	public void add(int a, int b) {
		System.out.println("Add: "+ (a+b));
	}
	
	public void subtract(int a, int b) {
		System.out.println("Subtract: "+ (a-b));
	}
	public void multiply(int a, int b) {
		System.out.println("Multiply: "+ (a*b));
	}
}
public class DynamicMethodInvocation {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		MathOperations operation = new MathOperations();
		Class<?> clc = operation.getClass();
		
		System.out.print("Enter method (add/subtract/multiply): ");
		String methodName = sc.next();
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Method method = clc.getDeclaredMethod(methodName, int.class, int.class);
		method.invoke(operation, num1, num2);
		sc.close();
	}
}
