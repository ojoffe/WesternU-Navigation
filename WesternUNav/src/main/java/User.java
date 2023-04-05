/**
 *
 * @author Aaron
 */
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Represents a user with favorite points of interest and associated login credentials. 
 * Favorite POIs is a linkedlist containing users favourite pois
 * password stores a users password
 * systemID stores a users systemID
 */
public class User {
    private LinkedList<POI> favoritePOIs = new LinkedList<>();  
    private String password;
    private String systemID;
    
    /**
     * Creates a new User object with the specified system ID and password.
     * @param systemID the system ID for the user
     * @param password the password for the user
     */
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
    
    /**
     * Returns the password for the user.
     * @return the password for the user
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Returns the system ID for the user.
     * @return the system ID for the user
     */
    public String getID() {
        return systemID;
    }
    
     /**
     * Deletes a point of interest from the user's favorites.
     * @param poi the point of interest to delete
     */
    public void deleteFavPOI(POI poi) {
        favoritePOIs.remove(poi);
    }
    
    /**
    * Edits a point of interest in the user's favorites.
    * @param poi the point of interest to edit
    * @return the edited point of interest if found, or null if not found
    */
    public POI editFavPOI(POI poi) {  //FIXME: is this correct for editing
        int index = favoritePOIs.indexOf(poi);
        if (index >= 0) {
            favoritePOIs.set(index, poi);
            return poi;
        } else {
            return null;
        }
    }
    
    /**
     * Adds a point of interest to the user's favorites.
     * @param poi the point of interest to add
     * @return the added point of interest
     */
    public POI addFavPOI(POI poi) {
        favoritePOIs.add(poi);
        return poi;
    }
    
    /**
     * Sets the password for the user.
     * @param password the new password for the user
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Sets the system ID for the user.
     * @param systemID the new system ID for the user
     */
    public void setID(String systemID) {
        this.systemID = systemID;
    }
    
    /**
     * Returns a linked list of the user's favorite points of interest.
     * @return a linked list of the user's favorite points of interest
     */
    public LinkedList<POI> getFavPOIs() {
        return favoritePOIs;
    }
}

