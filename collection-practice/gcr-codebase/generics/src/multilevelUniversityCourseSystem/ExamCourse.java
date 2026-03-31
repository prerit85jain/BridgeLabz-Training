package multilevelUniversityCourseSystem;

class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through written exams.");
    }
}