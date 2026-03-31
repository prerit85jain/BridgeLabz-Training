package basicLevel;

import java.lang.reflect.Constructor;

class Student{
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Student name: "+ name);
	}
	
}

public class CreateObjectReflection {
	public static void main(String[] args) throws Exception {
		Class<?> clc = Student.class;
		Constructor<?> constructor = clc.getDeclaredConstructor(String.class);
		
		Student student = (Student) constructor.newInstance("Prerit");
		student.display();
	}
}
