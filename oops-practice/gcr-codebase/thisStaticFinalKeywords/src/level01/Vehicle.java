package level01;
public class Vehicle {
    private static double registrationFee = 100.0;

    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. Must be non-negative.");
        }
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "V001");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "V002");

        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }
        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }

        System.out.println("\nUpdating registration fee to $150.0");
        Vehicle.updateRegistrationFee(150.0);

        System.out.println("\nVehicle 1 details after fee update:");
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }
    }
}