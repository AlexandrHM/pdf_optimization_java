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
        lastnameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        employeNumberLabel = new javax.swing.JLabel();
        employeNumberLabel1 = new javax.swing.JLabel();
        tab5dataName = new com.textfieldCustom.TextFieldCustom();
        textFieldCustom2 = new com.textfieldCustom.TextFieldCustom();
        textFieldCustom3 = new com.textfieldCustom.TextFieldCustom();
        textFieldCustom4 = new com.textfieldCustom.TextFieldCustom();
        textFieldCustom6 = new com.textfieldCustom.TextFieldCustom();

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
        bannerPanel.add(AdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, 50));

        BannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/banner600px.png"))); // NOI18N
        BannerLabel.setPreferredSize(new java.awt.Dimension(570, 100));
        bannerPanel.add(BannerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 600, 125));

        lastnameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastnameLabel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(51, 51, 51));
        lastnameLabel.setText("Apellidos");

        nameLabel.setBackground(new java.awt.Color(0, 0, 0));
        nameLabel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("Nombre");

        emailLabel.setBackground(new java.awt.Color(0, 0, 0));
        emailLabel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(51, 51, 51));
        emailLabel.setText("Correo");

        employeNumberLabel.setBackground(new java.awt.Color(0, 0, 0));
        employeNumberLabel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        employeNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
        employeNumberLabel.setText("Numero de empleado");

        employeNumberLabel1.setBackground(new java.awt.Color(0, 0, 0));
        employeNumberLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        employeNumberLabel1.setForeground(new java.awt.Color(51, 51, 51));
        employeNumberLabel1.setText("Departamento");

        tab5dataName.setEditable(false);
        tab5dataName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tab5dataName.setText(" Jose Gustavo ");
        tab5dataName.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        tab5dataName.setRound(20);
        tab5dataName.setShadowColor(new java.awt.Color(102, 102, 102));
        tab5dataName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab5dataNameActionPerformed(evt);
            }
        });

        textFieldCustom2.setEditable(false);
        textFieldCustom2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldCustom2.setText("123456789 ");
        textFieldCustom2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        textFieldCustom2.setRound(20);
        textFieldCustom2.setShadowColor(new java.awt.Color(102, 102, 102));

        textFieldCustom3.setEditable(false);
        textFieldCustom3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldCustom3.setText(" Lopez Sanchez");
        textFieldCustom3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        textFieldCustom3.setRound(20);
        textFieldCustom3.setShadowColor(new java.awt.Color(102, 102, 102));

        textFieldCustom4.setEditable(false);
        textFieldCustom4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldCustom4.setText("CEDIS - Ingeniería ");
        textFieldCustom4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        textFieldCustom4.setRound(20);
        textFieldCustom4.setShadowColor(new java.awt.Color(102, 102, 102));

        textFieldCustom6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldCustom6.setText("JoseLopez@fragua.mx");
        textFieldCustom6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        textFieldCustom6.setRound(20);
        textFieldCustom6.setShadowColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(311, 311, 311)
                .addComponent(lastnameLabel)
                .addGap(379, 379, 379))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tab5dataName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(textFieldCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(employeNumberLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeNumberLabel)
                .addGap(230, 230, 230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(textFieldCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabeltitle_tab5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(textFieldCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(emailLabel)))
                .addContainerGap(100, Short.MAX_VALUE))
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
                    .addComponent(lastnameLabel)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tab5dataName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(emailLabel)
                .addGap(18, 18, 18)
                .addComponent(textFieldCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tab5dataNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab5dataNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tab5dataNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employeNumberLabel;
    private javax.swing.JLabel employeNumberLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabeltitle_tab5;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel nameLabel;
    private com.textfieldCustom.TextFieldCustom tab5dataName;
    private com.textfieldCustom.TextFieldCustom textFieldCustom2;
    private com.textfieldCustom.TextFieldCustom textFieldCustom3;
    private com.textfieldCustom.TextFieldCustom textFieldCustom4;
    private com.textfieldCustom.TextFieldCustom textFieldCustom6;
    // End of variables declaration//GEN-END:variables
}
