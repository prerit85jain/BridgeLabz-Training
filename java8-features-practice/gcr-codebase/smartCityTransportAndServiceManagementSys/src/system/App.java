package system;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import interfaces.*;
import transportService.*;

public class App {
	public static void main(String[] args) {
		List<TransportService> services = Arrays.asList(
				new BusService("Mathura-Kosi", 30, LocalTime.of(9, 30)),
				new MetroService("Sec05-Sec13", 135, LocalTime.of(5, 13)),
				new TexiService("Gate1-Gate3", 15, LocalTime.of(9, 0)),
				new AmbulanceService("GLA-KD Hospital", 0, LocalTime.of(8, 0))
				);
		
		services.forEach(TransportService::printServiceDetails);
		
		System.out.println("\n Filter by Lowest Fare & Earliest Time\n");
		
		services.stream().filter(s->s.getFare()<=50).sorted(Comparator.comparing(TransportService::getDepartureTime))
		.forEach(TransportService::printServiceDetails);
		
		FareCalculator calculator = distance -> distance*10;
		double distance = GeoUtils.calculateDistance(0, 0, 3, 5);
		System.out.println("\nCalculated Fare: " + calculator.calculateFare(distance));
		
		List<Passenger> passengers = Arrays.asList(
				new Passenger("Prerit", "Mathura-Kosi", 30, true),
				new Passenger("Prem", "Mathura-Kosi", 30, false),
				new Passenger("Raj", "Sec05-Sec13", 50, true),
				new Passenger("Amit", "Gate1-Gate3", 120, true),
				new Passenger("Simran", "GLA-KD", 50, false)
				);
		
		System.out.println("\n    Group Passengers by Route    ");
		Map<String, List<Passenger>> groupRoute = passengers.stream()
				.collect(Collectors.groupingBy(p->p.route));
		groupRoute.forEach((k, v) -> System.out.println(k+ " ->  " + v.size()));
		
		System.out.println("\n       Peak vs Non-Peak Trips       ");
		Map<Boolean ,List<Passenger>> peakPartition = passengers.stream().collect(Collectors.partitioningBy(p->p.peakTime));
		System.out.println("Peak Trips: " + peakPartition.get(true).size());
		System.out.println("Non-Peak Trips: " + peakPartition.get(false).size());
		
		DoubleSummaryStatistics stats = passengers.stream().collect(Collectors.summarizingDouble(p->p.fare));
		
		System.out.println("\n       Revenue Summary       ");
		System.out.println("Total Revenue: " + stats.getSum());
		System.out.println("Average Fare: " + stats.getAverage());
		
		System.out.println("\n   Emergency Services Priority     ");
		services.forEach(service -> {
			if(service instanceof EmergencyService) {
				System.out.println(service.getServiceName() + " get High Priority");
			}
		});
		
		System.out.println("Completed");
		
	}
}
