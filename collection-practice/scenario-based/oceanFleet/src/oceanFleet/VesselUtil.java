package oceanFleet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VesselUtil {
	
	private List<Vessel> vesselList = new ArrayList<>();
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel vessel : vesselList) {
			if(vessel.vesselId.equals(vesselId)) {
				return vessel;
			}
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessel(){
		double maxSpeed = vesselList.stream().mapToDouble(Vessel::getAverageSpeed).max().orElse(0);
		List<Vessel> highPerformanceVessels = vesselList.stream().sorted(Comparator.comparingDouble(Vessel::getAverageSpeed).reversed())
		.filter(v -> v.averageSpeed==maxSpeed).collect(Collectors.toList());
		return highPerformanceVessels;
	}
	
}
