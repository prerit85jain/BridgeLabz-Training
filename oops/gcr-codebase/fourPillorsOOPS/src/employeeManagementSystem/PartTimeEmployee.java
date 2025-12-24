package employeeManagementSystem;

class PartTimeEmployee extends Employee implements Department {

	private String department;
	private double hourlySalary;
	private int workHours;
	
	public PartTimeEmployee(String empID, String empName, double hourlySalary, int workHours) {
		super(empID, empName, hourlySalary);
		this.hourlySalary = hourlySalary;
		this.workHours = workHours;
	}
	
	public double calculateSalary() {
		return hourlySalary*workHours;
	}
	
	public void assignDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartmentDetails() {
		return "Department: "+department;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println(getDepartmentDetails());
	}
	
}
