package factoryRobotHazardAnalyzer;

public class RobotHazardAuditor {
	
	public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineState) throws RobotSafetyException {
		
		double machineStateValue = 0;
		if(armPrecision<0 || armPrecision>1) {throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");}
		if(workerDensity<1 || workerDensity>20) {throw new RobotSafetyException("Error: Worker density must be 1-20");}
		
		switch(machineState) {
			case "Worn" : machineStateValue=1.3; break;
			case "Faulty" : machineStateValue=2; break;
			case "Critical" : machineStateValue=3; break;
			default : throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		
	return ((1-armPrecision)*15)+(workerDensity*machineStateValue);
	}
}