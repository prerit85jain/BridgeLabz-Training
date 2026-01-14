package advanceLevel;

import java.lang.reflect.Field;

class Person {
	private String name;
	private int age;
	private boolean live;
	
	public Person(String name, int age, boolean live) {
		this.name = name;
		this.age = age;
		this.live = live;
	}
}

public class ObjectToJson {

    public static String toJson(Object obj) throws Exception {

        Class<?> clc = obj.getClass();
        Field[] fields = clc.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            json.append("\"").append(field.getName()).append("\": ");

            Object value = field.get(obj);

            // Handle String values
            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        Person person = new Person("Parmanand", 21, true);

        String json = toJson(person);
        System.out.println(json);
    }
}
