package practiceProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Student{
	private String name;
	private int age;
	private List<String> subjects;
	
	Student(String name, int age, List<String> subjects){
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public List<String> getSubjects() {return subjects;}
}

public class JavaObjectToJson {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Student> students = new ArrayList<>();
		students.add(new Student("Prerit", 21, Arrays.asList("Java", "Spring Boot")));
		students.add(new Student("Prem", 22, Arrays.asList("Java", "Spring Boot")));
		
		String jsonData = objectMapper.writeValueAsString(students);
		System.out.println(jsonData);
	}

}
