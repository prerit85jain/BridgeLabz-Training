package multilevelInheritance;

public class SchoolSystemDifferentRole {

	class Person {
	    String name;
	    int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

	class Teacher extends Person {
	    String subject;

	    public Teacher(String name, int age, String subject) {
	        super(name, age);
	        this.subject = subject;
	    }

	    public void displayRole() {
	        System.out.println("Teacher Role: " + name + " teaches " + subject);
	    }
	}

	class Student extends Person {
	    String grade;

	    public Student(String name, int age, String grade) {
	        super(name, age);
	        this.grade = grade;
	    }

	    public void displayRole() {
	        System.out.println("Student Role: " + name + " is in grade " + grade);
	    }
	}

	class Staff extends Person {
	    String position;

	    public Staff(String name, int age, String position) {
	        super(name, age);
	        this.position = position;
	    }

	    public void displayRole() {
	        System.out.println("Staff Role: " + name + " works as " + position);
	    }
	}

	public static void main(String[] args) {
		SchoolSystemDifferentRole ssdr = new SchoolSystemDifferentRole();
        Teacher teacher = ssdr.new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = ssdr.new Student("Alice", 14, "8th");
        Staff staff = ssdr.new Staff("Mrs. Johnson", 35, "Administrator");

        teacher.displayInfo();
        teacher.displayRole();

        student.displayInfo();
        student.displayRole();

        staff.displayInfo();
        staff.displayRole();
    }
}
