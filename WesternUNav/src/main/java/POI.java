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
        return "POI name: " + name + ", room number: " + roomNum + ", "
                + "coordinates: " + coordinate[0] + ", " + coordinate[1];
    }
    
    public int[] getCoordinate() {
        return this.coordinate;
    }
    
    public static void main(String[] args) {
        POI poi = new POI("Bathroom", 1, 1, "Bathroom1", new int[]{1,2}, 1);
        System.out.println(poi.getDescription());
    }
 }

