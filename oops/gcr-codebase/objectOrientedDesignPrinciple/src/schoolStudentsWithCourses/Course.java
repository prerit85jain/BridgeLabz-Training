package schoolStudentsWithCourses;
import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> studentsEnrolled;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!studentsEnrolled.contains(student)) {
            studentsEnrolled.add(student);
            student.enrollCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : studentsEnrolled) {
            System.out.println(" - " + student.getName());
        }
    }
}