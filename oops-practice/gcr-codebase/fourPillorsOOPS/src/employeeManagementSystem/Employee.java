package employeeManagementSystem;

abstract class Employee {
	private String empID;
	private String empName;
	private double salary;
	
	public Employee(String empID, String empName, double salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String getEmpId() {
		return empID;
	}
	public void setEmpId(String empID) {
		this.empID = empID;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getsSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee Name: "+empName);
		System.out.println("Base Salary: "+salary);
		System.out.println("Total Salary: "+calculateSalary());
	}
}
