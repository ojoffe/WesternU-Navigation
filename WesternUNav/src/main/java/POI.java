/**
 *
 * @author Aaron
 */;

public class POI {
    private String layer;
    private int roomNum;
    private String name;
    private int[] coordinate; // should always be length 2
    private int floor;
    
    public POI(String layer, int id, int roomNum, String name, int[] coordinate, int floor) {
        this.layer = layer;
        this.roomNum = roomNum;
        this.name = name;
        this.coordinate = coordinate;
        this.floor = floor;
    }
    
    public void setLayer(String layer) {
        this.layer = layer;
    }
    
    public void setCoordinate(int[] coordinate) {
        this.coordinate = coordinate;
    }
    
    public String setName(String name) {
        this.name = name;
        return name;
    }
    
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    
    
    public String getDescription() {
        return "POI name: " + name + ", room number: " + roomNum + ", coordinate: " + coordinate;
    }
    
    public int[] getCoordinate() {
        return this.coordinate;
    }
 }

