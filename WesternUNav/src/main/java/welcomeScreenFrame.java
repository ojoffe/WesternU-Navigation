/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JComboBox;
/**
 *
 * @author stephenkinsey
 */

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class welcomeScreenFrame extends javax.swing.JFrame {
    private String selectedBuilding;
    /**
     * Creates new form welcomeScreenFrame
     */
    public welcomeScreenFrame() {
        initComponents();
    }

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
        OtherBG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AboutUsButton = new javax.swing.JButton();
        SelectBuildingBox = new javax.swing.JComboBox<>();
        DoneButton = new javax.swing.JButton();
        favouritesList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        DoneButton1 = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        weatherImage = new javax.swing.JLabel();
        weatherText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderBG.setBackground(new java.awt.Color(153, 0, 255));

        HeaderTitle.setBackground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setText("WesternU Building Navigation System");

        javax.swing.GroupLayout HeaderBGLayout = new javax.swing.GroupLayout(HeaderBG);
        HeaderBG.setLayout(HeaderBGLayout);
        HeaderBGLayout.setHorizontalGroup(
            HeaderBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderBGLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(HeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        HeaderBGLayout.setVerticalGroup(
            HeaderBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderBGLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(HeaderTitle)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        OtherBG.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME!");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Explore a Building:");

        AboutUsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AboutUsButton.setText("About Us");
        AboutUsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsButtonActionPerformed(evt);
            }
        });

        SelectBuildingBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Middlesex College", "University College", "Talbot College" }));
        SelectBuildingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBuildingBoxActionPerformed(evt);
            }
        });

        DoneButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        String[] items;
        items = this.getFavourites("dataFiles/POI.json");
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(items);
        favouritesList.setModel(model);
        favouritesList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouritesListActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Favourites Navigation:");

        submit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AboutUsButton)
                            .addGap(33, 33, 33)
                            .addComponent(submit))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(DoneButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SelectBuildingBox, 0, 180, Short.MAX_VALUE)
                                    .addComponent(favouritesList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(34, 99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(SelectBuildingBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(favouritesList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submit)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AboutUsButton)
                        .addContainerGap())))
        );

        DoneButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        DoneButton1.setText("Help");
        DoneButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButton1ActionPerformed(evt);
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

        Boolean weatherBool = true;
        String weather = "";
        try {
            weather = WeatherAPI.getWeather("London, Ontario");
        } catch (Exception e) {
            weatherBool = false;
        }
        String filePath;
        if (weatherBool == false) {
            filePath = "dataFiles/noInternet.png";
        } else {
            filePath = "dataFiles/weatherImage.png";
        }
        weatherImage.setIcon(new javax.swing.ImageIcon(filePath));

        try {
            weather = WeatherAPI.getWeather("London, Ontario");
        } catch (Exception e) {
            weather = "Can't Access Weather,please try again later.";
        }
        weatherText.setText(weather);
        weatherText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout OtherBGLayout = new javax.swing.GroupLayout(OtherBG);
        OtherBG.setLayout(OtherBGLayout);
        OtherBGLayout.setHorizontalGroup(
            OtherBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherBGLayout.createSequentialGroup()
                .addGroup(OtherBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OtherBGLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(DoneButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weatherImage)
                        .addGap(212, 212, 212)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OtherBGLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OtherBGLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(OtherBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OtherBGLayout.createSequentialGroup()
                        .addComponent(logOutButton)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OtherBGLayout.createSequentialGroup()
                        .addComponent(weatherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(100, 100, 100))))
        );
        OtherBGLayout.setVerticalGroup(
            OtherBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherBGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(OtherBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoneButton1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weatherImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weatherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OtherBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OtherBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   // test comment
    private void AboutUsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsButtonActionPerformed
        new AboutUsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AboutUsButtonActionPerformed

    private void SelectBuildingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBuildingBoxActionPerformed
        
    }//GEN-LAST:event_SelectBuildingBoxActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        if (SelectBuildingBox.getSelectedItem().toString().equals("Middlesex College")) {
            new Middlesex1().setVisible(true);
            this.dispose();
        }
        if (SelectBuildingBox.getSelectedItem().toString().equals("University College")) {
            new UC1().setVisible(true);
            this.dispose();
        }
        if (SelectBuildingBox.getSelectedItem().toString().equals("Talbot College")) {
            new Talbot1().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void DoneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButton1ActionPerformed
            // Load the PDF file
        File pdfFile = new File("dataFiles/2212help.pdf");

        // Open the PDF file using the default PDF viewer
        try {
            Desktop.getDesktop().open(pdfFile);
        } catch (IOException ex) {
            // Handle any errors opening the PDF file
            ex.printStackTrace();
        }

    }//GEN-LAST:event_DoneButton1ActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        new CreateAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String jsonFilePath = "dataFiles/POI.json";
        String fav = favouritesList.getSelectedItem().toString();
        Boolean hasFav = true;
        if (fav.equals("No Favourites Yet")) {
            hasFav = false;
            JOptionPane.showMessageDialog(this, "No Favourites had been made yet...");
        }
        try (FileReader reader = new FileReader(jsonFilePath)) {
            JSONObject json = new JSONObject(new JSONTokener(reader));
            JSONArray buildings = json.getJSONArray("buildings");
            for (int buildIndex = 0; buildIndex < 3; buildIndex++) {
                JSONObject building = buildings.getJSONObject(buildIndex);
                JSONArray pois = building.getJSONArray("points_of_interest");
                Boolean found = false;
                for (int j = 0; j < pois.length(); j++) {
                    JSONObject poiJson = pois.getJSONObject(j);
                    String info = poiJson.getString("name");
                    if (info.equals(fav)) {
                        found = true;
                        int floor = poiJson.getInt("floor");
                        if (buildIndex == 0) {
                            if (floor == 1) {
                                this.dispose();
                                Middlesex1 newF = new Middlesex1();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 2) {
                                this.dispose();
                                Middlesex2 newF = new Middlesex2();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 3) {
                                this.dispose();
                                Middlesex2 newF = new Middlesex2();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 4) {
                                this.dispose();
                                Middlesex4 newF = new Middlesex4();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 5) {
                                this.dispose();
                                Middlesex5 newF = new Middlesex5();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                        } else if (buildIndex == 1) {
                            if (floor == 1) {
                                this.dispose();
                                UC1 newF = new UC1();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 2) {
                                this.dispose();
                                UC2 newF = new UC2();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 3) {
                                this.dispose();
                                UC3 newF = new UC3();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 4) {
                                this.dispose();
                                UC4 newF = new UC4();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                        } else if (buildIndex == 2) {
                            if (floor == 1) {
                                this.dispose();
                                Talbot1 newF = new Talbot1();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 2) {
                                this.dispose();
                                Talbot2 newF = new Talbot2();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 3) {
                                this.dispose();
                                Talbot3 newF = new Talbot3();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                            if (floor == 4) {
                                this.dispose();
                                Talbot4 newF = new Talbot4();
                                JLabel map1 = newF.getMapLabel();
                                newF.setVisible(true);
                                light(map1, poiJson);
                                break;
                            }
                        }
                    }
                }
                if (found == true) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitActionPerformed

    private void favouritesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouritesListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favouritesListActionPerformed

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
            java.util.logging.Logger.getLogger(welcomeScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomeScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomeScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomeScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomeScreenFrame().setVisible(true);
            }
        });
    }
    public String[] getFavourites(String jsonFilePath) {
        int size = 0;
        try (FileReader reader = new FileReader(jsonFilePath)) {
            JSONObject json = new JSONObject(new JSONTokener(reader));
            JSONArray buildings = json.getJSONArray("buildings");
            for (int i = 0;i < 3; i++) {
                JSONObject building = buildings.getJSONObject(i);
                JSONArray pois = building.getJSONArray("points_of_interest");
                for (int j = 0; j < pois.length(); j++) {
                    JSONObject poiJson = pois.getJSONObject(j);
                    if (poiJson.getInt("favourite") == 1) {
                        size += 1;
                    } 
                }
            }
            String[] items = new String[size];
            if (size == 0) {
                items = new String[1];
                items[0] = "No Favourites Yet";
                return items;
            } else {
                int index = 0;
                for (int i = 0;i < 3; i++) {
                    JSONObject building = buildings.getJSONObject(i);
                    JSONArray pois = building.getJSONArray("points_of_interest");
                    for (int j = 0; j < pois.length(); j++) {
                        JSONObject poiJson = pois.getJSONObject(j);
                        String name = poiJson.getString("name");
                        if (poiJson.getInt("favourite") == 1) {
                            items[index] = name;
                            index++;
                        } 
                    }
                }
                return items;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUsButton;
    private javax.swing.JButton DoneButton;
    private javax.swing.JButton DoneButton1;
    private javax.swing.JPanel HeaderBG;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JPanel OtherBG;
    private javax.swing.JComboBox<String> SelectBuildingBox;
    private javax.swing.JComboBox<String> favouritesList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton submit;
    private javax.swing.JLabel weatherImage;
    private javax.swing.JLabel weatherText;
    // End of variables declaration//GEN-END:variables
}
