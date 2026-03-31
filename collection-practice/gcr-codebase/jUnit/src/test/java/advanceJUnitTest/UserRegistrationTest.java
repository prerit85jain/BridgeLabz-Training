package advanceJUnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> 
            registration.registerUser("Prerit", "prerit@example.com", "StrongPass1")
        );
    }

    @Test
    void testEmptyUsernameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("", "user@example.com", "Password123")
        );
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmailThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("Prerit", "invalid-email", "Password123")
        );
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPasswordThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("Prerit", "user@example.com", "short")
        );
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }

    @Test
    void testNullValuesThrowException() {
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser(null, "user@example.com", "Password123")
        );
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("Prerit", null, "Password123")
        );
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("Prerit", "user@example.com", null)
        );
    }
}