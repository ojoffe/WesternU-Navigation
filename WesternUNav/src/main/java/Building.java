/**
 * This class represents a building object
 * @author orenj
 */
import java.util.LinkedList;

public class Building {
    /**  This string represents the name of the building*/
    private String name;
    /**  This is a list of maps in the building*/
    private LinkedList<Map> floorMaps;
    
    /**
     * This is the constructor for the building
     * @param name
     * @param floorMaps 
     */
    public Building(String name, LinkedList<Map> floorMaps) {
        this.name = name;
        this.floorMaps = floorMaps;
    }
    
    /**
     * This returns the name
     * @return name 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * This method returns the maps of the building
     * @return floorMaps
     */
    public LinkedList<Map> getMaps() {
        return this.floorMaps;
    }
}
