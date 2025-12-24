package companyAndDepartment;

public class CompanyDeptEmployeeDemo {
	public static void main(String[] args) {
	
	   Company company = new Company("Tech Innovators Inc.");
	
	   Department devDept = new Department("Development");
	   Department hrDept = new Department("HR");
	
	   devDept.addEmployee(new Employee("Alice", "Developer"));
	   devDept.addEmployee(new Employee("Bob", "Senior Developer"));
	   hrDept.addEmployee(new Employee("Carol", "HR Manager"));
	
	   company.addDepartment(devDept);
	   company.addDepartment(hrDept);
	
	   company.displayStructure();
	
	   System.out.println("\nWhen deleting the company:");
	   company.deleteCompany();
	
	   company.displayStructure();
	}
}