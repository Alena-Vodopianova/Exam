package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    private EmailValidator emailValidator;

    @BeforeEach
    public void setup() {
        emailValidator = new EmailValidator();
    }

    @Test
    void gueltigeAdresse() {
        assertTrue(true, isValid.emailValidator("user@example.com"));
    }

    @Test
    void ungültigeAdresse() {
        assertFalse(false, isValid.emailValidator("userexample.org"));
    }
}
