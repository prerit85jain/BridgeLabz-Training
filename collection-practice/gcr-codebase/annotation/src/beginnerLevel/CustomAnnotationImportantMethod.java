package beginnerLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod{
	String level() default "High";
}
public class CustomAnnotationImportantMethod {

	@ImportantMethod
	public static void welcome() throws Exception {
		CustomAnnotationImportantMethod obj = new CustomAnnotationImportantMethod();
		Class<?> clc = obj.getClass();
		
		Method method = clc.getMethod("welcome");
		
		ImportantMethod anno = method.getAnnotation(ImportantMethod.class);
		
		System.out.println("Welcome Method level: "+ anno.level());
	}
	
	@ImportantMethod(level = "Easy")
	public static void goodBye() {
		System.out.print("Nikal chal!! ");
	}
	public static void main(String[] args) throws Exception {
		welcome();
		goodBye();
		CustomAnnotationImportantMethod obj = new CustomAnnotationImportantMethod();
		Class<?> clc = obj.getClass();
		
		Method method = clc.getMethod("goodBye");
		
		ImportantMethod anno = method.getAnnotation(ImportantMethod.class);
		System.out.println("Level: "+ anno.level());
	}

}
