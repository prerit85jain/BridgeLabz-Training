public class PenDistribution {
    // Main Function
	public static void main(String[] args) {
        // Variable Declaration
		int pens = 14;
		int students = 3;
        
        // Calculate Pen Distribution
		int PenPerHead = pens/students;

        // Remaining Pens
		int remaining = pens%students;
		
		System.out.println("The Pen Per Student is "+PenPerHead+" and the remaining pen not distributed is "+remaining);
	}

}