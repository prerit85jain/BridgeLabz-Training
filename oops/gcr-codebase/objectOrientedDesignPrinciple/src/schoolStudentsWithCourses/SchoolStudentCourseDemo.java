package schoolStudentsWithCourses;

public class SchoolStudentCourseDemo {
	public static void main(String[] args) {
	    School school = new School("Greenwood High");
	
	    Student alice = new Student("Alice");
	    Student bob = new Student("Bob");
	    Student charlie = new Student("Charlie");
	
	    school.addStudent(alice);
	    school.addStudent(bob);
	    school.addStudent(charlie);
	
	    Course math = new Course("Mathematics");
	    Course science = new Course("Science");
	    Course history = new Course("History");
	
	    math.enrollStudent(alice);
	    math.enrollStudent(bob);
	
	    science.enrollStudent(alice);
	    science.enrollStudent(charlie);
	
	    history.enrollStudent(bob);
	    history.enrollStudent(charlie);
	
	    school.showStudents();
	    System.out.println();
	
	    alice.viewCourses();
	    System.out.println();
	
	    math.showEnrolledStudents();
	    System.out.println();
	
	    science.showEnrolledStudents();
	    System.out.println();
	
	    history.showEnrolledStudents();
	}
}