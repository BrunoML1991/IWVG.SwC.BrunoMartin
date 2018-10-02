package IWVG.SwC.BrunoMartin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Bruno", "Martin");
    }

    @Test
    void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("Bruno", user.getName());
        assertEquals("Martin", user.getFamilyName());
    }

    @Test
    void testFormat() {
        user = new User(1, "bruno", "martin");
        this.testUser();
    }

    @Test
    void testFullName() {
        assertEquals("Bruno Martin", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("B.", user.initials());
    }

}
