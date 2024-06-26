/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * created by Hana Saffiyya binti Ahmad Nozal (78013)
 * tested by Ngu Keh Cong (80369)
 */
package netbeansproject;

import java.awt.Image;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditImage extends javax.swing.JFrame {
    private File f=null;
    private String path=null;
    private ImageIcon format=null;
    private int imgID;
    
    /**
     * Creates new form EditImage
     * @throws java.sql.SQLException
     */
    public EditImage() throws SQLException {
        initComponents();
        database d=new database();
        retrieveImageID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backIcon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imageID1 = new javax.swing.JComboBox<>();
        panelUpdateImage = new javax.swing.JPanel();
        labelUpdateImage = new javax.swing.JLabel();
        buttonNewImg = new javax.swing.JButton();
        buttonUpdateImg = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        backIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_back_to_40px.png"))); // NOI18N
        backIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIcon1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Please select an image to edit or delete");

        imageID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Image ID" }));
        imageID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageID1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUpdateImageLayout = new javax.swing.GroupLayout(panelUpdateImage);
        panelUpdateImage.setLayout(panelUpdateImageLayout);
        panelUpdateImageLayout.setHorizontalGroup(
            panelUpdateImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdateImage, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        panelUpdateImageLayout.setVerticalGroup(
            panelUpdateImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdateImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        buttonNewImg.setText("New Image");
        buttonNewImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewImgActionPerformed(evt);
            }
        });

        buttonUpdateImg.setText("Update ");
        buttonUpdateImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateImgActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(imageID1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backIcon1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(buttonNewImg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(buttonUpdateImg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panelUpdateImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backIcon1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imageID1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panelUpdateImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewImg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdateImg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIcon1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backIcon1MouseClicked

    private void imageID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageID1ActionPerformed
        // TODO add your handling code here:
        imgID= Integer.parseInt(imageID1.getSelectedItem().toString());
        
        String query="SELECT img FROM image WHERE img_id=?";
        database d=new database();
        d.connect();
        try {
            d.setStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(ViewImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            d.getStatement().setInt(1,imgID);
        } catch (SQLException ex) {
            Logger.getLogger(ViewImage.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            d.executeQ();
        } catch (SQLException ex) {
            Logger.getLogger(ViewImage.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if(d.getResultSet().next()){
                retrieveImage(d);
            }

            else{
                JOptionPane.showMessageDialog(this,"No image found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            d.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ViewImage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_imageID1ActionPerformed

    private void buttonNewImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewImgActionPerformed
        // TODO add your handling code here:
        JFileChooser chooseImage=new JFileChooser();
        FileNameExtensionFilter validExtension= new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpg","jpeg");
        chooseImage.addChoosableFileFilter(validExtension);
        int load=chooseImage.showOpenDialog(null);
        if(load==chooseImage.APPROVE_OPTION){
            f=chooseImage.getSelectedFile();
            path=f.getAbsolutePath();
            ImageIcon ii=new ImageIcon(path);
            Image img=ii.getImage().getScaledInstance(380,458,Image.SCALE_SMOOTH);
            labelUpdateImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_buttonNewImgActionPerformed

    private void buttonUpdateImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateImgActionPerformed
        // TODO add your handling code here:
        database d= new database();
        d.connect();
     
        try {
            File f=new File(path);
            InputStream input= new FileInputStream(f);
            String query="UPDATE image SET img=? WHERE img_id=?";
            d.setStatement(query);
            d.getStatement().setBlob(1,input);
            d.getStatement().setInt(2,imgID);
            d.modify();
        } catch (FileNotFoundException | SQLException ex) {
        Logger.getLogger(AddImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            d.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AddImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {

        d.disconnect();
    } catch (SQLException ex) {
        Logger.getLogger(AddImage.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_buttonUpdateImgActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        database d= new database();
        d.connect();
     
        try {
            String query="DELETE FROM image WHERE img_id=?";
            d.setStatement(query);
            d.getStatement().setInt(1,imgID);
            d.delete();
        } catch (SQLException ex) {
        Logger.getLogger(AddImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            d.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AddImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {
        
        d.disconnect();
    } catch (SQLException ex) {
        Logger.getLogger(AddImage.class.getName()).log(Level.SEVERE, null, ex);
    }
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void retrieveImageID() throws SQLException{
        String query="SELECT img_id FROM image";
        database d=new database();
        d.connect();
        d.setStatement(query);
        d.executeQ();
        while(d.getResultSet().next()){
            String id=d.getResultSet().getString(1);
            imageID1.addItem(id);
        }
    }
      
    public void retrieveImage(database d) throws SQLException{
        byte[] imagedata=d.getResultSet().getBytes("img");
        format= new ImageIcon(imagedata);
        Image img=format.getImage();
        Image img2=img.getScaledInstance(364,402,Image.SCALE_SMOOTH);
        ImageIcon image= new ImageIcon(img2);
        labelUpdateImage.setIcon(image);
    }
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
            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditImage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditImage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton buttonNewImg;
    private javax.swing.JButton buttonUpdateImg;
    private javax.swing.JComboBox<String> imageID1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelUpdateImage;
    private javax.swing.JPanel panelUpdateImage;
    // End of variables declaration//GEN-END:variables
}
