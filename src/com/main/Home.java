package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        /*Instanciamos un objeto de la clase Tab1*/
        Tab1 t1 = new Tab1();
        ShowPanel(t1);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        SlideDown = new keeptoo.KGradientPanel();
        SlideOpc = new keeptoo.KGradientPanel();
        LogoHome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new com.customButton.CustomButtons();
        homeButton = new com.customButton.CustomButtons();
        reportsButton = new com.customButton.CustomButtons();
        employeButton1 = new com.customButton.CustomButtons();
        newPdfButton = new com.customButton.CustomButtons();
        profileButton = new com.customButton.CustomButtons();
        jPanel2 = new javax.swing.JPanel();
        SlideTop = new keeptoo.KGradientPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SlideDown.setBackground(new java.awt.Color(255, 255, 255));
        SlideDown.setForeground(new java.awt.Color(255, 255, 255));
        SlideDown.setkEndColor(new java.awt.Color(80, 187, 223));
        SlideDown.setkStartColor(new java.awt.Color(80, 187, 223));
        SlideDown.setkTransparentControls(false);

        javax.swing.GroupLayout SlideDownLayout = new javax.swing.GroupLayout(SlideDown);
        SlideDown.setLayout(SlideDownLayout);
        SlideDownLayout.setHorizontalGroup(
            SlideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        SlideDownLayout.setVerticalGroup(
            SlideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        BGPanel.add(SlideDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 1130, 20));

        SlideOpc.setBackground(new java.awt.Color(80, 187, 223));
        SlideOpc.setkEndColor(new java.awt.Color(80, 187, 223));
        SlideOpc.setkGradientFocus(400);
        SlideOpc.setkStartColor(new java.awt.Color(80, 187, 223));
        SlideOpc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/Logo.png"))); // NOI18N
        SlideOpc.add(LogoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(228, 91, 105));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SlideOpc.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CRUD FRAGUA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(10);
        SlideOpc.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 30));

        exitButton.setBorder(null);
        exitButton.setForeground(new java.awt.Color(51, 51, 51));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/exit_png_16px.png"))); // NOI18N
        exitButton.setText("Cerrar sesión");
        exitButton.setColor(new java.awt.Color(80, 187, 223));
        exitButton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exitButton.setIconTextGap(5);
        exitButton.setMargin(new java.awt.Insets(2, 18, 3, 14));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        SlideOpc.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 160, 35));

        homeButton.setForeground(new java.awt.Color(51, 51, 51));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/home_png_16px.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setColor(new java.awt.Color(80, 187, 223));
        homeButton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        homeButton.setIconTextGap(25);
        homeButton.setMargin(new java.awt.Insets(2, 20, 3, 14));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        SlideOpc.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 40));

        reportsButton.setForeground(new java.awt.Color(51, 51, 51));
        reportsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/docs_png_16px.png"))); // NOI18N
        reportsButton.setText("Reportes");
        reportsButton.setBorderPainted(false);
        reportsButton.setColor(new java.awt.Color(80, 187, 223));
        reportsButton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        reportsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        reportsButton.setIconTextGap(10);
        reportsButton.setMargin(new java.awt.Insets(2, 18, 3, 14));
        reportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsButtonMouseClicked(evt);
            }
        });
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });
        SlideOpc.add(reportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 40));

        employeButton1.setForeground(new java.awt.Color(51, 51, 51));
        employeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/users_png_16px.png"))); // NOI18N
        employeButton1.setText("Empleados");
        employeButton1.setBorderPainted(false);
        employeButton1.setColor(new java.awt.Color(80, 187, 223));
        employeButton1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        employeButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        employeButton1.setIconTextGap(10);
        employeButton1.setMargin(new java.awt.Insets(2, 20, 3, 14));
        employeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeButton1MouseClicked(evt);
            }
        });
        employeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeButton1ActionPerformed(evt);
            }
        });
        SlideOpc.add(employeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 40));

        newPdfButton.setForeground(new java.awt.Color(51, 51, 51));
        newPdfButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/adddoc_png_16px.png"))); // NOI18N
        newPdfButton.setText("Crear carta");
        newPdfButton.setBorderPainted(false);
        newPdfButton.setColor(new java.awt.Color(80, 187, 223));
        newPdfButton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        newPdfButton.setIconTextGap(5);
        newPdfButton.setMargin(new java.awt.Insets(2, 15, 3, 14));
        newPdfButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPdfButtonMouseClicked(evt);
            }
        });
        newPdfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPdfButtonActionPerformed(evt);
            }
        });
        SlideOpc.add(newPdfButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 160, 40));

        profileButton.setForeground(new java.awt.Color(51, 51, 51));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/src/user_png_16px.png"))); // NOI18N
        profileButton.setText("Perfil");
        profileButton.setBorderPainted(false);
        profileButton.setColor(new java.awt.Color(80, 187, 223));
        profileButton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        profileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        profileButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        profileButton.setIconTextGap(20);
        profileButton.setMargin(new java.awt.Insets(2, 18, 3, 14));
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
        });
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        SlideOpc.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 40));

        jPanel2.setBackground(new java.awt.Color(228, 91, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        SlideOpc.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 10, 30));

        BGPanel.add(SlideOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        SlideTop.setBackground(new java.awt.Color(255, 255, 255));
        SlideTop.setForeground(new java.awt.Color(255, 255, 255));
        SlideTop.setkEndColor(new java.awt.Color(80, 187, 223));
        SlideTop.setkGradientFocus(900);
        SlideTop.setkStartColor(new java.awt.Color(80, 187, 223));
        SlideTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BGPanel.add(SlideTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1130, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        BGPanel.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 1130, 650));

        getContentPane().add(BGPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileButtonActionPerformed

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        /*Instanciamos un objeto de la clase Tab1*/
        Tab5 t5 = new Tab5();
        t5.setSize(1130, 630);
        t5.setLocation(0, 0);

        content.removeAll();
        content.add(t5,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_profileButtonMouseClicked

    private void newPdfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPdfButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPdfButtonActionPerformed

    private void newPdfButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPdfButtonMouseClicked
        /*Instanciamos un objeto de la clase Tab1*/
        Tab4 t4 = new Tab4();
        t4.setSize(1130, 630);
        t4.setLocation(0, 0);

        content.removeAll();
        content.add(t4,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_newPdfButtonMouseClicked

    private void employeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeButton1ActionPerformed

    private void employeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeButton1MouseClicked
        /*Instanciamos un objeto de la clase Tab1*/
        Tab3 t3 = new Tab3();
        t3.setSize(1130, 630);
        t3.setLocation(0, 0);

        content.removeAll();
        content.add(t3,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_employeButton1MouseClicked

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void reportsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsButtonMouseClicked
        /*Instanciamos un objeto de la clase Tab1*/
        Tab2 t2 = new Tab2();
        t2.setSize(1130, 630);
        t2.setLocation(0, 0);

        content.removeAll();
        content.add(t2,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_reportsButtonMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed
    
    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        /*Instanciamos un objeto de la clase Tab1*/
        Tab1 t1 = new Tab1();
        t1.setSize(1130, 630);
        t1.setLocation(0, 0);

        content.removeAll();
        content.add(t1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_homeButtonMouseClicked
    
      
    /*Metodo que manda a llamar las ventanas*/
    private void ShowPanel(JPanel t){
        t.setSize(1130, 630);
        t.setLocation(0, 0);
        
        content.removeAll();
        content.add(t,BorderLayout.CENTER);
        content.revalidate();
        content.repaint(); 
    }
    
    public static void main(String args[]) {
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                //Establece el tema
            try {
                UIManager.setLookAndFeel(new FlatMacLightLaf());
            } catch (Exception ex) {
                System.err.println("Failed to initialize LaF");
            }
            
            new Home().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JLabel LogoHome;
    private keeptoo.KGradientPanel SlideDown;
    private keeptoo.KGradientPanel SlideOpc;
    private keeptoo.KGradientPanel SlideTop;
    private javax.swing.JPanel content;
    private com.customButton.CustomButtons employeButton1;
    private com.customButton.CustomButtons exitButton;
    private com.customButton.CustomButtons homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.customButton.CustomButtons newPdfButton;
    private com.customButton.CustomButtons profileButton;
    private com.customButton.CustomButtons reportsButton;
    // End of variables declaration//GEN-END:variables
}
