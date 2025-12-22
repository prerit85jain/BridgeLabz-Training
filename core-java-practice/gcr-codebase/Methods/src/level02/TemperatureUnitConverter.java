package level02;
public class TemperatureUnitConverter {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double farhenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return farhenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9.0 / 5.0) + 32;
        return celsius2farhenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("100 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("150 pounds to kilograms: " + convertPoundsToKilograms(150));
        System.out.println("70 kilograms to pounds: " + convertKilogramsToPounds(70));
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10));
        System.out.println("5 liters to gallons: " + convertLitersToGallons(5));
    }
}