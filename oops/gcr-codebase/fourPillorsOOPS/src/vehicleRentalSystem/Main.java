package vehicleRentalSystem;

public class Main{
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C001", 50, "INS1001"),
            new Bike("B001", 20, "INS2001"),
            new Truck("T001", 150, "INS3001")
        };

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());

            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);

            if (v instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) v;
                double insuranceCost = insurableVehicle.calculateInsurance();
                String insuranceDetails = insurableVehicle.getInsuranceDetails();
                System.out.println("Insurance Cost: $" + insuranceCost);
                System.out.println("Insurance Details: " + insuranceDetails);
            }

            System.out.println("-----------------------------------");
        }
    }
}