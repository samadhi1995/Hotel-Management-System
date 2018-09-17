/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.sem1.hms.other;

import edu.ijse.sem1.hms.view.HomePage;

/**
 *
 * @author Achini & Samadhi
 */
public class Gallery extends javax.swing.JFrame {

    /**
     * Creates new form Gallery
     */
    public Gallery() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        galleryLabel = new javax.swing.JLabel();
        viewDescription = new javax.swing.JLabel();
        nextPageLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        hotelImage = new javax.swing.JLabel();
        backgroundIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setLayout(null);

        galleryLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        galleryLabel.setForeground(new java.awt.Color(255, 255, 255));
        galleryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        galleryLabel.setText("Gallery");
        mainPanel.add(galleryLabel);
        galleryLabel.setBounds(600, 10, 160, 40);

        viewDescription.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewDescription.setForeground(new java.awt.Color(255, 255, 255));
        viewDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewDescription.setText("Awesome Hotel View From Lagoon Side");
        mainPanel.add(viewDescription);
        viewDescription.setBounds(60, 70, 370, 30);

        nextPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextPageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/sem1/hms/images/FontAwesome_f061(0)_85.png"))); // NOI18N
        nextPageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageLabelMouseClicked(evt);
            }
        });
        mainPanel.add(nextPageLabel);
        nextPageLabel.setBounds(1250, 660, 85, 80);

        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/sem1/hms/images/FontAwesome_f015(0)_85.png"))); // NOI18N
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });
        mainPanel.add(homeIcon);
        homeIcon.setBounds(1160, 660, 80, 80);

        hotelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/sem1/hms/images/lagoon.jpg"))); // NOI18N
        mainPanel.add(hotelImage);
        hotelImage.setBounds(10, 100, 1330, 700);

        backgroundIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/sem1/hms/images/2016-05-01-20-13-48-481.jpg"))); // NOI18N
        mainPanel.add(backgroundIcon);
        backgroundIcon.setBounds(-6, -6, 1440, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_homeIconMouseClicked

    private void nextPageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageLabelMouseClicked
        new Gallery1().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_nextPageLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gallery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundIcon;
    private javax.swing.JLabel galleryLabel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel hotelImage;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nextPageLabel;
    private javax.swing.JLabel viewDescription;
    // End of variables declaration//GEN-END:variables
}