package staticMethodInterfaces;

interface VehicleDashboard {

    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println("Battery percentage feature not supported for this vehicle.");
    }
}

class Car implements VehicleDashboard {

    @Override
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

// Bike class
class Bike implements VehicleDashboard {

    @Override
    public void displaySpeed() {
        System.out.println("Bike speed: 60 km/h");
    }
}

class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 90 km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery percentage: 75%");
    }
}

public class SmartVehicleDashboard {

    public static void main(String[] args) {

        VehicleDashboard car = new Car();
        VehicleDashboard bike = new Bike();
        VehicleDashboard electricCar = new ElectricCar();

        System.out.println("---- Car Dashboard ----");
        car.displaySpeed();
        car.displayBatteryPercentage();

        System.out.println("\n---- Bike Dashboard ----");
        bike.displaySpeed();
        bike.displayBatteryPercentage();

        System.out.println("\n---- Electric Car Dashboard ----");
        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}
