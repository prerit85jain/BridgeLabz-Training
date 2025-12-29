package universityManagmentSystem;

import java.util.ArrayList;
import java.util.List;

class Course {
 private String courseName;
 private Professor professor;
 private List<Student> students;

 public Course(String courseName) {
     this.courseName = courseName;
     this.students = new ArrayList<>();
 }

 public String getCourseName() {
     return courseName;
 }

 public void setProfessor(Professor professor) {
     this.professor = professor;
 }

 public Professor getProfessor() {
     return professor;
 }

 public void addStudent(Student student) {
     if (!students.contains(student)) {
         students.add(student);
     }
 }

 public void listStudents() {
     System.out.println("Students in " + courseName + ":");
     for (Student s : students) {
         System.out.println(" - " + s.getName());
     }
 }
}