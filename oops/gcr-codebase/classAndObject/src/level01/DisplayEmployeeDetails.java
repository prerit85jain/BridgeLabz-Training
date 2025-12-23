package level01;

class Employee {
	private String name;
	private int id;
	private double salary;
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Destals: ");
		System.out.println("Employee ID: "+ id);
		System.out.println("Employee name: "+name);
		System.out.println("Emlpoyee salary: "+salary);
		System.out.println("+----------------------------------+");
	}
	
}

public class DisplayEmployeeDetails{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Alice", 01, 50000);
		Employee emp2 = new Employee("Bob", 02, 45000);
		
		emp1.displayDetails();
		emp2.displayDetails();
		
	}
}
