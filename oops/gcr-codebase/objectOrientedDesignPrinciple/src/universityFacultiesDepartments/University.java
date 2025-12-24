package universityFacultiesDepartments;

import java.util.ArrayList;
import java.util.List;

class University {
private String name;
private List<Department> departments;

public University(String name) {
    this.name = name;
    this.departments = new ArrayList<>();
}

public void addDepartment(Department dept) {
    departments.add(dept);
}

public void display() {
    System.out.println("University: " + name);
    for (Department dept : departments) {
        System.out.println("- Department: " + dept.getName());
        dept.displayFaculty();
    }
}

public void deleteUniversity() {
    System.out.println("Deleting university and its departments...");
    departments.clear();
    System.out.println("University deleted.");
}

public boolean hasDepartments() {
    return !departments.isEmpty();
}
}
