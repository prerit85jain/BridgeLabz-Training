package intermediateLevel;

import java.lang.reflect.Field;

class Configuration {
	private static String API_KEY = "ANY_KEY_YOU_WANT";
}

public class StaticModifyStaticField {
	public static void main(String[] args) throws Exception {
		Class<?> clc = Configuration.class;
		
		Field field = clc.getDeclaredField("API_KEY");
		field.setAccessible(true);
		field.set(null, "MODIFIED_KEY");
		
		System.out.println(field.get(null));
		
	}
}
