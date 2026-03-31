package beginnerLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo{
	String task();
	String assignedTo();
	String priority() default "Medium";
}

public class CustomAnnotationForToDo {
	@Todo(task = "Complete Scenario base probelm", assignedTo = "Prem", priority = "Easy")
	public static void scenarioBase() {
		System.out.println("1. Library System");
		System.out.println("2. Student Management System");
	}
	
	@Todo(task = "Update README", assignedTo = "Prerit", priority = "Hard")
	public static void updateReadme() {
		System.out.println("1. Update README of DSA");
		System.out.println("2. Update README of Collections");
	}
	
	@Todo(task = "Submit Annotation assignment", assignedTo = "Padosi")
	public static void assignment() {
		System.out.println("1. Annotation Assignment");
		System.out.println("2. Reflection Assignment");
	}
	
	public static void main(String[] args) throws Exception {
		CustomAnnotationForToDo task = new CustomAnnotationForToDo();
		Class<?> clc = task.getClass();
		
		for(Method method : clc.getDeclaredMethods()) {
			if(method.isAnnotationPresent(Todo.class)) {
				Todo todo = method.getAnnotation(Todo.class);
				System.out.println();
				System.out.println("Task: " + todo.task() + " \n\t Assigned to: " + todo.assignedTo()
				 + " \n\t Priority: " + todo.priority());
			}
		}
	}
}
