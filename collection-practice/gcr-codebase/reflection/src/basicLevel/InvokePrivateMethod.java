package basicLevel;

import java.lang.reflect.Method;

class Calculator{
	private void multiply(int a, int b) {
		System.out.println("Multiply: "+ a*b);
	}
}

public class InvokePrivateMethod {
	public static void main(String[] args) throws Exception {
		Calculator calc = new Calculator();
		Class<?> clc = calc.getClass();
		
		Method method = clc.getDeclaredMethod("multiply", int.class, int.class);
		method.setAccessible(true);
		method.invoke(calc, 5, 10);
	}
}
