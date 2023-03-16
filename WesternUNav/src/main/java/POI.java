/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    private int[] coordinate;
    
    public POI(Layer layer, boolean userDefined, int id, int roomNum, String name, int[] coordinate) {
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
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getDescription() {
        return "POI name: " + name + ", room number: " + roomNum + ", coordinate: " + coordinate;
    }
}

