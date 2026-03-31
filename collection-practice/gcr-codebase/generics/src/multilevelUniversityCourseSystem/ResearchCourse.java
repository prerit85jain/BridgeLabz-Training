package multilevelUniversityCourseSystem;

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through research papers and presentations.");
    }
}