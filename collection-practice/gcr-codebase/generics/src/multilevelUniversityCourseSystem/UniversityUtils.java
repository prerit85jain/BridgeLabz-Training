package multilevelUniversityCourseSystem;

import java.util.List;

class UniversityUtils {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName() + " | Instructor: " + course.getInstructor());
            course.evaluate();
        }
    }
}