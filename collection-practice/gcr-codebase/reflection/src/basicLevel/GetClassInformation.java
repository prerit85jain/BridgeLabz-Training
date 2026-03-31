package basicLevel;

import java.lang.reflect.*;

class Sample{
	private String name;
	private int age;
	
	public Sample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getName() {
		System.out.println("Name: "+ name);
	}
	
	public void getAge() {
		System.out.println("Age: "+ age);
	}
	
}
public class GetClassInformation {
	public static void main(String[] args) {
		Sample sample = new Sample("demo1", 1);
		
		Class<?> clc = sample.getClass();
		
		System.out.println("Fields name: ");
		Field[] fields = clc.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println("\nMethods name: ");
		Method[] methods = clc.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("\nConstructors name: ");
		Constructor<?>[] constructors = clc.getDeclaredConstructors();
		for(Constructor<?> constructor : constructors) {
			System.out.println(constructor.getName());
		}
	}
}
