package universityFacultiesDepartments;

public class UniversityDemo {
	public static void main(String[] args) {
	    Faculty profSmith = new Faculty("Prof. Smith");
	    Faculty drJones = new Faculty("Dr. Jones");
	    Faculty profBrown = new Faculty("Prof. Brown");
	
	    Department csDept = new Department("Computer Science");
	    Department physicsDept = new Department("Physics");
	
	    csDept.addFaculty(profSmith);
	    physicsDept.addFaculty(drJones);
	
	    University uni = new University("Global University");
	    uni.addDepartment(csDept);
	    uni.addDepartment(physicsDept);
	
	    System.out.println("Independent faculty:");
	    System.out.println("- " + profBrown.getName());
	
	    System.out.println("\nUniversity Structure:");
	    uni.display();
	
	    System.out.println("\nDeleting the university...");
	    uni.deleteUniversity();
	
	    System.out.println("Departments still exist? " + uni.hasDepartments());
	
	    System.out.println("\nFaculty still exist independently:");
	    System.out.println("- " + profSmith.getName());
	    System.out.println("- " + drJones.getName());
	    System.out.println("- " + profBrown.getName());
	}
}