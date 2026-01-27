package definingImplementingInterfaces;

interface Control{
	void turnOn();
	void turnOff();
}

class Light implements Control{

	@Override
	public void turnOn() {
		System.out.println("Lights turn on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Lights turn off.");
	}
	
}

class AC implements Control{
	@Override
	public void turnOn() {
		System.out.println("AC turn on.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("AC turn off.");
	}
}

public class SmartDeviceControl {

	public static void main(String[] args) {
		Control light = new Light();
		AC ac = new AC();
		
		light.turnOn();
		light.turnOff();
		
		ac.turnOn();
		ac.turnOff();
	}

}
