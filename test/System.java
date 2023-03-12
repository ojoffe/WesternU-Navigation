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

    public User getUser(int index) {
        return this.users.get(index);
    }

    public String getWeather() {
        // TODO: Implement weather API logic here
        return "Sunny";
    }
}

