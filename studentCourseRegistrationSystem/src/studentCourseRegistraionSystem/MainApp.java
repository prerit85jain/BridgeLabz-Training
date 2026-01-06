package studentCourseRegistraionSystem;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CourseRegistrationService service = new CourseRegistrationService();

        while (true) {
            System.out.println("\n===== STUDENT COURSE REGISTRATION SYSTEM =====");
            System.out.println("1. Register Student"); 
            System.out.println("2. Enroll Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Enrolled Courses");
            System.out.println("5. Add Grade");
            System.out.println("6. View Grades");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Student student = new Student(sid, name, email);
                    service.registerStudent(student);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    sid = sc.nextLine();

                    System.out.print("Enter Course ID: ");
                    String cid = sc.nextLine();

                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Enter Credits: ");
                    int credits = sc.nextInt();
                    sc.nextLine();

                    Course course = new Course(cid, cname, credits);

                    try {
                        service.enrollCourse(sid, course);
                    } catch (CourseLimitExceededException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    sid = sc.nextLine();

                    System.out.print("Enter Course ID to drop: ");
                    cid = sc.nextLine();

                    service.dropCourse(sid, cid);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    sid = sc.nextLine();
                    service.viewCourses(sid);
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    sid = sc.nextLine();

                    System.out.print("Enter Course ID: ");
                    cid = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    service.getStudent(sid).addGrade(cid, grade);
                    System.out.println("Grade added successfully.");
                    break;

                case 6:
                    System.out.print("Enter Student ID: ");
                    sid = sc.nextLine();
                    service.getStudent(sid).viewGrades();
                    break;

                case 7:
                    System.out.println("Thank you for using the system.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
