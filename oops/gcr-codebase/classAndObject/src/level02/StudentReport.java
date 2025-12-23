package level02;

class Student{
	private String name;
	private int rollNo;
	private int[] marks;
	
	Student(String name, int rollNo, int[] marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public void studentDetails() {
		System.out.println("Student Details: ");
		System.out.println("Name: "+ name);
		System.out.println("Roll No.: "+ rollNo);
		System.out.println("Marks: ");
		for(int i=0; i<marks.length; i++) {
			System.out.println("Marks "+i+": "+marks[i]);
		}
		System.out.println("Grade: "+ calculateGrade());
		System.out.println("+-----------------------------+");
	}
	
	public String calculateGrade() {
		int totalMarks = calculateTotalMarks(marks);
		if(totalMarks>=80) {
			return "Grade A";
		}else if(totalMarks>=60) {
			return "Grade B";
		}else if(totalMarks>=50){
			return "Grade C";
		}else if(totalMarks>=40) {
			return "Grade D";
		}else if(totalMarks>=30) {
			return "Grade E";
		}else {
			return "Grade F";
		}
	}
	
	public static int calculateTotalMarks(int[] marks) {
		int totalMarks = 0;
		for(int i : marks) {
			totalMarks+=i;
		}
		return totalMarks;
	}
}
public class StudentReport {
	public static void main(String[] args) {
		int[] marks1 = {80, 70, 75};
		int[] marks2 = {60,65,50};
		Student student1 = new Student("Alice",1,marks1);
		Student student2 = new Student("Bob", 2, marks2);
		
		student1.studentDetails();
		student2.calculateGrade();
	}
}
