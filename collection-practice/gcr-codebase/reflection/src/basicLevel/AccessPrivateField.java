package basicLevel;

import java.lang.reflect.Field;

class Person{
	private int age = 21;
}
public class AccessPrivateField {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		Class<?> clc = person.getClass();
		
		Field field = clc.getDeclaredField("age");
		field.setAccessible(true);
		System.out.println(field.get(person));
		field.set(person, 22);
		System.out.println(field.get(person));
	}
}
