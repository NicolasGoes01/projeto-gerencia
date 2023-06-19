package dupradosantini.sostoolbackend.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TestAppUser {
    private AppUser appUser;

    @BeforeEach
    public void setUp() {
        appUser = new AppUser("John Doe", "johndoe@example.com", "password123");
    }

    @Test
    void testAppUserEmailValidation() {
        // Valid email
        Assertions.assertDoesNotThrow(() -> appUser.setEmail("johndoe@example.com"));
/*
        // Empty email
        assertThrows(Exception.class, () -> appUser.setEmail(""));

        // Email with more than 70 characters
        assertThrows(Exception.class, () -> appUser.setEmail("LoremipsumdolorsitametconsecteturadipiscingelitSedviverra@ex" +
                "ample.com"), "Email should throw an exception for more than 70 characters");

        // Invalid email format
        assertThrows(Exception.class, () -> appUser.setEmail("johndoexample.com"), "Email should throw an exception for invalid format");
*/
        // Email with valid length
        Assertions.assertDoesNotThrow(() -> appUser.setEmail("janedoe@example.com"));
    }
}
