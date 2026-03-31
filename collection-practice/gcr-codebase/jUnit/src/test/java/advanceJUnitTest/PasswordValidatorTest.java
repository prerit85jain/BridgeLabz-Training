package advanceJUnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongPass1"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(validator.isValid("Ab1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(validator.isValid("password123"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }

    @Test
    void testExactlyEightCharactersValid() {
        assertTrue(validator.isValid("Pass1234"));
    }
}