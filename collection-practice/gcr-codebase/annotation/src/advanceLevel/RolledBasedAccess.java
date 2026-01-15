package advanceLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RoleAllowed{
	String role() default "No role assined";
}

@RoleAllowed(role = "ADMIN")
class SecureService{
	public void getAccess() {
		System.out.println("Access Accepted :)");
	}	
}

public class RolledBasedAccess {

	public static void main(String[] args) {
		SecureService service = new SecureService();
		Class<?> clc = service.getClass();
		try {
			Method method = clc.getMethod("getAccess");
			RoleAllowed role = clc.getAnnotation(RoleAllowed.class);
			if(role.role().equals("ADMIN")) {
				method.invoke(service);
			}else {
				System.out.println("Access Denied!");
			}
		}catch(Exception e) {
			System.out.println("Exception occur: " + e.getMessage());
		}
	}

}
