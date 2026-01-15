package advanceLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult { }

class ExpensiveService {

    @CacheResult
    public int computeFactorial(int n) {
        System.out.println("Computing factorial for " + n + " ...");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result *= i;
        }
        return result;
    }
}

class CacheController {
    private Map<String, Object> cache = new HashMap<>();

    public Object invoke(Object obj, String methodName, Object... args) throws Exception {
        Class<?> clazz = obj.getClass();

        Class<?>[] paramTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Integer) {
                paramTypes[i] = int.class;
            } else if (args[i] instanceof Double) {
                paramTypes[i] = double.class;
            } else if (args[i] instanceof Boolean) {
                paramTypes[i] = boolean.class;
            } else {
                paramTypes[i] = args[i].getClass();
            }
        }

        Method method = clazz.getMethod(methodName, paramTypes);

        String key = methodName + java.util.Arrays.toString(args);

        if (method.isAnnotationPresent(CacheResult.class)) {
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for " + key);
                return cache.get(key);
            } else {
                Object result = method.invoke(obj, args);
                cache.put(key, result);
                return result;
            }
        } else {
            return method.invoke(obj, args);
        }
    }
}

public class CachingSystem {
    public static void main(String[] args) throws Exception {
        ExpensiveService service = new ExpensiveService();
        CacheController controller = new CacheController();

        Object result1 = controller.invoke(service, "computeFactorial", 5);
        System.out.println("Result: " + result1);

        Object result2 = controller.invoke(service, "computeFactorial", 5);
        System.out.println("Result: " + result2);

        Object result3 = controller.invoke(service, "computeFactorial", 6);
        System.out.println("Result: " + result3);
    }
}