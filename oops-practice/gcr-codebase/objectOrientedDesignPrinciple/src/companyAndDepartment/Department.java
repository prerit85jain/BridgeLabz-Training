package companyAndDepartment;
import java.util.ArrayList;

class Department {
private String name;
private ArrayList<Employee> employees;

public Department(String name) {
   this.name = name;
   this.employees = new ArrayList<>();
}

public void addEmployee(Employee employee) {
   employees.add(employee);
}

public void displayEmployees() {
   System.out.println("Department: " + name);
   for (Employee emp : employees) {
       System.out.println(" - " + emp);
   }
}

public String getName() {
   return name;
}
}