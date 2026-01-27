package functionalInterfaces;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

	public static void main(String[] args) {
		double thershold = 45;
		
		Predicate<Double> isHightTemp = temp -> temp > thershold;
		
		double currentTemp = 45.5;
		
		if(isHightTemp.test(currentTemp)) {
			System.out.println("Alert Temperature is High");
		}else {
			System.out.println("Temperature is Normal");
		}

	}

}
