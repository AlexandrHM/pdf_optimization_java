package com.component.table;
/*JPanel de los iconos de delete, see and download*/
public class PanelSDD extends javax.swing.JPanel {
    
    public PanelSDD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seeIcon = new javax.swing.JLabel();
        deleteIcon = new javax.swing.JLabel();
        downIcon = new javax.swing.JLabel();

        seeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/see_icon_png.png"))); // NOI18N
        seeIcon.setMaximumSize(new java.awt.Dimension(64, 64));
        seeIcon.setMinimumSize(new java.awt.Dimension(64, 64));

        deleteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/delete_icon_png.png"))); // NOI18N

        downIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/downloand_icon_png.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(downIcon)
                .addGap(18, 18, 18)
                .addComponent(deleteIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteIcon;
    private javax.swing.JLabel downIcon;
    private javax.swing.JLabel seeIcon;
    // End of variables declaration//GEN-END:variables
}
