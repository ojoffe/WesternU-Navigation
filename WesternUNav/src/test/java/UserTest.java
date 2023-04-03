import java.util.LinkedList;
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
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //System.out.println("setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        //System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        //System.out.println("setUp");
    }
    
    @After
    public void tearDown() {
        //System.out.println("tearDown");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User("username", "password");
        String expResult = "password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class User.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        User instance = new User("username", "password");
        String expResult = "username";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteFavPOI method, of class User.
     */
    @Test
    public void testDeleteFavPOI() {
        System.out.println("deleteFavPOI");
        POI poi = null;
        User instance = null;
        instance.deleteFavPOI(poi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editFavPOI method, of class User.
     */
    @Test
    public void testEditFavPOI() {
        System.out.println("editFavPOI");
        POI poi = null;
        User instance = null;
        POI expResult = null;
        POI result = instance.editFavPOI(poi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "newPass";
        User instance = new User("username", "password");
        instance.setPassword(password);
        String expResult = password;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID method, of class User.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String systemID = "newUsername";
        User instance = new User("username", "password");
        instance.setID(systemID);
        String expResult = systemID;
        String result = instance.getID();
        assertEquals(expResult, result);
    }
    
}
