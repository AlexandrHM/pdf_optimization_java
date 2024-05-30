package com.component.table;

import FunctionalityClasses.MethodsPdf;
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
        visualizeIcon.setIcon(loadAndScaleIcon("/com/src/visualize_icon.png", 25, 25));
        
        visualizeIcon.setToolTipText("Visualizar pdf");
        downIcon.setToolTipText("Descargar pdf");
        deleteIcon.setToolTipText("Eliminar pdf");
        
        downIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            downIconMouseClicked(evt);
        }
});
        
        
        
        
    }
    
    
    //Variables globales
    MethodsPdf methodsPdf = new MethodsPdf();
    
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

        visualizeIcon = new javax.swing.JLabel();
        deleteIcon = new javax.swing.JLabel();
        downIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));

        visualizeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/visualize_icon.png"))); // NOI18N
        visualizeIcon.setText("Ver pdf");
        visualizeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visualizeIcon.setMaximumSize(new java.awt.Dimension(24, 24));
        visualizeIcon.setMinimumSize(new java.awt.Dimension(24, 24));
        visualizeIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        visualizeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visualizeIconMouseEntered(evt);
            }
        });

        deleteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/delete_icon.png"))); // NOI18N
        deleteIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        deleteIcon.setMinimumSize(new java.awt.Dimension(25, 25));
        deleteIcon.setPreferredSize(new java.awt.Dimension(25, 25));

        downIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/download_icon.png"))); // NOI18N
        downIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        downIcon.setMinimumSize(new java.awt.Dimension(25, 25));
        downIcon.setPreferredSize(new java.awt.Dimension(25, 25));
        downIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualizar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PDF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descargar");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("PDF");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Eliminar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PDF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(visualizeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(downIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(8, 8, 8)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void visualizeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizeIconMouseEntered
        // TODO add your handling code here:
        System.out.println("Estás haciendo click en download");
    }//GEN-LAST:event_visualizeIconMouseEntered

    private void visualizeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizeIconMouseClicked
        // TODO add your handling code here:
        methodsPdf.openWhitExplorer("C:/Users/desan/OneDrive/Documentos/CartaDatos.pdf");
        
        
    }//GEN-LAST:event_visualizeIconMouseClicked

    private void downIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downIconMouseClicked
        // TODO add your handling code here:
        System.out.println("Estàs haciendo click en down icon");
        MethodsPdf editor = new MethodsPdf(
                "correo@example.com",
                "Juan Perez",
                "12345",
                "IT",
                "Laptop",
                "Dell XPS 15",
                "Sí",
                "ABC123456",
                "ETQ123"
        );

        editor.fillPdfForm();
    }//GEN-LAST:event_downIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteIcon;
    private javax.swing.JLabel downIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel visualizeIcon;
    // End of variables declaration//GEN-END:variables
}
