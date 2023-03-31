/**
 *
 * @author Aaron
 */

public class POI {
    private String layer;
    private int roomNum;
    private String name;
    private int[] coordinate; // should always be length 2
    private int floor;
    private Boolean fav;
    private String building = "";
    
    /**
     * Normal constructor that is used
     * @param layer
     * @param roomNum
     * @param name
     * @param coordinate
     * @param floor
     * @param fav 
     */
    public POI(String layer, int roomNum, String name, int[] coordinate, int floor, Boolean fav) {
        this.layer = layer;
        this.roomNum = roomNum;
        this.name = name;
        this.coordinate = coordinate;
        this.floor = floor;
        this.fav = false;
    }
    
    /**
     * Constructor used when adding a POI
     * @param layer
     * @param roomNum
     * @param name
     * @param coordinate
     * @param floor
     * @param fav
     * @param building 
     */
    public POI(String layer, int roomNum, String name, int[] coordinate, int floor, Boolean fav, String building) {
        this.layer = layer;
        this.roomNum = roomNum;
        this.name = name;
        this.coordinate = coordinate;
        this.floor = floor;
        this.fav = false;
        this.building = building;
    }
    
    public void setLayer(String layer) {
        this.layer = layer;
    }
    
    public void setCoordinate(int[] coordinate) {
        this.coordinate = coordinate;
    }
    
    public int[] getCoordinate() {
        return this.coordinate;
    }
    
    public String setName(String name) {
        this.name = name;
        return name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    
    public int getRoomNum() {
        return this.roomNum;
    }
    
    public void setFloor(int floor) {
        this.floor = floor;
    }
    
    public String getDescription() {
        return "POI name: " + name + ", room number: " + roomNum + ", "
                + "coordinates: " + coordinate[0] + ", " + coordinate[1];
    }
    
    public void setFav(boolean bool) {
        this.fav = bool;
    }
    
    public boolean getFav() {
        return this.fav;
    }
    
    public String getLayer() {
        return this.layer;
    }
    
    public int getFloor() {
        return this.floor;
    }
    
    public String getBuilding() {
        return this.building;
    }
    
    
 }

