package intermediateLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {
}

class MethodClass {

    @LogExecutionTime
    public void fastMethod() {
        long start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        long end = System.nanoTime();
        System.out.println("Execution time of fastMethod: " + (end - start) + " ns");
    }

    @LogExecutionTime
    public void slowMethod() {
        long start = System.nanoTime();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("Execution time of slowMethod: " + (end - start) + " ns");
    }

    @LogExecutionTime
    public void mediumMethod() {
        long start = System.nanoTime();
        int product = 1;
        for (int i = 1; i <= 10000; i++) {
            product *= i % 10 + 1;
        }
        long end = System.nanoTime();
        System.out.println("Execution time of mediumMethod: " + (end - start) + " ns");
    }
}

public class LogExecutionTimeAnno {
    public static void main(String[] args) {
        MethodClass demo = new MethodClass();

        demo.fastMethod();
        demo.mediumMethod();
        demo.slowMethod();
    }
}