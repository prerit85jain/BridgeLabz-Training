package forEachMethod;

import java.util.Arrays;
import java.util.List;

public class IotSensorReading {

	public static void main(String[] args) {
		
		List<Double> sensorReading = Arrays.asList(
				25.5, 30.2, 18.9, 35.6, 40.1);
		double threshold = 30;
		
		sensorReading.stream().filter(reading -> reading > threshold)
		.forEach(reading -> System.out.println("Alert! Hight Reading "+reading));
	}

}
