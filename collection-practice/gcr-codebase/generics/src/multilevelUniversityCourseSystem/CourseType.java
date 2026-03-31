package multilevelUniversityCourseSystem;

abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public abstract void evaluate();

    @Override
    public String toString() {
        return courseName + " (Instructor: " + instructor + ")";
    }
}