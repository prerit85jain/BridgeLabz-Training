package universityManagmentSystem;

import java.util.ArrayList;
import java.util.List;

class Professor {
 private String name;
 private List<Course> coursesTaught;

 public Professor(String name) {
     this.name = name;
     this.coursesTaught = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void assignToCourse(Course course) {
     if (!coursesTaught.contains(course)) {
         coursesTaught.add(course);
         course.setProfessor(this);
         System.out.println("Professor " + name + " assigned to " + course.getCourseName());
     }
 }

 public void listCourses() {
     System.out.println("Courses taught by " + name + ":");
     for (Course c : coursesTaught) {
         System.out.println(" - " + c.getCourseName());
     }
 }
}
