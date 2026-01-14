package advanceLevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting{
	void sayHello();
}

class GreetingImpl implements Greeting{
	@Override
	public void sayHello() {
		System.out.println("Hello buddy!!!!");
	}
}

class LoggingHandler implements InvocationHandler{
	private Object target;
	
	public LoggingHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Calling Method: "+ method.getName());
		return method.invoke(target, args);
	}
	
}

public class LoggingProxy {
	public static void main(String[] args) {
		Greeting original = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(original)
        );

        proxy.sayHello();
	}
}
