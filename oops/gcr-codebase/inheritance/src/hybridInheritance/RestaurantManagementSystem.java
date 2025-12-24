package hybridInheritance;

public class RestaurantManagementSystem {

	class Person {
	    protected String name;
	    protected int id;
	    
	    public Person(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	    }
	}

	interface Worker {
	    void performDuties();
	}

	class Chef extends Person implements Worker {
	    public Chef(String name, int id) {
	        super(name, id);
	    }
	    
	    @Override
	    public void performDuties() {
	        System.out.println(name + " is preparing the food.");
	    }
	}

	class Waiter extends Person implements Worker {
	    public Waiter(String name, int id) {
	        super(name, id);
	    }
	    
	    @Override
	    public void performDuties() {
	        System.out.println(name + " is serving the customers.");
	    }
	}

	    public static void main(String[] args) {
	    	RestaurantManagementSystem rms = new RestaurantManagementSystem();
	        Chef chef = rms.new Chef("Gordon Ramsay", 101);
	        Waiter waiter = rms.new Waiter("Alice Smith", 201);
	        
	        // Display person details and perform duties
	        System.out.println("Chef Details:");
	        chef.displayDetails();
	        chef.performDuties();
	        
	        System.out.println("\nWaiter Details:");
	        waiter.displayDetails();
	        waiter.performDuties();
	    }
	}

