package advanceJUnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateConversion() {
        assertEquals("13-01-2026", formatter.formatDate("2026-01-13"));
        assertEquals("25-12-2025", formatter.formatDate("2025-12-25"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("13/01/2026");
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }

    @Test
    void testEmptyDateThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("");
        });
    }

    @Test
    void testNullDateThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}