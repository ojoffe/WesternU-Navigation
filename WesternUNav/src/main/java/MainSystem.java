/**
 *
 * @author orenj
 */

import java.util.LinkedList;

public class MainSystem {
    private int developerKey = 1;
    private LinkedList<User> users;
    private LinkedList<Developer> devs;

    public MainSystem() {
        this.users = new LinkedList<>();
        this.devs = new LinkedList<>();
    }

    /**
     * Adds user to the System.
     * @param systemID
     * @param password
     * @return 
     */
    public User addUser(String systemID, String password) {
        User newUser = new User(systemID, password);
        this.users.add(newUser);
        return newUser;
    }
    
    public Developer addDeveloper(String systemID, String password) {
        Developer newDev = new Developer(systemID, password);
        this.devs.add(newDev);
        return newDev;
    }

    /**
     * Searches for existing user in the system.
     * @param systemID
     * @param password
     * @return User object if user exists, null if user doesn't exist
     */
    private User getUser(String systemID, String password) {
        // Check all users
        for (User user : this.users) {
            if (user.getID().equals(systemID) && user.getPassword().equals(password)) {
                //targetUser = user;
                return user;
            }
        }
        
        // Check all developers
        for (Developer dev : this.devs) {
            if (dev.getID().equals(systemID) && dev.getPassword().equals(password)) {
                //targetUser = dev;
                return dev;
            }
        }
        
        // Return null if it hasn't been found
        return null;
    }

    public String getWeather() {
        try {
            String weatherData = WeatherAPI.getWeatherData("London, Ontario");
            System.out.println(weatherData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
