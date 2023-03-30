/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.io.FileReader;
import org.json.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author louie
 */
//Components
public class Middlesex1 extends javax.swing.JFrame {
        //private String selectedFloor;

    /**
     * Creates new form Middlesex1
     */
    //Componentss
    //extra
    //Beginning
    public Middlesex1() {
        initComponents();
        this.createButtonsFromJSON("dataFiles/POI.json");
    }
    
     public void createButtonsFromJSON(String jsonFilePath) {
         //hi
        // Read in the JSON file
        try (FileReader reader = new FileReader(jsonFilePath)) {
        // Parse the JSON
            JSONObject json = new JSONObject(new JSONTokener(reader));
            JSONArray buildings = json.getJSONArray("buildings");
            JSONObject middlesex = buildings.getJSONObject(0);

            JSONArray pointsOfInterest = middlesex.getJSONArray("points_of_interest");

            // Loop through the points of interest and create a button for each one
            for (int i = 0; i < pointsOfInterest.length(); i++) {
                JSONObject poiJson = pointsOfInterest.getJSONObject(i);
                int floor = poiJson.getInt("floor");
                if (floor == 1) {
                    // Create a POI object for the point of interest
                    String layer = poiJson.getString("layer");
                    //int id = poiJson.getInt("id");
                    int roomNum = poiJson.getInt("room_number");
                    String name = poiJson.getString("name");
                    int[] coordinate = new int[2];
                    int fav = poiJson.getInt("favourite");
                    Boolean bool = false;
                    if (fav == 1){
                        bool = true;
                    }
                    coordinate[0] = poiJson.getJSONObject("coordinates").getInt("latitude");
                    coordinate[1] = poiJson.getJSONObject("coordinates").getInt("longitude");
                    POI poi = new POI(layer, 1, roomNum, name, coordinate, floor, bool);

                        // Create a button for the POI using its coordinates
                    JButton button = new JButton(name);
                    if (layer.equals("Navigation")) {
                        button.setBackground(new java.awt.Color(0, 0, 0));
                    } else if (layer.equals("Food")){
                        button.setBackground(new java.awt.Color(0, 255, 0));
                    } else if (layer.equals("Bashroom")){
                        button.setBackground(new java.awt.Color(0, 255, 255));
                    } else if (layer.equals("Classroom")){
                        button.setBackground(new java.awt.Color(0, 0, 255));
                    } else if (layer.equals("Lab")){
                        button.setBackground(new java.awt.Color(255, 0, 0));
                    } else {
                        button.setBackground(new java.awt.Color(128, 128, 128));
                    }
                    //button.setBackground(new java.awt.Color(255, 0, 0));
                    button.setText("");
                    int x = poi.getCoordinate()[0];
                    int y = poi.getCoordinate()[1];
                    button.setBounds(x, y, 15, 15); // Set the button position and size
                    if (bool == false) {
                        button.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0,0,0), 2));
                    } else {
                        button.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,215,0), 2));
                    }
                    // Add ActionListener to the button
                    button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Object[] options = {"Set Favourite", "Unfavourite", "Close"}; // additional options
                            int result = JOptionPane.showOptionDialog(null, poi.getDescription(), "POI Description", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                            if (result == 0) {
                                POI selectedPOI = poi;
                                selectedPOI.setFav(true);
                                button.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,215,0), 2));
                                poiJson.put("favourite", 1);
                                try {
                                    FileWriter fileWriter = new FileWriter("dataFiles/POI.json");
                                    fileWriter.write(json.toString());
                                    fileWriter.flush();
                                    fileWriter.close();
                                } catch (IOException ex) {
                                    ex.printStackTrace();
                                }
                            } else if (result == 1) {
                                POI selectedPOI = poi;
                                selectedPOI.setFav(false);
                                button.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0,0,0), 2));
                                poiJson.put("favourite", 0);
                            } else if (result == 2) {
                                return;
                            }
                        }
                    });

                    map.add(button); // Add the button to the map
                    //System.out.println(poi.getDescription());
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderBG = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        OtherBG1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SelectFloorBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        buildingSelectionButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        mapScrollPane = new javax.swing.JScrollPane();
        floorMap = new javax.swing.JLayeredPane();
        map = new javax.swing.JLabel();
        poiLegendScrollPane = new javax.swing.JScrollPane();
        floorMap1 = new javax.swing.JLayeredPane();
        classroom = new javax.swing.JCheckBox();
        food = new javax.swing.JCheckBox();
        bath = new javax.swing.JCheckBox();
        labs = new javax.swing.JCheckBox();
        nav = new javax.swing.JCheckBox();
        other = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        addPOI = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        poiLegendScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderBG.setBackground(new java.awt.Color(153, 0, 255));

        HeaderTitle.setBackground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setText("WesternU Building Navigation System");

        OtherBG1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Middlesex College Floor 1");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Change Floor");

        SelectFloorBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        SelectFloorBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4", "Floor 5" }));
        SelectFloorBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFloorBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        buildingSelectionButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        buildingSelectionButton.setText("Building Selection");
        buildingSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingSelectionButtonActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        floorMap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        map.setIcon(new javax.swing.ImageIcon("images/Middlesex1.png"));
        map.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapMouseClicked(evt);
            }
        });

        floorMap.setLayer(map, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout floorMapLayout = new javax.swing.GroupLayout(floorMap);
        floorMap.setLayout(floorMapLayout);
        floorMapLayout.setHorizontalGroup(
            floorMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floorMapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(map)
                .addContainerGap(696, Short.MAX_VALUE))
        );
        floorMapLayout.setVerticalGroup(
            floorMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floorMapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(map)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        mapScrollPane.setViewportView(floorMap);

        floorMap1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        classroom.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        classroom.setText("Classrooms");

        food.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        food.setText("Food");
        food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodActionPerformed(evt);
            }
        });

        bath.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        bath.setText("Bathrooms");
        bath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathActionPerformed(evt);
            }
        });

        labs.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        labs.setText("Labs");

        nav.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nav.setText("Navigation");

        other.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        other.setText("Other");

        floorMap1.setLayer(classroom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        floorMap1.setLayer(food, javax.swing.JLayeredPane.DEFAULT_LAYER);
        floorMap1.setLayer(bath, javax.swing.JLayeredPane.DEFAULT_LAYER);
        floorMap1.setLayer(labs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        floorMap1.setLayer(nav, javax.swing.JLayeredPane.DEFAULT_LAYER);
        floorMap1.setLayer(other, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout floorMap1Layout = new javax.swing.GroupLayout(floorMap1);
        floorMap1.setLayout(floorMap1Layout);
        floorMap1Layout.setHorizontalGroup(
            floorMap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floorMap1Layout.createSequentialGroup()
                .addGroup(floorMap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bath, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labs, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classroom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 301, Short.MAX_VALUE))
        );
        floorMap1Layout.setVerticalGroup(
            floorMap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floorMap1Layout.createSequentialGroup()
                .addComponent(bath, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classroom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        poiLegendScrollPane.setViewportView(floorMap1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Layer Legend");
        jLabel3.setOpaque(true);

        addPOI.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        addPOI.setText("ADD POI");
        addPOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPOIActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Select Layers:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setOpaque(true);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Navigation");
        jLabel1.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 255, 0));
        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Food");
        jLabel8.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Labs");
        jLabel11.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 0, 255));
        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Classrooms");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Bathrooms");
        jLabel10.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(128, 128, 128));
        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setText("Other");
        jLabel13.setOpaque(true);

        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(53, 53, 53))
        );

        poiLegendScrollPane1.setViewportView(jLayeredPane2);

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jButton2.setText("SUBMIT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mapScrollPane))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addPOI))
                                    .addComponent(poiLegendScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(poiLegendScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buildingSelectionButton)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(SelectFloorBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(goButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPOI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poiLegendScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poiLegendScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(mapScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buildingSelectionButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SelectFloorBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goButton))
                        .addContainerGap())))
        );

        helpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        logOutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 204));
        jButton1.setText("Exit Program");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 204), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OtherBG1Layout = new javax.swing.GroupLayout(OtherBG1);
        OtherBG1.setLayout(OtherBG1Layout);
        OtherBG1Layout.setHorizontalGroup(
            OtherBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherBG1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OtherBG1Layout.setVerticalGroup(
            OtherBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OtherBG1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OtherBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutButton)
                    .addComponent(helpButton)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout HeaderBGLayout = new javax.swing.GroupLayout(HeaderBG);
        HeaderBG.setLayout(HeaderBGLayout);
        HeaderBGLayout.setHorizontalGroup(
            HeaderBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderBGLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(HeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(OtherBG1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HeaderBGLayout.setVerticalGroup(
            HeaderBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderBGLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(HeaderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OtherBG1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectFloorBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectFloorBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SelectFloorBox1ActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        new HelpFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_helpButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        new CreateAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void buildingSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingSelectionButtonActionPerformed
        new welcomeScreenFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buildingSelectionButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        if (SelectFloorBox1.getSelectedItem().toString().equals("Floor 2")) {
            new Middlesex2().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_goButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void addPOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPOIActionPerformed

        JPanel panel = new JPanel(new GridLayout(0, 1));


        JTextField nameField = new JTextField();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        
        JTextField floorField = new JTextField();
        panel.add(new JLabel("Floor:"));
        panel.add(floorField);

        JTextField roomNumField = new JTextField();
        panel.add(new JLabel("Room Number:"));
        panel.add(roomNumField);
        

        String[] layerOptions = {"Navigation", "Food", "Bathroom", "Classroom", "Lab", "Other"};
        JComboBox<String> layerComboBox = new JComboBox<>(layerOptions);
        panel.add(new JLabel("Layer:"));
        panel.add(layerComboBox);

        // Show the input dialog to the user
        int result = JOptionPane.showConfirmDialog(null, panel, "Add POI", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Process the user input if they clicked OK
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            int roomNum = Integer.parseInt(roomNumField.getText());
            int floor = Integer.parseInt(floorField.getText());
            String layer = (String) layerComboBox.getSelectedItem();
            int[] coordinate = new int[2];
            coordinate[0] = 0;
            coordinate[1] = 0;
            POI poi = new POI(layer, 1, roomNum, name, coordinate, floor, false);
            JOptionPane.showMessageDialog(null, poi.getDescription(), "POI Description", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addPOIActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void mapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapMouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        System.out.println("Clicked at x = " + x + ", y = " + y);
    }//GEN-LAST:event_mapMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void foodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodActionPerformed

    private void bathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Middlesex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Middlesex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Middlesex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Middlesex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Middlesex1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderBG;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JPanel OtherBG1;
    private javax.swing.JComboBox<String> SelectFloorBox1;
    private javax.swing.JButton addPOI;
    private javax.swing.JCheckBox bath;
    private javax.swing.JButton buildingSelectionButton;
    private javax.swing.JCheckBox classroom;
    private javax.swing.JLayeredPane floorMap;
    private javax.swing.JLayeredPane floorMap1;
    private javax.swing.JCheckBox food;
    private javax.swing.JButton goButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox labs;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel map;
    private javax.swing.JScrollPane mapScrollPane;
    private javax.swing.JCheckBox nav;
    private javax.swing.JCheckBox other;
    private javax.swing.JScrollPane poiLegendScrollPane;
    private javax.swing.JScrollPane poiLegendScrollPane1;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
