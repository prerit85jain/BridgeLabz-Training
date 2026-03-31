package multilevelUniversityCourseSystem;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public List<T> getCourses() {
        return courseList;
    }

    public void showAllCourses() {
        for (T course : courseList) {
            System.out.println(course);
            course.evaluate();
        }
    }
}