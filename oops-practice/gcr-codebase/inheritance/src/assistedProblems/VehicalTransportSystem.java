package assistedProblems;

public class VehicalTransportSystem {

	class Vehicle{
		int maxSpeed;
		String fuelType;
		
		public Vehicle(int maxSpeed, String fuelType) {
			this.maxSpeed = maxSpeed;
			this.fuelType = fuelType;
		}
		
		void displayInfo() {
			System.out.println("Details are: ");
			System.out.println("Max Speed - "+maxSpeed );
			System.out.println("Max Speed - "+fuelType );
		}
	}
	
	class Car extends Vehicle{
		int seatCapacity;
		
		public Car(int maxSpeed, String fuelType, int seatCapacity) {
			super(maxSpeed, fuelType);
			this.seatCapacity = seatCapacity;
		}
		
		void displayInfo() {
			super.displayInfo();
			System.out.println("Seat Capacity - "+seatCapacity);
		}
	}
	
	class Truck extends Vehicle{
		int loadCapacity;
		
		public Truck(int maxSpeed, String fuelType, int loadCapacity) {
			super(maxSpeed, fuelType);
			this.loadCapacity = loadCapacity;
		}
		
		void displayInfo() {
			super.displayInfo();
			System.out.println("Load Capacity - "+loadCapacity);
		}
	}
	
	class MotorCycle extends Vehicle{
		String hasSideCar;
		
		public MotorCycle(int maxSpeed, String fuelType, String hasSideCar) {
			super(maxSpeed, fuelType);
			this.hasSideCar = hasSideCar;
		}
		
		void displayInfo() {
			super.displayInfo();
			System.out.println("Side Car - "+hasSideCar);
		}
	}
	
	public static void main(String[] args) {
		VehicalTransportSystem vts = new VehicalTransportSystem();
		
		Car car1 = vts.new Car(80, "Petrol", 6);
		car1.displayInfo();
		

	}

}
