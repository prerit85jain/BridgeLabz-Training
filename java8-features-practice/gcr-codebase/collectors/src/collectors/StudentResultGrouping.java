package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	String name;
	String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
}

public class StudentResultGrouping {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("Diana", "C"),
                new Student("Eve", "B"));
		
		Map<String, List<String>> result = students.stream().collect(Collectors.groupingBy(s->s.grade,
				Collectors.mapping(s->s.name, Collectors.toList())));
		
		result.forEach((grade, name) -> System.out.println("Grades "+grade+" : "+name));
	}

}
