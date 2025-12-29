package hybridInheritance;

public class VehicleManagementSystem {

	class Vehicle {
	    protected int maxSpeed;
	    protected String model;

	    public Vehicle(int maxSpeed, String model) {
	        this.maxSpeed = maxSpeed;
	        this.model = model;
	    }

	    public void displayDetails() {
	        System.out.println("Model: " + model);
	        System.out.println("Max Speed: " + maxSpeed + " km/h");
	    }
	}

	interface Refuelable {
	    void refuel();
	}

	class ElectricVehicle extends Vehicle {
	    public ElectricVehicle(int maxSpeed, String model) {
	        super(maxSpeed, model);
	    }

	    public void charge() {
	        System.out.println(model + " is charging.");
	    }
	}

	class PetrolVehicle extends Vehicle implements Refuelable {
	    public PetrolVehicle(int maxSpeed, String model) {
	        super(maxSpeed, model);
	    }

	    @Override
	    public void refuel() {
	        System.out.println(model + " is refueling with petrol.");
	    }
	}

	    public static void main(String[] args) {
	    	VehicleManagementSystem vms = new VehicleManagementSystem();
	        ElectricVehicle ev = vms.new ElectricVehicle(150, "Tesla Model 3");
	        PetrolVehicle pv = vms.new PetrolVehicle(180, "Toyota Camry");

	        System.out.println("Electric Vehicle Details:");
	        ev.displayDetails();
	        ev.charge();

	        System.out.println("\nPetrol Vehicle Details:");
	        pv.displayDetails();
	        pv.refuel();
	    }
	}
