/**
 *
 * @author orenj
 */
import java.util.LinkedList;

/**
 * Represents a map with multiple layers.
 */
public class Map {
    /** floorNum keeps track of the numbers of floors in a map. layers is a linkedlist containing the layers for each Map*/
    private int floorNum;
    private LinkedList<Layer> layers;
    
    /**
     * Creates a new Map object with the specified number of floors and layers
     * @param floorNum the numbers of floors in a map
     * @param layers a linkedlist of Layer objects that a map contains
     */
    public Map(int floorNum, LinkedList<Layer> layers) {
        this.floorNum = floorNum;
        this.layers = layers;
    }
    
    /**
     * Returns the number of floors in the map.
     * @return the number of floors in the map
     */
    public int getFloorNum() {
        return this.floorNum;
    }
    
    /**
     * Returns a list of Layer objects representing the layers in the map.
     * @return a list of Layer objects representing the layers in the map
     */
    public LinkedList<Layer> getLayers() {
        return this.layers;
    }
    
}
