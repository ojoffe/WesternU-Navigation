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
 * @author orenj
 */
public class POITest {
    
    public POITest() {
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
    public void tearDown() {
    }

    /**
     * Test of setLayer method, of class POI.
     */
    @Test
    public void testSetLayer() {
        System.out.println("setLayer");
        Layer layer = null;
        POI instance = null;
        instance.setLayer(layer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordinate method, of class POI.
     */
    @Test
    public void testGetCoordinate() {
        System.out.println("getCoordinate");
        POI instance = new POI("Bathroom", 1, 1, "Bathroom1", new int[]{1,2}, 1);
        int[] expResult = {1,2};
        int[] result = instance.getCoordinate();
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of setCoordinate method, of class POI.
     */
    @Test
    public void testSetCoordinate() {
        System.out.println("setCoordinate");
        POI instance = new POI("Bathroom", 1, 1, "Bathroom1", new int[]{1,2}, 1);
        int[] expResult = {3,4}; // coordinates
        instance.setCoordinate(expResult);
        int[] result = instance.getCoordinate();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setName method, of class POI.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        POI instance = null;
        String expResult = "";
        String result = instance.setName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomNum method, of class POI.
     */
    @Test
    public void testSetRoomNum() {
        System.out.println("setRoomNum");
        int roomNum = 0;
        POI instance = null;
        instance.setRoomNum(roomNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class POI.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id = 0;
        POI instance = null;
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class POI.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        POI instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
