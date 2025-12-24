package companyAndDepartment;
import java.util.ArrayList;

class Company {
private String name;
private ArrayList<Department> departments;

public Company(String name) {
   this.name = name;
   this.departments = new ArrayList<>();
}

public void addDepartment(Department dept) {
   departments.add(dept);
}

public void displayStructure() {
   System.out.println("Company: " + name);
   for (Department dept : departments) {
       System.out.println(" Department: " + dept.getName());
       dept.displayEmployees();
   }
}

public void deleteCompany() {
   System.out.println("Deleting the company and all associated departments and employees...");
   System.out.println("Company deleted.");
}
}