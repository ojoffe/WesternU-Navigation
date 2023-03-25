/**
 *
 * @author Aaron
 */
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public class User {
    private LinkedList<POI> favoritePOIs = new LinkedList<>();;  
    private String password;
    private String systemID;
    
    public User(String systemID, String password) {
        this.systemID = systemID;
        this.password = password;
        // create a JSONObject for the user data
        JSONObject userData = new JSONObject();
        userData.put("systemID", this.systemID);
        userData.put("password", this.password);

        // create a JSONArray for the users
        JSONArray users = new JSONArray();
        users.put(userData);

        // write the users to a JSON file
        try (FileWriter file = new FileWriter("dataFiles/UserData.json")) {
            file.write(users.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    
    public POI editFavPOI(POI poi) {  //FIXME: is this correct for editing
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

