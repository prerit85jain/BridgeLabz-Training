public class EarthVolume {
    // Main Function
	public static void main(String[] args) {
		double radius = 6378; // Radius of Earth in kilometers
        
        // Calculate Volume of Earth
		double volume =  (4/3)*3.14*Math.pow(radius, 2);
		
		System.out.println("The volume of earth in cubic kilometers is "+volume+" and cubic miles is "+(volume*1.6));
	}

}