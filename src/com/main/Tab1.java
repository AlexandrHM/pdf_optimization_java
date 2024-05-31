package com.main;


import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import com.component.table.PanelSDD;
import com.component.table.TableActionCellEditor;
import com.component.table.TableActionCellRender;
import com.component.table.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class Tab1 extends javax.swing.JPanel {
    
    public Tab1() {
        initComponents();
        //Establece estilo del titulo (jlabel)
        jlabeltitle_tab1.putClientProperty("FlatLaf.styleClass", "h1");
        //Establece el tema
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
      
      String[] columnNames = {"Nombre", "ID_Carta", "Revision", "ID_Empleado", "Fecha de expedición"};
            Object[][] data = {
                {"Juan Perez", 1001, "Rev1", 501, "2023-01-15"},
                {"Maria Gomez", 1002, "Rev2", 502, "2023-02-10"},
                {"Carlos Ruiz", 1003, "Rev3", 503, "2023-03-05"},
                {"Ana Lopez", 1004, "Rev1", 504, "2023-04-20"},
                {"Luis Martinez", 1005, "Rev2", 505, "2023-05-11"},
                {"Laura Fernández", 1006, "Rev3", 506, "2023-06-13"},
                {"Pedro Sánchez", 1007, "Rev1", 507, "2023-07-22"},
                {"Marta Díaz", 1008, "Rev2", 508, "2023-08-30"},
                {"David Torres", 1009, "Rev3", 509, "2023-09-18"},
                {"Sofía García", 1010, "Rev1", 510, "2023-10-29"}
            };
            DefaultTableModel model = new DefaultTableModel(data, columnNames);

           tableTab1.setModel(model);

       PanelSDD panelSDD = new PanelSDD();
       JPanelButtons.add(panelSDD, BorderLayout.CENTER);
       JPanelButtons.setBackground(Color.WHITE);
       JPanelButtons.revalidate();
       JPanelButtons.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        basePanelTab1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jlabeltitle_tab1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustom1 = new com.customTable.TableCustom();
        panelSDD1 = new com.customTable.PanelSDD();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basePanelTab1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jlabeltitle_tab1.setBackground(new java.awt.Color(51, 51, 51));
        jlabeltitle_tab1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jlabeltitle_tab1.setForeground(new java.awt.Color(51, 51, 51));
        jlabeltitle_tab1.setText("Lista de PDF's de cartas responsivas ");

        tableCustom1.setForeground(new java.awt.Color(51, 51, 51));
        tableCustom1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tableCustom1.setGridColor(new java.awt.Color(90, 94, 96));
        tableCustom1.setRowHeight(30);
        tableCustom1.setSelectionBackground(new java.awt.Color(80, 187, 223));
        tableCustom1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableCustom1.setShowGrid(false);
        tableCustom1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableCustom1);
        if (tableCustom1.getColumnModel().getColumnCount() > 0) {
            tableCustom1.getColumnModel().getColumn(3).setResizable(false);
            tableCustom1.getColumnModel().getColumn(4).setResizable(false);
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
    private com.customTable.TableCustom tableCustom1;
    // End of variables declaration//GEN-END:variables
}
