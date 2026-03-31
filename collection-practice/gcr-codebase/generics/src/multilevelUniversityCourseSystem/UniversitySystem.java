package multilevelUniversityCourseSystem;

import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures", "Dr. Sharma"));
        examCourses.addCourse(new ExamCourse("Operating Systems", "Prof. Rao"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering", "Dr. Mehta"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Systems", "Dr. Gupta"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence", "Dr. Verma"));
        researchCourses.addCourse(new ResearchCourse("Machine Learning", "Prof. Iyer"));

        System.out.println("=== Department-wise Course Details ===");
        System.out.println("\n--- Exam-Based Courses ---");
        examCourses.showAllCourses();

        System.out.println("\n--- Assignment-Based Courses ---");
        assignmentCourses.showAllCourses();

        System.out.println("\n--- Research-Based Courses ---");
        researchCourses.showAllCourses();

        System.out.println("\n=== Displaying All Courses Dynamically Using Wildcards ===");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.addAll(examCourses.getCourses());
        allCourses.addAll(assignmentCourses.getCourses());
        allCourses.addAll(researchCourses.getCourses());

        UniversityUtils.displayAllCourses(allCourses);
    }
}