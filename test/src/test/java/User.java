/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aaron
 */
import java.util.LinkedList;

public class User {
    private LinkedList<POI> favoritePOIs;
    private String password;
    private String systemID;
    
    public User(LinkedList<POI> favoritePOIs, String password, String systemID) {
        this.favoritePOIs = favoritePOIs;
        this.password = password;
        this.systemID = systemID;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getID() {
        return systemID;
    }
    
    public void deleteFavPOI(POI poi) {
        favoritePOIs.remove(poi);
    }
    
    public POI editFavPOI(POI poi) {
        int index = favoritePOIs.indexOf(poi);
        if (index == -1) {
            return null;
        } else {
            favoritePOIs.set(index, poi);
            return poi;
        }
    }
    
    public POI addFavPOI(POI poi) {
        favoritePOIs.add(poi);
        return poi;
    }
    
    public void setPassword(String newPassword) {
        password = newPassword;
    }
    
    public void setID(String newID) {
        systemID = newID;
    }
    
    public LinkedList<POI> getPOIs() {
        return favoritePOIs;
    }
}

