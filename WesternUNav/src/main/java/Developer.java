/**
 *
 * @author orenj
 */
public class Developer extends User {
    
    public Developer(String systemID, String password) {
        super(systemID, password);
    }
    
    public POI addPOI(String layer, int id, int roomNum, String name, int[] coordinate) {
        POI newPOI = new POI(layer, roomNum, name, coordinate, 1, false);
        // ENTER INTO MAIN POI JSON HERE
        return newPOI;
    }
    
    // editPOI
    public void editPOI(POI poi) {
        
    }
    
    // deletePOI
    public void deletePOI(POI poi) {
        
    }
        
}
