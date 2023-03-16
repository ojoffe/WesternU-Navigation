
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aaron
 */
public class Layer {
    private String description;
    private LinkedList<POI> POIs;


    public Layer( String description, LinkedList<POI> POIs) {
        this.description = description;
        this.POIs = POIs;
    }

    public String getDescription(){
            return description;
        }
}