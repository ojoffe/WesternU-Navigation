/**
 *
 * @author orenj
 */
public class Developer extends User {
    
    public Developer(String systemID, String password) {
        super(systemID, password);
    }
    
    public POI addPOI(Layer layer, int id, int roomNum, String name, float[] coordinate) {
        POI newPOI = new POI(layer, false, id, roomNum, name, coordinate);
        // ENTER INTO MAIN POI JSON HERE
        return newPOI;
    }
    
    // editPOI
    public POI editPOI(POI) {
        
    }
    
    // deletePOI
    public void deletePOI(POI POI) {
        
    }
        
}
