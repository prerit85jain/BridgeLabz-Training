package ridingHailingApplication;

public class Main{
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("V001", "Alice", 2.0, "Downtown"),
            new Bike("V002", "Bob", 1.0, "Uptown"),
            new Auto("V003", "Charlie", 1.5, "Suburbs")
        };

        double distance = 10;
        
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: $" + v.calculateFare(distance));
            ((GPS) v).updateLocation("New Location");
            System.out.println("Updated Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("-------------------------------------");
        }
    }
}