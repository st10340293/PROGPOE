
package part1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class RegistrationTest {
    
    Login login = new Login();
    
    public RegistrationTest() {
    }


    @Test
    public void testGetLogin() {
        String expected = "Welcome " + Registration.firstName + "_" + Registration.lastName + " it is great to see you again.";
        String actual= login.returnLoginStatus();
        
        assertEquals(expected,actual);
    }
    
}
