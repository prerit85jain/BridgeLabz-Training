package definingImplementingInterfaces;

interface Vehicle{
	void rent();
	void returnVehicle();
}

class Cars implements Vehicle{
	@Override
	public void rent() {
		System.out.println("Car has been rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Car has been returned");
	}
}
class Bikes implements Vehicle{
	@Override
	public void rent() {
		System.out.println("Bike has been rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bike has been returned");
	}
}
class Buses implements Vehicle{
	@Override
	public void rent() {
		System.out.println("Bus has been rented");
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bus has been returned");
	}
}

public class MultiVehicleRentalSystem {

	public static void main(String[] args) {
		Vehicle car = new Cars();
		Vehicle bike = new Bikes();
		Vehicle bus = new Buses();
		
		car.rent();
		bike.rent();
		
		car.returnVehicle();
		bus.rent();
		bus.returnVehicle();
		bike.returnVehicle();
	}

}
