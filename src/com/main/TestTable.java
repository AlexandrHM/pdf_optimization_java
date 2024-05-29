/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main;

import com.component.table.PanelSDD;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author desan
 */
public class TestTable extends javax.swing.JPanel {

    /**
     * Creates new form testTable
     */
    public TestTable() {
        initComponents();

        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                    {"E001", "Juan Pérez", "C1234", "R01", "2022-03-15"},
                    {"E002", "María Rodríguez", "C5678", "R02", "2023-01-10"},
                    {"E003", "Carlos Gómez", "C9012", "R03", "2021-07-22"},
                    {"E004", "Ana Martínez", "C3456", "R04", "2022-11-05"},
                    {"E005", "Pedro Sánchez", "C7890", "R05", "2023-04-28"},
                    {"E006", "Laura Torres", "C2345", "R06", "2022-09-18"},
                    {"E007", "Javier Ramírez", "C6789", "R07", "2021-12-31"},
                    {"E008", "Sofía Flores", "C0123", "R08", "2023-02-14"},
                    {"E009", "David Hernández", "C4567", "R09", "2022-06-08"},
                    {"E010", "Marta García", "C8901", "R10", "2021-10-25"},
                    {"E011", "Alejandro López", "C2345", "R11", "2023-03-01"},
                    {"E012", "Gabriela Jiménez", "C6789", "R12", "2022-08-12"},
                    {"E013", "Miguel Díaz", "C0123", "R13", "2021-05-19"},
                    {"E014", "Lucía Morales", "C4567", "R14", "2022-12-27"},
                    {"E015", "Andrés Gutiérrez", "C8901", "R15", "2023-04-03"},
                    {"E016", "Isabel Álvarez", "C2345", "R16", "2022-07-09"},
                    {"E017", "Sergio Fernández", "C6789", "R17", "2021-11-23"},
                    {"E018", "Valentina Muñoz", "C0123", "R18", "2023-01-06"},
                    {"E019", "Diego Rojas", "C4567", "R19", "2022-10-31"},
                    {"E020", "Camila Castillo", "C8901", "R20", "2021-09-16"}, // Otros datos...
                },
                new String[]{
                    "ID_Empleado",
                     "Nombre", "ID_Carta", "Revisión", "Fecha de expedición"
                }
        ) {
            @Override
            public boolean isCellEditable(int row, int column
            ) {
                return false; // Todas las celdas no son editables
            }
        };

        tableHome.setModel(model);

        PanelSDD panelSDD = new PanelSDD();
        jPanelButtons.add(panelSDD, BorderLayout.CENTER);
        jPanelButtons.setBackground(Color.WHITE);
        jPanelButtons.revalidate();
        jPanelButtons.repaint();

        //Establece el formato de texto
        Title.putClientProperty("FlatLaf.styleClass", "h1");

        //Establece el tema
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHome = new javax.swing.JTable();
        jPanelButtons = new javax.swing.JPanel();

        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("Lista de PDF´S");

        tableHome.setForeground(new java.awt.Color(0, 0, 0));
        tableHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Empleado", "Nombre", "ID_Carta", "Revisión", "Fecha Expedición"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHome.setCellEditor(null);
        tableHome.setRowHeight(40);
        tableHome.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableHome.setShowHorizontalLines(true);
        tableHome.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tableHome);

        jPanelButtons.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Title)
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableHome;
    // End of variables declaration//GEN-END:variables
}