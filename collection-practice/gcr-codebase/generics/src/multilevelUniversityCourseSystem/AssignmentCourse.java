package multilevelUniversityCourseSystem;

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through assignments and projects.");
    }
}