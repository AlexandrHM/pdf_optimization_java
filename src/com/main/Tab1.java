package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;

public class Tab1 extends javax.swing.JPanel {
    
    public Tab1() {
        initComponents();
        //
        jlabeltitle_tab1.putClientProperty("FlatLaf.styleClass", "h1");
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

        basePanelTab1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jlabeltitle_tab1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTab1 = new com.customTable.TableCustom();
        panelSDD1 = new com.customTable.PanelSDD();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basePanelTab1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jlabeltitle_tab1.setBackground(new java.awt.Color(51, 51, 51));
        jlabeltitle_tab1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jlabeltitle_tab1.setForeground(new java.awt.Color(51, 51, 51));
        jlabeltitle_tab1.setText("Lista de PDF's de cartas responsivas ");

        tableTab1.setForeground(new java.awt.Color(51, 51, 51));
        tableTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Carta", "Nombre", "Revisión", "ID Empleado", "Fecha Expedición"
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
        tableTab1.setGridColor(new java.awt.Color(90, 94, 96));
        tableTab1.setRowHeight(30);
        tableTab1.setSelectionBackground(new java.awt.Color(80, 187, 223));
        tableTab1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableTab1.setShowGrid(false);
        tableTab1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableTab1);
        if (tableTab1.getColumnModel().getColumnCount() > 0) {
            tableTab1.getColumnModel().getColumn(3).setResizable(false);
            tableTab1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout basePanelTab1Layout = new javax.swing.GroupLayout(basePanelTab1);
        basePanelTab1.setLayout(basePanelTab1Layout);
        basePanelTab1Layout.setHorizontalGroup(
            basePanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelTab1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(basePanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabeltitle_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basePanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelSDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(basePanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        basePanelTab1Layout.setVerticalGroup(
            basePanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabeltitle_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        add(basePanelTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 630));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanelTab1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabeltitle_tab1;
    private com.customTable.PanelSDD panelSDD1;
    private com.customTable.TableCustom tableTab1;
    // End of variables declaration//GEN-END:variables
}
