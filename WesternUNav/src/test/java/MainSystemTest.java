/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class MainSystemTest {
    
    public MainSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    /**
     * Test of addUser method, of class MainSystem.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String systemID = "";
        String password = "";
        MainSystem instance = new MainSystem();
        User expResult = null;
        User result = instance.addUser(systemID, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDeveloper method, of class MainSystem.
     */
    @Test
    public void testAddDeveloper() {
        System.out.println("addDeveloper");
        String systemID = "";
        String password = "";
        MainSystem instance = new MainSystem();
        Developer expResult = null;
        Developer result = instance.addDeveloper(systemID, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeather method, of class MainSystem.
     */
    @Test
    public void testGetWeather() {
        System.out.println("getWeather");
        MainSystem instance = new MainSystem();
        String expResult = "";
        //String result = instance.getWeather();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
