package employeeManagementSystem;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee ftm = new FullTimeEmployee("F001", "Alice", 15000);
		ftm.assignDepartment("SDE");
		
		PartTimeEmployee ptm = new PartTimeEmployee("P001", "Bob", 500, 5);
		ptm.assignDepartment("ID");
		
		System.out.println("Employees Details");
		System.out.println("+-----------------------------------------------------+");
		ftm.displayDetails();
		System.out.println("+-----------------------------------------------------+");
		ptm.displayDetails();
		

	}

}
