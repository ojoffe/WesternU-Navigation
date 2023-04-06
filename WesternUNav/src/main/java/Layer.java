/**
 * This class represents a layer in our map
 * @author Aaron Pogrin
 */
import java.util.LinkedList;

/**
 * this class denotes a layer object
 * @author louie
 */
public class Layer {
    /** This String represents the layer's description*/
    private String description;
    /** This linked list represents the list of POIs*/
    private LinkedList<POI> POIs;

    /**
     * This is the constructor for the layer
     * @param description This represents the description of the layer
     * @param POIs This represents the POIs in this layer
     */
    public Layer(String description, LinkedList<POI> POIs) {
        this.description = description;
        this.POIs = POIs;
    }
    
    /**
     * this method gets the description
     * @return the attribute description for this layer
     */
    public String getDescription(){
            return description;
    }
    
    /**
     * This method returns the POIs
     * @return the linked list of POIs in this layer
     */
    public LinkedList<POI> getPOIs() {
        return POIs;
    }
    
    /** 
     * This method adds a poi 
     * @param POI a poi that is desired to be added to this layer
     */
    public void addPOI(POI POI) {
        this.POIs.add(POI);
    }
    
    /**
     * This method deletes a poi
     * @param POI a poi that is desired to be deleted
     */
    public void deletePOI(POI POI) {
        this.POIs.remove(POI);
    }
}