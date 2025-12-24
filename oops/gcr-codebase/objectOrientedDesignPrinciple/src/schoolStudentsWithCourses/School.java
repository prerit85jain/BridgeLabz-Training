package schoolStudentsWithCourses;

import java.util.ArrayList;
import java.util.List;

class School {
	private String schoolName;
	private List<Student> students;
	
	public School(String schoolName) {
	    this.schoolName = schoolName;
	    this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
	    if (!students.contains(student)) {
	        students.add(student);
	    }
	}
	
	public void showStudents() {
	    System.out.println("Students in " + schoolName + ":");
	    for (Student student : students) {
	        System.out.println(" - " + student.getName());
	    }
	}
}
