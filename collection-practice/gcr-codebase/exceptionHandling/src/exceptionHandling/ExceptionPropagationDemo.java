package exceptionHandling;

public class ExceptionPropagationDemo {
    public static void method1() {
        int x = 10 / 0;
        System.out.println("This line will not be reached: " + x);
    }
    
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}