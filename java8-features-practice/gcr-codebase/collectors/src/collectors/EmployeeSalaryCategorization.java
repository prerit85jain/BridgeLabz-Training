package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	String name;
	String department;
	double salary;
	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	
}

public class EmployeeSalaryCategorization {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Arpit", "IT", 60000),
                new Employee("Bobby", "HR", 45000),
                new Employee("Charlie", "IT", 70000),
                new Employee("Dev", "Finance", 80000),
                new Employee("Prem", "HR", 50000));
		
		Map<String, Double> avgSalaryByDept =employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)
                        ));

        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " Average Salary = " + avg));
	}

}
