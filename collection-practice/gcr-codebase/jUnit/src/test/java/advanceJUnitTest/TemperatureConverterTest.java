package advanceJUnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0));
        assertEquals(212.0, converter.celsiusToFahrenheit(100));
        assertEquals(98.6, converter.celsiusToFahrenheit(37));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32));
        assertEquals(100.0, converter.fahrenheitToCelsius(212));
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6));
    }

    @Test
    void testRoundTripConversion() {
        double celsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        double backToCelsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals(celsius, backToCelsius);
    }
}