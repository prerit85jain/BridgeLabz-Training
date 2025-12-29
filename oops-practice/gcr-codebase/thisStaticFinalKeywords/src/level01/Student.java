package level01;

public class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private final String rollNumber;

    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static void setUniversityName(String newName) {
        universityName = newName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "RN001", "A");
        Student student2 = new Student("Bob", "RN002", "B");

        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }
        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }

        // Display total students
        Student.displayTotalStudents();

        Student.setUniversityName("International University");
        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }
    }
}