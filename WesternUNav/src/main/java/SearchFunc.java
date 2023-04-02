
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stephenkinsey
 */
public class SearchFunc {
    private String searchText;
    private String fName;
    private int buildIndex;
    private JLabel map;
    private JTextField searchField;
    private JFrame frame;
    
    public SearchFunc(String searchText, String fName, int buildIndex, JLabel map, JTextField searchField, JFrame frame) {
        this.searchText = searchText;
        this.fName = fName;
        this.buildIndex = buildIndex;
        this.map = map;
        this.searchField = searchField;
        this.frame = frame;
        SearchPerformed(searchText, fName, buildIndex, map, searchField, frame);
    }
    
    private void SearchPerformed(String searchText, String fName, int buildIndex, JLabel map, JTextField searchField, JFrame frame) {
        try (FileReader reader = new FileReader("dataFiles/POI.json")) {
        // Parse the JSON
            JSONObject json = new JSONObject(new JSONTokener(reader));
            JSONArray buildings = json.getJSONArray("buildings");
            JSONObject currBuilding = buildings.getJSONObject(buildIndex);
            boolean found = false;
            JSONArray pointsOfInterest = currBuilding.getJSONArray("points_of_interest");

            // Loop through the points of interest to find button
            for (int i = 0; i < pointsOfInterest.length(); i++) {
                JSONObject poiJson = pointsOfInterest.getJSONObject(i);
                String info = poiJson.getString("name");
                info = info.toLowerCase();
                if (info.equals(searchText)){
                    found = true;
                    int floor = poiJson.getInt("floor");
                    if (buildIndex == 0) {
                        if (floor == 1) {
                            frame.dispose();
                            Middlesex1 newF = new Middlesex1();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 2) {
                            frame.dispose();
                            Middlesex2 newF = new Middlesex2();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 3) {
                            frame.dispose();
                            Middlesex2 newF = new Middlesex2();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 4) {
                            frame.dispose();
                            Middlesex4 newF = new Middlesex4();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 5) {
                            frame.dispose();
                            Middlesex5 newF = new Middlesex5();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                    } else if (buildIndex == 1) {
                        if (floor == 1) {
                            frame.dispose();
                            UC1 newF = new UC1();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 2) {
                            frame.dispose();
                            UC2 newF = new UC2();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 3) {
                            frame.dispose();
                            UC3 newF = new UC3();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 4) {
                            frame.dispose();
                            UC4 newF = new UC4();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                    } else if (buildIndex == 2) {
                        if (floor == 1) {
                            frame.dispose();
                            Talbot1 newF = new Talbot1();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 2) {
                            frame.dispose();
                            Talbot2 newF = new Talbot2();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 3) {
                            frame.dispose();
                            Talbot3 newF = new Talbot3();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                        if (floor == 4) {
                            frame.dispose();
                            Talbot4 newF = new Talbot4();
                            JLabel map1 = newF.getMapLabel();
                            newF.setVisible(true);
                            light(map1, poiJson);
                        }
                    }
                    
                }
            }
            if (!found){
                JOptionPane.showMessageDialog(null, "POI does not exist, check your spelling and try again", "Error", JOptionPane.ERROR_MESSAGE);
            }
            searchField.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    private void light(JLabel map1, JSONObject poiJson) {
        int x = poiJson.getJSONObject("coordinates").getInt("latitude") - 7;
        int y = poiJson.getJSONObject("coordinates").getInt("longitude") - 7;
        int roomNum = poiJson.getInt("room_number");
        String name = poiJson.getString("name");
        int[] coord = new int[2];
        coord[0] = x;
        coord[1] = y;
        int width = 30;
        int height = 30;
        POI poi = new POI(name,coord, roomNum);
        Highlighter highlight = new Highlighter(x, y, width, height);
        map1.remove(highlight);
        map1.add(highlight); // Add the highlight component to your JFrame
        map1.repaint();
        JOptionPane.showMessageDialog(null, poi.getDescription(), "POI Description", JOptionPane.INFORMATION_MESSAGE);
        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // Remove the component from the map
                map1.remove(highlight);
                map1.revalidate();
                map1.repaint();
            }
        });
        timer.setRepeats(false); // set the timer to execute only once
        timer.start(); // start the timer
    }
}
