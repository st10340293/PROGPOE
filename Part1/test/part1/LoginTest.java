/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class LoginTest 
{
    Login login = new Login();
    public LoginTest() {
    }

    @Test
    public void testCheckUserName() {
    }

    @Test
    public void testCheckPasswordComplexity() {
    }

    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testGetLoginTest() {
        String expected = "Welcome " + Registration.firstName + "_" + Registration.lastName + " it is great to see you again.";
        String actual;
        actual = login.returnLoginStatus();
        
        assertEquals(expected,actual);
    }
    
}
