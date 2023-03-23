/**
 *
 * @author orenj
 */
import java.util.LinkedList;

public class Map {
    private int floorNum;
    private LinkedList<Layer> layers;
    
    public Map(int floorNum, LinkedList<Layer> layers) {
        this.floorNum = floorNum;
        this.layers = layers;
    }
    
    public int getFloorNum() {
        return this.floorNum;
    }
    
    public LinkedList<Layer> getLayers() {
        return this.layers;
    }
    
}
