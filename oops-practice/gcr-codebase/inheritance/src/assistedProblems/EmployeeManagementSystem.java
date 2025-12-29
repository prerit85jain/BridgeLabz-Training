package assistedProblems;

public class EmployeeManagementSystem {
	static class Employee{
		String name;
		String id;
		double salary;
		
		public Employee(String name, String id, double salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}
		
		void displayDetails() {
			System.out.println(id+" "+name+" "+salary);
		}
	}
	
	static class Manager extends Employee{
		int teamSize;
		
		public Manager(String name, String id, double salary, int teamSize) {
			super(name, id, salary);
			this.teamSize = teamSize;
		}
		
		void displayDetails() {
			super.displayDetails();
			System.out.println("Team Size: "+teamSize);
		}
	}
	
	static class Developer extends Employee{
		String programmingLanguage;
		
		public Developer(String name, String id, double salary, String programmingLanguage) {
			super(name, id, salary);
			this.programmingLanguage = programmingLanguage;
		}
		
		void displayDetails() {
			super.displayDetails();
			System.out.println("Programming Language: "+programmingLanguage);
		}
	}
	
	static class Intern extends Employee{
		String university;
		
		public Intern(String name, String id, double salary, String university) {
			super(name, id, salary);
			this.university = university;
		}
		
		void displayDetails() {
			super.displayDetails();
			System.out.println("University: "+university);
		}
	}
	
	public static void main(String[] args) {
		Employee Manager1 = new Manager("Alpha", "M01", 50000, 10);
		Manager1.displayDetails();
		System.out.println("+------------------------------------------------+");
		Employee emp01 = new Employee("Bob", "E01", 20000);
		emp01.displayDetails();
		System.out.println("+------------------------------------------------+");		
		Employee Intern1 = new Intern("Carley", "I01", 10000, "GLA University");
		Intern1.displayDetails();
	}
}
