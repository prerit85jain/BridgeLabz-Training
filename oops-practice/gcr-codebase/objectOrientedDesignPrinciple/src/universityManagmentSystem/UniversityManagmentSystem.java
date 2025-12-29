package universityManagmentSystem;

public class UniversityManagmentSystem {
	public static void main(String[] args) {
	    Student alice = new Student("Alice");
	    Student bob = new Student("Bob");
	
	    Professor drSmith = new Professor("Dr. Smith");
	    Professor drJones = new Professor("Dr. Jones");
	
	    Course math = new Course("Mathematics");
	    Course physics = new Course("Physics");
	
	    drSmith.assignToCourse(math);
	    drJones.assignToCourse(physics);
	
	    alice.enrollCourse(math);
	    alice.enrollCourse(physics);
	    bob.enrollCourse(math);
	
	    System.out.println();
	    alice.listCourses();
	    bob.listCourses();
	
	    System.out.println();
	    drSmith.listCourses();
	    drJones.listCourses();
	
	    System.out.println();
	    math.listStudents();
	    physics.listStudents();
	}
}