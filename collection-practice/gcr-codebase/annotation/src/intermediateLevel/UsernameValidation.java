package intermediateLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength{
	int length() default 13;

}

class User{
	@MaxLength(length = 5)
	String userName;
}

public class UsernameValidation {
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.userName = "PreritJain";
		
		Class<?> clc = user.getClass();
		Field field = clc.getDeclaredField("userName");
		MaxLength anno = field.getAnnotation(MaxLength.class);
		try {
			if(user.userName.length() > anno.length()) {
				throw new Exception("Validation failed: Username too long!!");
			}else {
				System.out.println("Validation passed!");
			}
		}catch(Exception e) {
			System.out.println("Exception occur: "+ e.getMessage());
		}
	}

}
