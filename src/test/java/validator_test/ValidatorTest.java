package validator_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import validator.Validator;

public class ValidatorTest {
    @Test
    @DisplayName("Email Validator Test")
    void testEmailValidator() {
        String validEmail = "marco@gmail.com";
        String invalidEmail = "marco12345";
        assertTrue(Validator.validateEmail(validEmail), "Mail is valid");
        assertFalse(Validator.validateEmail(invalidEmail), "Mail is not valid");

    }

}
