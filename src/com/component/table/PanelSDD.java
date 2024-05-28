package com.component.table;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/*JPanel de los iconos de delete, see and download*/
public class PanelSDD extends javax.swing.JPanel {
    
    public PanelSDD() {
        initComponents();
        deleteIcon.setIcon(loadAndScaleIcon("/com/src/delete_icon.png", 25, 25));
        downIcon.setIcon(loadAndScaleIcon("/com/src/download_icon.png", 25, 25));
        seeIcon.setIcon(loadAndScaleIcon("/com/src/visualize_icon.png", 25, 25));
    }
    
    private ImageIcon loadAndScaleIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(path));
        if (originalIcon.getIconWidth() == -1) {
            System.err.println("Error: No se pudo cargar la imagen en " + path);
            return null;
        }
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seeIcon = new javax.swing.JLabel();
        deleteIcon = new javax.swing.JLabel();
        downIcon = new javax.swing.JLabel();

        seeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/visualize_icon.png"))); // NOI18N
        seeIcon.setMaximumSize(new java.awt.Dimension(24, 24));
        seeIcon.setMinimumSize(new java.awt.Dimension(24, 24));
        seeIcon.setPreferredSize(new java.awt.Dimension(24, 24));

        deleteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/delete_icon.png"))); // NOI18N
        deleteIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        deleteIcon.setMinimumSize(new java.awt.Dimension(25, 25));
        deleteIcon.setPreferredSize(new java.awt.Dimension(25, 25));

        downIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/download_icon.png"))); // NOI18N
        downIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        downIcon.setMinimumSize(new java.awt.Dimension(25, 25));
        downIcon.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(downIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteIcon;
    private javax.swing.JLabel downIcon;
    private javax.swing.JLabel seeIcon;
    // End of variables declaration//GEN-END:variables
}
