package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.textfieldCustom.PlaceholderUtil;
import java.awt.BorderLayout;
import javax.swing.UIManager;

public class Tab4_View2 extends javax.swing.JPanel {
    
    public Tab4_View2() {
        initComponents();
        jlabeltitle_tab4view2.putClientProperty("FlatLaf.styleClass", "h1");
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

        panelsubcontent_view2 = new javax.swing.JPanel();
        baseView2 = new javax.swing.JPanel();
        jlabeltitle_tab4view2 = new javax.swing.JLabel();
        jSeparatorView2 = new javax.swing.JSeparator();
        subtitle1_view2 = new javax.swing.JLabel();
        sub1label1_view2 = new javax.swing.JLabel();
        ContainerSign = new com.textfieldCustom.TextFieldCustom();
        view2_incidentbutton = new com.customButton.CustomButtons();
        view2_backbutton = new com.customButton.CustomButtons();
        view2_finishbutton = new com.customButton.CustomButtons();
        view2_cleanbutton1 = new com.customButton.CustomButtons();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsubcontent_view2.setBackground(new java.awt.Color(255, 255, 255));
        panelsubcontent_view2.setPreferredSize(new java.awt.Dimension(1030, 650));
        panelsubcontent_view2.setLayout(new java.awt.BorderLayout());

        baseView2.setBackground(new java.awt.Color(255, 255, 255));
        baseView2.setPreferredSize(new java.awt.Dimension(1030, 650));
        baseView2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabeltitle_tab4view2.setText(" Formulario Carta Responsiva");
        baseView2.add(jlabeltitle_tab4view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 30));

