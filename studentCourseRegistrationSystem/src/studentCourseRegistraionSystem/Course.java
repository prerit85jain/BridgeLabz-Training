package studentCourseRegistraionSystem;

public class Course {
	private String courseId;
	private String courseName;
	private int credit;
	
	Course(String courseId, String courseName, int credit){
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	@Override
	public String toString() {
		return courseId + " - " + courseName + " (" + credit + " credits)";
	}
}
