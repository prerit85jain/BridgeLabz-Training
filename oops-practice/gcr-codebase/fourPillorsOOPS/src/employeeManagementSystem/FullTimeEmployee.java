package employeeManagementSystem;

class FullTimeEmployee extends Employee implements Department{
	private String department;
	private double fixedSalary;
	
	public FullTimeEmployee(String empID, String empName, double fixedSalary) {
		super(empID, empName, fixedSalary);
		this.fixedSalary = fixedSalary;
	}
	
	public double calculateSalary() {
		return fixedSalary;
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