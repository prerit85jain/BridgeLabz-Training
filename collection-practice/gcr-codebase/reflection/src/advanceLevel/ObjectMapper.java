package advanceLevel;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Student{
	private String name;
	private int age;
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}
}

class ObjectMapperUtil{
	
	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception{
		T obj = clazz.getDeclaredConstructor().newInstance();
		for (Map.Entry<String, Object> entry : properties.entrySet()) {

            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);

            field.set(obj, fieldValue);
        }

        return obj;
	}
}
public class ObjectMapper {

	public static void main(String[] args) throws Exception {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Prerit");
        data.put("age", 21);

        Student student = ObjectMapperUtil.toObject(Student.class, data);

        student.display();
    }

}