        jSeparatorView2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparatorView2.setForeground(new java.awt.Color(0, 0, 0));
        baseView2.add(jSeparatorView2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1000, 10));

        subtitle1_view2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        subtitle1_view2.setForeground(new java.awt.Color(0, 0, 0));
        subtitle1_view2.setText(" Proceso de firmado digital ");
        baseView2.add(subtitle1_view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 240, 30));

        sub1label1_view2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label1_view2.setForeground(new java.awt.Color(0, 0, 0));
        sub1label1_view2.setText(" Introduzca su firma ");
        baseView2.add(sub1label1_view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        ContainerSign.setBackground(new java.awt.Color(250, 250, 250));
        ContainerSign.setForeground(new java.awt.Color(153, 153, 153));
        ContainerSign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContainerSign.setRound(30);
        ContainerSign.setSelectionColor(new java.awt.Color(255, 255, 255));
        ContainerSign.setShadowColor(new java.awt.Color(51, 51, 51));
        ContainerSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContainerSignActionPerformed(evt);
            }
        });
        baseView2.add(ContainerSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 700, 400));

        view2_incidentbutton.setBackground(new java.awt.Color(252, 188, 28));
        view2_incidentbutton.setForeground(new java.awt.Color(255, 255, 255));
        view2_incidentbutton.setText("Incidente");
        view2_incidentbutton.setBorderColor(new java.awt.Color(252, 188, 28));
        view2_incidentbutton.setBorderPainted(false);
        view2_incidentbutton.setColor(new java.awt.Color(252, 188, 28));
        view2_incidentbutton.setColorClick(new java.awt.Color(243, 171, 27));
        view2_incidentbutton.setColorOver(new java.awt.Color(244, 204, 76));
        view2_incidentbutton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        view2_incidentbutton.setRadius(30);
        view2_incidentbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view2_incidentbuttonMouseClicked(evt);
            }
        });
        baseView2.add(view2_incidentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 130, 40));

        view2_backbutton.setBackground(new java.awt.Color(228, 91, 105));
        view2_backbutton.setForeground(new java.awt.Color(255, 255, 255));
        view2_backbutton.setText("Regresar");
        view2_backbutton.setBorderColor(new java.awt.Color(228, 91, 105));
        view2_backbutton.setBorderPainted(false);
        view2_backbutton.setColor(new java.awt.Color(228, 91, 105));
        view2_backbutton.setColorClick(new java.awt.Color(219, 45, 63));
        view2_backbutton.setColorOver(new java.awt.Color(227, 84, 99));
        view2_backbutton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        view2_backbutton.setRadius(30);
        view2_backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view2_backbuttonMouseClicked(evt);
            }
        });
        view2_backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2_backbuttonActionPerformed(evt);
            }
        });
        baseView2.add(view2_backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 130, 40));

        view2_finishbutton.setBackground(new java.awt.Color(90, 228, 144));
        view2_finishbutton.setForeground(new java.awt.Color(255, 255, 255));
        view2_finishbutton.setText("Finalizar");
        view2_finishbutton.setBorderColor(new java.awt.Color(90, 228, 144));
        view2_finishbutton.setBorderPainted(false);
        view2_finishbutton.setColor(new java.awt.Color(90, 228, 144));
        view2_finishbutton.setColorClick(new java.awt.Color(156, 236, 188));
        view2_finishbutton.setColorOver(new java.awt.Color(180, 243, 205));
        view2_finishbutton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        view2_finishbutton.setRadius(30);
        view2_finishbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2_finishbuttonActionPerformed(evt);
            }
        });
        baseView2.add(view2_finishbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 130, 40));

        view2_cleanbutton1.setForeground(new java.awt.Color(255, 255, 255));
        view2_cleanbutton1.setText("Limpiar");
        view2_cleanbutton1.setBorderPainted(false);
        view2_cleanbutton1.setColor(new java.awt.Color(80, 187, 223));
        view2_cleanbutton1.setColorOver(new java.awt.Color(64, 100, 216));
        view2_cleanbutton1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        view2_cleanbutton1.setRadius(30);
        view2_cleanbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2_cleanbutton1ActionPerformed(evt);
            }
        });
        baseView2.add(view2_cleanbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 130, 40));

        panelsubcontent_view2.add(baseView2, java.awt.BorderLayout.CENTER);

        add(panelsubcontent_view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void view2_backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2_backbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view2_backbuttonActionPerformed

    private void ContainerSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContainerSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContainerSignActionPerformed

    private void view2_finishbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2_finishbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view2_finishbuttonActionPerformed

    private void view2_cleanbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2_cleanbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view2_cleanbutton1ActionPerformed
    //Evento de click que trae Tab4_view3
    private void view2_incidentbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view2_incidentbuttonMouseClicked
        panelsubcontent_view2.removeAll();
        panelsubcontent_view2.add(new Tab4_View3(), BorderLayout.CENTER);
        panelsubcontent_view2.revalidate();
        panelsubcontent_view2.repaint();
    }//GEN-LAST:event_view2_incidentbuttonMouseClicked
    //Evento click para regresar
    private void view2_backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view2_backbuttonMouseClicked
        /* JPanel = panelsubcontent_view2 donde se mostrara el contenido
        de la otra ventana, es decir se tienen que tener dos paneles, uno 
        para el contenido de tab4_view2 y otro donde se muestre tab4*/
        panelsubcontent_view2.removeAll();
        panelsubcontent_view2.add(new Tab4(),BorderLayout.CENTER);
        panelsubcontent_view2.revalidate();
        panelsubcontent_view2.repaint();
    }//GEN-LAST:event_view2_backbuttonMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.textfieldCustom.TextFieldCustom ContainerSign;
    private javax.swing.JPanel baseView2;
    private javax.swing.JSeparator jSeparatorView2;
    private javax.swing.JLabel jlabeltitle_tab4view2;
    private javax.swing.JPanel panelsubcontent_view2;
    private javax.swing.JLabel sub1label1_view2;
    private javax.swing.JLabel subtitle1_view2;
    private com.customButton.CustomButtons view2_backbutton;
    private com.customButton.CustomButtons view2_cleanbutton1;
    private com.customButton.CustomButtons view2_finishbutton;
    private com.customButton.CustomButtons view2_incidentbutton;
    // End of variables declaration//GEN-END:variables
}
