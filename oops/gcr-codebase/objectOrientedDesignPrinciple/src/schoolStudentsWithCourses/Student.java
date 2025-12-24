package schoolStudentsWithCourses;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String name;
	private List<Course> courses;
	
	public Student(String name) {
		this.name = name;
	    this.courses = new ArrayList<>();
	}
	
	public String getName() {
	    return name;
	}
	
	public void enrollCourse(Course course) {
	    if (!courses.contains(course)) {
	        courses.add(course);
	    }
	}
	
	public void viewCourses() {
	    System.out.println("Courses for " + name + ":");
	    for (Course course : courses) {
	        System.out.println(" - " + course.getCourseName());
	    }
	}
}
