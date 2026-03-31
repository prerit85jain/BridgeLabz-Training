package advanceLevel;

import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField{
	String name();
}

class User{
	@JsonField(name = "user_name")
	private String username;
	
	public User(String username) {
		this.username = username;
	}
}

public class JsonSerialization {

	public static void main(String[] args) {
		User user = new User("Prerit");
		Class<?> clc = user.getClass();
		
		try {
			Field field = clc.getDeclaredField("username");
			field.setAccessible(true);
			JsonField anno = field.getAnnotation(JsonField.class);
			System.out.println("{");
			System.out.println("  \"" + anno.name() + "\" : \"" +
			field.get(user) + "\",");
			System.out.println("}");
		}catch(Exception e) {
			System.out.println("Exception occur: " + e.getMessage());
		}
	}

}
