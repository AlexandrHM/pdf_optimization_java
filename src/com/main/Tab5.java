package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;

public class Tab5 extends javax.swing.JPanel {

    public Tab5() {
        initComponents();
        jlabeltitle_tab5.putClientProperty("FlatLaf.styleClass", "h1");
        //Establece el tema
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabeltitle_tab5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bannerPanel = new javax.swing.JPanel();
        AdminLabel = new javax.swing.JLabel();
        BannerLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        lastnameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        employeNumberField = new javax.swing.JTextField();
        employeNumberLabel = new javax.swing.JLabel();
        employeNumberField1 = new javax.swing.JTextField();
        employeNumberLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1130, 630));
        setPreferredSize(new java.awt.Dimension(1130, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setForeground(new java.awt.Color(248, 248, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 630));

        jlabeltitle_tab5.setText(" Perfil Administrador");

        bannerPanel.setBackground(new java.awt.Color(248, 248, 248));
        bannerPanel.setForeground(new java.awt.Color(255, 255, 255));
        bannerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminLabel.setBackground(new java.awt.Color(51, 51, 51));
        AdminLabel.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        AdminLabel.setForeground(new java.awt.Color(51, 51, 51));
        AdminLabel.setText("Bienvenido! $UserAdmin");
        bannerPanel.add(AdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 290, 50));

        BannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/banner600px.png"))); // NOI18N
        BannerLabel.setPreferredSize(new java.awt.Dimension(570, 100));
        bannerPanel.add(BannerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 597, 125));

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setText(" Jose Gustavo ");

        lastnameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastnameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lastnameLabel.setText("Apellidos");

        nameLabel.setBackground(new java.awt.Color(0, 0, 0));
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("Nombre");

        emailLabel.setBackground(new java.awt.Color(0, 0, 0));
        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(51, 51, 51));
        emailLabel.setText("Correo");

        lastnameField.setBackground(new java.awt.Color(255, 255, 255));
        lastnameField.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lastnameField.setForeground(new java.awt.Color(51, 51, 51));
        lastnameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastnameField.setText("López Sánchez ");
        lastnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameFieldActionPerformed(evt);
            }
        });

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(51, 51, 51));
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setText("JoseLopez@fragua.mx");

        employeNumberField.setBackground(new java.awt.Color(255, 255, 255));
        employeNumberField.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        employeNumberField.setForeground(new java.awt.Color(51, 51, 51));
        employeNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        employeNumberField.setText("1234567305477760");
        employeNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeNumberFieldActionPerformed(evt);
            }
        });

        employeNumberLabel.setBackground(new java.awt.Color(0, 0, 0));
        employeNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        employeNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
        employeNumberLabel.setText("Numero de empleado");

        employeNumberField1.setBackground(new java.awt.Color(255, 255, 255));
        employeNumberField1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        employeNumberField1.setForeground(new java.awt.Color(51, 51, 51));
        employeNumberField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        employeNumberField1.setText("CEDIS - Ingeniería ");
        employeNumberField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeNumberField1ActionPerformed(evt);
            }
        });

        employeNumberLabel1.setBackground(new java.awt.Color(0, 0, 0));
        employeNumberLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        employeNumberLabel1.setForeground(new java.awt.Color(51, 51, 51));
        employeNumberLabel1.setText("Departamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabeltitle_tab5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(153, 153, 153)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnameLabel)))
                            .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeNumberLabel1))
                        .addGap(222, 222, 222)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeNumberLabel)
                            .addComponent(employeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(539, 539, 539))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlabeltitle_tab5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeNumberLabel)
                    .addComponent(employeNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFieldActionPerformed

    private void employeNumberField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeNumberField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeNumberField1ActionPerformed

    private void employeNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeNumberFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField employeNumberField;
    private javax.swing.JTextField employeNumberField1;
    private javax.swing.JLabel employeNumberLabel;
    private javax.swing.JLabel employeNumberLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabeltitle_tab5;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
