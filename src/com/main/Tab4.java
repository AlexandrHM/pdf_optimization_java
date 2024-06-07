package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.textfieldCustom.PlaceholderUtil;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Tab4 extends javax.swing.JPanel {
    public Tab4() {
        initComponents();
        jlabeltitle_tab4.putClientProperty("FlatLaf.styleClass", "h1");
        //Establece el tema
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        // Agregar Placeholders
        PlaceholderUtil.addPlaceholder(Container1TField1, "Ingrese el ID del empleado");
        PlaceholderUtil.addPlaceholder(Container1TField2, "Ingrese el nombre...");
        PlaceholderUtil.addPlaceholder(Container1TField3, "Ingrese el apellido...");
        PlaceholderUtil.addPlaceholder(Container1TField4, "correo@fragua.mx");
        PlaceholderUtil.addPlaceholder(Container1TField5, "Ingrese el departamento");
        PlaceholderUtil.addPlaceholder(Container2TField1, "Ingrese el modelo...");
        PlaceholderUtil.addPlaceholder(Container2TField2, "Ingrese el activo...");
        PlaceholderUtil.addPlaceholder(Container2TField3, "Etiqueta del equipo...");
        PlaceholderUtil.addPlaceholder(Container2TField4, "Serie de equipo...");
        PlaceholderUtil.addPlaceholder(Container2TField5, "Describa el equipo entregado");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSubContent = new javax.swing.JPanel();
        contentTab4 = new javax.swing.JPanel();
        jlabeltitle_tab4 = new javax.swing.JLabel();
        jSeparatorTab4 = new javax.swing.JSeparator();
        subtitle2 = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        sub1label2 = new javax.swing.JLabel();
        sub1label1 = new javax.swing.JLabel();
        sub1label3 = new javax.swing.JLabel();
        sub1label4 = new javax.swing.JLabel();
        sub1label5 = new javax.swing.JLabel();
        sub2label1 = new javax.swing.JLabel();
        sub2label2 = new javax.swing.JLabel();
        sub2label3 = new javax.swing.JLabel();
        sub2label4 = new javax.swing.JLabel();
        sub2label5 = new javax.swing.JLabel();
        Container1TField5 = new com.textfieldCustom.TextFieldCustom();
        Container1TField1 = new com.textfieldCustom.TextFieldCustom();
        Container1TField3 = new com.textfieldCustom.TextFieldCustom();
        Container1TField4 = new com.textfieldCustom.TextFieldCustom();
        Container1TField2 = new com.textfieldCustom.TextFieldCustom();
        Container2TField1 = new com.textfieldCustom.TextFieldCustom();
        Container2TField2 = new com.textfieldCustom.TextFieldCustom();
        Container2TField3 = new com.textfieldCustom.TextFieldCustom();
        Container2TField4 = new com.textfieldCustom.TextFieldCustom();
        Container2TField5 = new com.textfieldCustom.TextFieldCustom();
        customButtons1 = new com.customButton.CustomButtons();
        continueButton1 = new com.customButton.CustomButtons();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSubContent.setBackground(new java.awt.Color(255, 255, 255));
        panelSubContent.setPreferredSize(new java.awt.Dimension(1030, 650));
        panelSubContent.setLayout(new java.awt.BorderLayout());

        contentTab4.setBackground(new java.awt.Color(255, 255, 255));
        contentTab4.setPreferredSize(new java.awt.Dimension(1030, 650));
        contentTab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabeltitle_tab4.setText(" Formulario Carta Responsiva");
        contentTab4.add(jlabeltitle_tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 30));

        jSeparatorTab4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparatorTab4.setForeground(new java.awt.Color(0, 0, 0));
        contentTab4.add(jSeparatorTab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1000, 10));

        subtitle2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        subtitle2.setForeground(new java.awt.Color(0, 0, 0));
        subtitle2.setText(" Descripción de equipo asignado a usuario");
        contentTab4.add(subtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 290, 30));

        subtitle1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        subtitle1.setForeground(new java.awt.Color(0, 0, 0));
        subtitle1.setText(" Declaraciones (Datos del empleado)");
        contentTab4.add(subtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 240, 30));

        sub1label2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label2.setForeground(new java.awt.Color(0, 0, 0));
        sub1label2.setText("Nombre");
        contentTab4.add(sub1label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        sub1label1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label1.setForeground(new java.awt.Color(0, 0, 0));
        sub1label1.setText(" Numero de empleado ");
        contentTab4.add(sub1label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        sub1label3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label3.setForeground(new java.awt.Color(0, 0, 0));
        sub1label3.setText("Apellidos");
        contentTab4.add(sub1label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        sub1label4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label4.setForeground(new java.awt.Color(0, 0, 0));
        sub1label4.setText("Correo");
        contentTab4.add(sub1label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        sub1label5.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub1label5.setForeground(new java.awt.Color(0, 0, 0));
        sub1label5.setText("Departamento");
        contentTab4.add(sub1label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        sub2label1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub2label1.setForeground(new java.awt.Color(0, 0, 0));
        sub2label1.setText("Modelo");
        contentTab4.add(sub2label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        sub2label2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub2label2.setForeground(new java.awt.Color(0, 0, 0));
        sub2label2.setText("Activo");
        contentTab4.add(sub2label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        sub2label3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub2label3.setForeground(new java.awt.Color(0, 0, 0));
        sub2label3.setText("Etiqueta");
        contentTab4.add(sub2label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        sub2label4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub2label4.setForeground(new java.awt.Color(0, 0, 0));
        sub2label4.setText("Numero de serie");
        contentTab4.add(sub2label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        sub2label5.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        sub2label5.setForeground(new java.awt.Color(0, 0, 0));
        sub2label5.setText("Descripcion");
        contentTab4.add(sub2label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        Container1TField5.setForeground(new java.awt.Color(153, 153, 153));
        Container1TField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container1TField5.setText("Ingrese el departamento");
        Container1TField5.setRound(30);
        contentTab4.add(Container1TField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 220, 50));

        Container1TField1.setForeground(new java.awt.Color(153, 153, 153));
        Container1TField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container1TField1.setText("Ingrese el ID del empleado");
        Container1TField1.setToolTipText("");
        Container1TField1.setName(""); // NOI18N
        Container1TField1.setRound(30);
        Container1TField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Container1TField1ActionPerformed(evt);
            }
        });
        contentTab4.add(Container1TField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 220, 50));
        Container1TField1.getAccessibleContext().setAccessibleName("");

        Container1TField3.setForeground(new java.awt.Color(153, 153, 153));
        Container1TField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container1TField3.setText("Ingrese el apellido...");
        Container1TField3.setRound(30);
        contentTab4.add(Container1TField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 220, 50));

        Container1TField4.setForeground(new java.awt.Color(153, 153, 153));
        Container1TField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container1TField4.setText("correo@fragua.mx");
        Container1TField4.setRound(30);
        contentTab4.add(Container1TField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 220, 50));

        Container1TField2.setForeground(new java.awt.Color(153, 153, 153));
        Container1TField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container1TField2.setText("Ingrese el nombre...");
        Container1TField2.setRound(30);
        contentTab4.add(Container1TField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 220, 50));

        Container2TField1.setForeground(new java.awt.Color(153, 153, 153));
        Container2TField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container2TField1.setText("Ingrese el modelo...");
        Container2TField1.setRound(30);
        contentTab4.add(Container2TField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 220, 50));

        Container2TField2.setForeground(new java.awt.Color(153, 153, 153));
        Container2TField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container2TField2.setText("Ingrese el activo...");
        Container2TField2.setRound(30);
        contentTab4.add(Container2TField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 220, 50));

        Container2TField3.setForeground(new java.awt.Color(153, 153, 153));
        Container2TField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container2TField3.setText("Etiqueta del equipo...");
        Container2TField3.setRound(30);
        Container2TField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Container2TField3ActionPerformed(evt);
            }
        });
        contentTab4.add(Container2TField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 220, 50));

        Container2TField4.setForeground(new java.awt.Color(153, 153, 153));
        Container2TField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container2TField4.setText("Serie de equipo...");
        Container2TField4.setRound(30);
        contentTab4.add(Container2TField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 220, 50));

        Container2TField5.setForeground(new java.awt.Color(153, 153, 153));
        Container2TField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container2TField5.setText("Describa el equipo entregado");
        Container2TField5.setRound(30);
        contentTab4.add(Container2TField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 290, 180));

        customButtons1.setForeground(new java.awt.Color(255, 255, 255));
        customButtons1.setText("Limpiar");
        customButtons1.setBorderColor(new java.awt.Color(228, 91, 105));
        customButtons1.setBorderPainted(false);
        customButtons1.setColor(new java.awt.Color(228, 91, 105));
        customButtons1.setColorOver(new java.awt.Color(227, 84, 99));
        customButtons1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        customButtons1.setRadius(30);
        contentTab4.add(customButtons1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 130, 40));

        continueButton1.setForeground(new java.awt.Color(255, 255, 255));
        continueButton1.setText("Continuar");
        continueButton1.setBorderPainted(false);
        continueButton1.setColor(new java.awt.Color(80, 187, 223));
        continueButton1.setColorOver(new java.awt.Color(64, 100, 216));
        continueButton1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        continueButton1.setRadius(30);
        continueButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueButton1MouseClicked(evt);
            }
        });
        continueButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButton1ActionPerformed(evt);
            }
        });
        contentTab4.add(continueButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 130, 40));
        contentTab4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 950, 10));

        panelSubContent.add(contentTab4, java.awt.BorderLayout.CENTER);

        add(panelSubContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void Container2TField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Container2TField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Container2TField3ActionPerformed

    private void continueButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_continueButton1ActionPerformed

    private void Container1TField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Container1TField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Container1TField1ActionPerformed
    //Evento para mandar a llamar a la ventana Tab4_view2
    private void continueButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButton1MouseClicked
        panelSubContent.removeAll();
        panelSubContent.add(new Tab4_View2(), BorderLayout.CENTER);
        panelSubContent.revalidate();
        panelSubContent.repaint();
    }//GEN-LAST:event_continueButton1MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.textfieldCustom.TextFieldCustom Container1TField1;
    private com.textfieldCustom.TextFieldCustom Container1TField2;
    private com.textfieldCustom.TextFieldCustom Container1TField3;
    private com.textfieldCustom.TextFieldCustom Container1TField4;
    private com.textfieldCustom.TextFieldCustom Container1TField5;
    private com.textfieldCustom.TextFieldCustom Container2TField1;
    private com.textfieldCustom.TextFieldCustom Container2TField2;
    private com.textfieldCustom.TextFieldCustom Container2TField3;
    private com.textfieldCustom.TextFieldCustom Container2TField4;
    private com.textfieldCustom.TextFieldCustom Container2TField5;
    private javax.swing.JPanel contentTab4;
    private com.customButton.CustomButtons continueButton1;
    private com.customButton.CustomButtons customButtons1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorTab4;
    private javax.swing.JLabel jlabeltitle_tab4;
    private javax.swing.JPanel panelSubContent;
    private javax.swing.JLabel sub1label1;
    private javax.swing.JLabel sub1label2;
    private javax.swing.JLabel sub1label3;
    private javax.swing.JLabel sub1label4;
    private javax.swing.JLabel sub1label5;
    private javax.swing.JLabel sub2label1;
    private javax.swing.JLabel sub2label2;
    private javax.swing.JLabel sub2label3;
    private javax.swing.JLabel sub2label4;
    private javax.swing.JLabel sub2label5;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel subtitle2;
    // End of variables declaration//GEN-END:variables
}
