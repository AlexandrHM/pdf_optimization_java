package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.textfieldCustom.PlaceholderUtil;
import java.awt.BorderLayout;
import javax.swing.UIManager;

public class Tab4_View3 extends javax.swing.JPanel {
    
    public Tab4_View3() {
        initComponents();
        jlabeltitle_tab4view3.putClientProperty("FlatLaf.styleClass", "h1");
        //Establece el tema
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        // Agregar Placeholders
        PlaceholderUtil.addPlaceholder(VIew3_DescripcionTextField, " Describa el incidente al entregar el activo... ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsubcontent_view3 = new javax.swing.JPanel();
        baseView3 = new javax.swing.JPanel();
        jlabeltitle_tab4view3 = new javax.swing.JLabel();
        jSeparatorView3 = new javax.swing.JSeparator();
        subtitle1_view3 = new javax.swing.JLabel();
        sub1label1_view3 = new javax.swing.JLabel();
        VIew3_DescripcionTextField = new com.textfieldCustom.TextFieldCustom();
        view2_cancelbutton = new com.customButton.CustomButtons();
        view3_finishbutton = new com.customButton.CustomButtons();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsubcontent_view3.setBackground(new java.awt.Color(255, 255, 255));
        panelsubcontent_view3.setPreferredSize(new java.awt.Dimension(1030, 650));
        panelsubcontent_view3.setLayout(new java.awt.BorderLayout());

        baseView3.setBackground(new java.awt.Color(255, 255, 255));
        baseView3.setPreferredSize(new java.awt.Dimension(1030, 650));
        baseView3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabeltitle_tab4view3.setText(" Formulario Carta Responsiva");
        baseView3.add(jlabeltitle_tab4view3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 30));

        jSeparatorView3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparatorView3.setForeground(new java.awt.Color(0, 0, 0));
        baseView3.add(jSeparatorView3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1000, 10));

        subtitle1_view3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        subtitle1_view3.setForeground(new java.awt.Color(0, 0, 0));
        subtitle1_view3.setText(" Declaración de incidente ");
        baseView3.add(subtitle1_view3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 30));

        sub1label1_view3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label1_view3.setForeground(new java.awt.Color(0, 0, 0));
        sub1label1_view3.setText("Descripción");
        baseView3.add(sub1label1_view3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        VIew3_DescripcionTextField.setForeground(new java.awt.Color(153, 153, 153));
        VIew3_DescripcionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VIew3_DescripcionTextField.setText(" Describa el incidente al entregar el activo... ");
        VIew3_DescripcionTextField.setRound(30);
        VIew3_DescripcionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIew3_DescripcionTextFieldActionPerformed(evt);
            }
        });
        baseView3.add(VIew3_DescripcionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 910, 200));

        view2_cancelbutton.setForeground(new java.awt.Color(255, 255, 255));
        view2_cancelbutton.setText("Cancelar");
        view2_cancelbutton.setBorderColor(new java.awt.Color(228, 91, 105));
        view2_cancelbutton.setBorderPainted(false);
        view2_cancelbutton.setColor(new java.awt.Color(228, 91, 105));
        view2_cancelbutton.setColorClick(new java.awt.Color(219, 45, 63));
        view2_cancelbutton.setColorOver(new java.awt.Color(227, 84, 99));
        view2_cancelbutton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        view2_cancelbutton.setRadius(30);
        view2_cancelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view2_cancelbuttonMouseClicked(evt);
            }
        });
        baseView3.add(view2_cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 130, 40));

        view3_finishbutton.setBackground(new java.awt.Color(80, 187, 223));
        view3_finishbutton.setForeground(new java.awt.Color(255, 255, 255));
        view3_finishbutton.setText("Finalizar");
        view3_finishbutton.setBorderPainted(false);
        view3_finishbutton.setColor(new java.awt.Color(80, 187, 223));
        view3_finishbutton.setColorOver(new java.awt.Color(64, 100, 216));
        view3_finishbutton.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        view3_finishbutton.setRadius(30);
        view3_finishbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view3_finishbuttonActionPerformed(evt);
            }
        });
        baseView3.add(view3_finishbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 130, 40));

        panelsubcontent_view3.add(baseView3, java.awt.BorderLayout.CENTER);

        add(panelsubcontent_view3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void VIew3_DescripcionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIew3_DescripcionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VIew3_DescripcionTextFieldActionPerformed

    private void view3_finishbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view3_finishbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view3_finishbuttonActionPerformed

    private void view2_cancelbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view2_cancelbuttonMouseClicked
        // Evento para regresar a tab4_view2
        panelsubcontent_view3.removeAll();
        panelsubcontent_view3.add(new Tab4_View2(),BorderLayout.CENTER);
        panelsubcontent_view3.revalidate();
        panelsubcontent_view3.repaint();
    }//GEN-LAST:event_view2_cancelbuttonMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.textfieldCustom.TextFieldCustom VIew3_DescripcionTextField;
    private javax.swing.JPanel baseView3;
    private javax.swing.JSeparator jSeparatorView3;
    private javax.swing.JLabel jlabeltitle_tab4view3;
    private javax.swing.JPanel panelsubcontent_view3;
    private javax.swing.JLabel sub1label1_view3;
    private javax.swing.JLabel subtitle1_view3;
    private com.customButton.CustomButtons view2_cancelbutton;
    private com.customButton.CustomButtons view3_finishbutton;
    // End of variables declaration//GEN-END:variables
}
