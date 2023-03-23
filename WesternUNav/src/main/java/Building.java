/**
 *
 * @author orenj
 */
import java.util.LinkedList;

public class Building {
    private String name;
    private LinkedList<Map> floorMaps;
    
    public Building(String name, LinkedList<Map> floorMaps) {
        this.name = name;
        this.floorMaps = floorMaps;
    }
    
    public String getName() {
        return this.name;
    }
    
    public LinkedList<Map> getMaps() {
        return this.floorMaps;
    }
}
