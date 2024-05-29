package com.main;

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

        tableActionCellEditor1 = new com.component.table.TableActionCellEditor();
        basePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTab1 = new com.component.table.TableCustom();
        jSeparator1 = new javax.swing.JSeparator();
        JPanelButtons = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout());

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Lista de PDF’s");

        tablepanel.setBackground(new java.awt.Color(255, 255, 204));
        tablepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ID_Carta", "Revisión", "ID_Empleado", "Fecha Expedición", "Actions"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Short.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTab1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableTab1.setSelectionBackground(new java.awt.Color(0, 156, 210));
        jScrollPane1.setViewportView(tableTab1);
        if (tableTab1.getColumnModel().getColumnCount() > 0) {
            tableTab1.getColumnModel().getColumn(0).setResizable(false);
            tableTab1.getColumnModel().getColumn(1).setResizable(false);
            tableTab1.getColumnModel().getColumn(1).setPreferredWidth(30);
            tableTab1.getColumnModel().getColumn(2).setResizable(false);
            tableTab1.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableTab1.getColumnModel().getColumn(3).setResizable(false);
            tableTab1.getColumnModel().getColumn(4).setResizable(false);
            tableTab1.getColumnModel().getColumn(4).setPreferredWidth(40);
            tableTab1.getColumnModel().getColumn(5).setResizable(false);
            tableTab1.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        tablepanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 540));

        JPanelButtons.setForeground(new java.awt.Color(255, 255, 255));
        JPanelButtons.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tablepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(basePanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(278, 278, 278)
                                .addComponent(JPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addComponent(JPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tablepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        add(basePanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelButtons;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.component.table.TableActionCellEditor tableActionCellEditor1;
    private com.component.table.TableCustom tableTab1;
    private javax.swing.JPanel tablepanel;
    // End of variables declaration//GEN-END:variables
}
