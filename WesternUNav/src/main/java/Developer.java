/**
 * This class represents a developer who is an extension of a user with more capabilities
 * @author orenj
 */
public class Developer extends User {
    
    /**
     * This is the constructor for the developer which calls the user as a super
     * @param systemID
     * @param password 
     */
    public Developer(String systemID, String password) {
        super(systemID, password);
    }
    
    /**
     * This method adds a poi as a developer 
     * @param layer
     * @param id
     * @param roomNum
     * @param name
     * @param coordinate
     * @return 
     */
    public POI addPOI(String layer, int id, int roomNum, String name, int[] coordinate) {
        POI newPOI = new POI(layer, roomNum, name, coordinate, 1, false);
        return newPOI;
    }
    
}
