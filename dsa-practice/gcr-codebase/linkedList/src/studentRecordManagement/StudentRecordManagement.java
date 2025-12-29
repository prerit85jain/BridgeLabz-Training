package studentRecordManagement;

public class StudentRecordManagement {
    private Node head;

    public StudentRecordManagement() {
        this.head = null;
    }

    public void addAtBeginning(Student student) {
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(Student student, int position) {
        if (position == 0) {
            addAtBeginning(student);
            return;
        }
        Node newNode = new Node(student);
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.student.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.student.rollNumber != rollNumber) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student not found");
            return;
        }

        current.next = current.next.next;
        System.out.println("Student deleted");
    }

    public Student searchByRollNumber(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.student.rollNumber == rollNumber) {
                return temp.student;
            }
            temp = temp.next;
        }
        return null; // Not found
    }

    public void updateGrade(int rollNumber, String newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated");
        } else {
            System.out.println("Student not found");
        }
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display");
            return;
        }
        Node temp = head;
        while (temp != null) {
            Student s = temp.student;
            System.out.println("Roll No: " + s.rollNumber + ", Name: " + s.name + ", Age: " + s.age + ", Grade: " + s.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        srm.addAtBeginning(new Student(101, "Alice", 20, "A"));
        srm.addAtEnd(new Student(102, "Bob", 21, "B"));
        srm.addAtPosition(new Student(103, "Charlie", 22, "C"), 1);

        srm.displayAll();

        Student found = srm.searchByRollNumber(102);
        if (found != null) {
            System.out.println("Found: " + found.name);
        }

        srm.updateGrade(102, "A+");

        srm.deleteByRollNumber(101);

        srm.displayAll();
    }
}