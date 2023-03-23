/**
 *
 * @author Aaron
 */
import java.util.LinkedList;


public class Layer {
    private String description;
    private LinkedList<POI> POIs;


    public Layer(String description, LinkedList<POI> POIs) {
        this.description = description;
        this.POIs = POIs;
    }

    public String getDescription(){
            return description;
    }
    
    public LinkedList<POI> getPOIs() {
        return POIs;
    }
    
    public void addPOI(POI POI) {
        this.POIs.add(POI);
    }
    
    public void deletePOI(POI POI) {
        this.POIs.remove(POI);
    }
}