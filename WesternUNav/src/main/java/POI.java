/**
 *
 * @author Aaron
 */;

public class POI {
    private Layer layer;
    private boolean userDefined;
    private int id;
    private int roomNum;
    private String name;
    private float[] coordinate; // should always be length 2
    
    public POI(Layer layer, boolean userDefined, int id, int roomNum, String name, float[] coordinate) {
        this.layer = layer;
        this.userDefined = userDefined;
        this.id = id;
        this.roomNum = roomNum;
        this.name = name;
        this.coordinate = coordinate;  
    }
    
    public void setLayer(Layer layer) {
        this.layer = layer;
    }
    
    public void setCoordinate(float[] coordinate) {
        this.coordinate = coordinate;
    }
    
    public String setName(String name) {
        this.name = name;
        return name;
    }
    
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getDescription() {
        return "POI name: " + name + ", room number: " + roomNum + ", coordinate: " + coordinate;
    }
    
    public float[] getCoordinate() {
        return this.coordinate;
    }
 }

