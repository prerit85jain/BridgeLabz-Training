import java.util.*;
public class KmtoMilesConvertor {
    public static void main(String[] args){
        // Variable Declaration
        double kilometers = 10.8;

        // Convert to miles
        double miles = kilometers / 1.6;
        System.out.println("The distance "+ kilometers + " km in miles is " + miles);

        // Call function to convert using scanner
        convertkmtoMiles();
    }

    // Function to convert kilometers to miles using scanner
    public static void convertkmtoMiles(){
        Scanner scanner = new Scanner(System.in);
        
        // Input kilometers
        double kilometers = scanner.nextDouble();
        double miles = kilometers / 1.6;
        System.out.println("The total miles is "+ miles + " miles for the given " + kilometers + " km");
        scanner.close();
    }
}