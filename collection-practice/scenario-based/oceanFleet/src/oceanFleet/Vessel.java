package oceanFleet;

public class Vessel {
	String vesselId;
	String vesselName;
	double averageSpeed;
	String vesselType;
	
	public Vessel() {}

	public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesselType = vesselType;
	}

	public String getVesselId() {return vesselId;}
	public void setVesselId(String vesselId) {this.vesselId = vesselId;}

	public String getVesselName() {return vesselName;}
	public void setVesselName(String vesselName) {this.vesselName = vesselName;}

	public double getAverageSpeed() {return averageSpeed;}
	public void setAverageSpeed(double averageSpeed) {this.averageSpeed = averageSpeed;}

	public String getVesselType() {return vesselType;}
	public void setVesselType(String vesselType) {this.vesselType = vesselType;};
	
	@Override
	public String toString() {
		return vesselId+" | "+vesselName+" | "+vesselType+" | "+averageSpeed+" knots";
	}
}
