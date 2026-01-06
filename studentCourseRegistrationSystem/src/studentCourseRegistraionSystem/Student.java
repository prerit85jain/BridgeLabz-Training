package studentCourseRegistraionSystem;

import java.util.HashMap;
import java.util.LinkedList;

public class Student extends Person {
	private String studentId;
	private LinkedList<Course> enrolledCourse;
	private HashMap<String, String> grades;
	Student(String studentId, String name, String email){
		super(name, email);
		this.studentId = studentId;
		this.enrolledCourse = new LinkedList<>();
		this.grades = new HashMap<>();
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public LinkedList<Course> getEnrolledCourse(){
		return enrolledCourse;
	}
	
	public void addGrade(String courseId, String grade) {
		grades.put(courseId, grade);
	}
	
	public void viewGrades() {
		if(grades.isEmpty()) {
			System.out.println("No grade available");
			return;
		}
		System.out.println("Grades:");
		for(String courseId : grades.keySet()) {
			System.out.println(courseId + " - " + grades.get(courseId));
		}
	}
}
