package advanceLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class Service {
    public void serve() {
        System.out.println("Service is working...");
    }
}

class Client {

    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}

class SimpleDIContainer {

    public static <T> T createObject(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

                Object dependency =
                        field.getType().getDeclaredConstructor().newInstance();

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
        return obj;
    }
}

public class DependencyInjectionDemo {

    public static void main(String[] args) throws Exception {

        Client client = SimpleDIContainer.createObject(Client.class);
        client.doWork();
    }
}
