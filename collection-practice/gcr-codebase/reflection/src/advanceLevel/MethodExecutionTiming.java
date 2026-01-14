package advanceLevel;

import java.lang.reflect.Method;

class Task {

 public void taskOne() {
	 long a = 0;
     for (int i = 0; i < 1000000; i++) {
    	 	a++;
     }
     System.out.println(a);
 }

 public void taskTwo() {
	 long a = 0;
     for (int i = 0; i < 2000000; i++) {
    	 	a++;
     }
     System.out.println(a);
 }
}

public class MethodExecutionTiming {

 public static void main(String[] args) throws Exception {

     Task task = new Task();
     Class<?> cls = task.getClass();

     Method[] methods = cls.getDeclaredMethods();

     for (Method method : methods) {

         long startTime = System.currentTimeMillis();

         method.invoke(task);

         long endTime = System.currentTimeMillis();

         System.out.println(
             "Method: " + method.getName() +
             " | Execution Time: " + (endTime - startTime) + " ms"
         );
     }
 }
}
