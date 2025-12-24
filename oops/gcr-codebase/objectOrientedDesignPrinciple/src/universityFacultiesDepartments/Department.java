package universityFacultiesDepartments;

import java.util.ArrayList;
import java.util.List;

class Department {
 private String name;
 private List<Faculty> facultyMembers;

 public Department(String name) {
     this.name = name;
     this.facultyMembers = new ArrayList<>();
 }

 public void addFaculty(Faculty faculty) {
     facultyMembers.add(faculty);
 }

 public String getName() {
     return name;
 }

 public void displayFaculty() {
     System.out.println("Faculty in " + name + ":");
     for (Faculty f : facultyMembers) {
         System.out.println(" - " + f.getName());
     }
 }
}
