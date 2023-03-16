/**
 *
 * @author orenj
 */

import java.util.LinkedList;

public class System {
    private int developerKey = 1;
    private LinkedList<User> users;

    public System() {
        this.users = new LinkedList<>();
    }

    public User addUser(String systemID, String password) {
        User newUser = new User(systemID, password);
        this.users.add(newUser);
        return newUser;
    }

    /**
     * Searches for existing user in the system.
     * @param systemID
     * @param password
     * @return User object if user exists, null if user doesn't exist
     */
    private User getUser(String systemID, String password) {
        boolean found = false;
        User targetUser = new User();
        
        for (User user : this.users) {
            if (user.getID().equals(systemID) && user.getPassword() == password) {
                targetUser = user;
                found = true;
                break;
            }
        }
        
        if (found) {
            return targetUser;
        } else {
            return null;
        }
    }

    public String getWeather() {
        // TODO: Implement weather API logic here
        return "Sunny";
    }
}
