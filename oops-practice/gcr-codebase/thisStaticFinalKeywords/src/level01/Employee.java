package level01;
public class Employee {
    private static String companyName = "Tech Innovators Inc.";
    private static int totalEmployees = 0;

    private final String id;

    private String name;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "EMP001", "Software Engineer");
        Employee emp2 = new Employee("Bob", "EMP002", "Product Manager");

        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }

        Employee.displayTotalEmployees();

        Employee.setCompanyName("Global Tech Solutions");
        emp1.displayEmployeeDetails();

    }
}