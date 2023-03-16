/**
 *
 * @author Aaron
 */
import java.util.LinkedList;

public class User {
    private LinkedList<POI> favoritePOIs;
    private String password;
    private String systemID;
    
    public User() {
        favoritePOIs = new LinkedList<>();
        password = "";
        systemID = "";
    }
    
    public User(String systemID, String password) {
        this.systemID = systemID;
        this.password = password;
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
        if (index >= 0) {
            favoritePOIs.set(index, poi);
            return poi;
        } else {
            return null;
        }
    }
    
    public POI addFavPOI(POI poi) {
        favoritePOIs.add(poi);
        return poi;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setID(String systemID) {
        this.systemID = systemID;
    }
    
    public LinkedList<POI> getPOIs() {
        return favoritePOIs;
    }
}

