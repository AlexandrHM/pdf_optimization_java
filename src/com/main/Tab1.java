package com.main;

public class Tab1 extends javax.swing.JPanel {
    
    public Tab1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanelTab1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustom1 = new com.customTable.TableCustom();
        panelSDD1 = new com.customTable.PanelSDD();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basePanelTab1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Lista de PDF's de cartas responsivas ");

        tableCustom1.setBackground(new java.awt.Color(255, 255, 255));
        tableCustom1.setForeground(new java.awt.Color(255, 255, 255));
        tableCustom1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Carta", "Nombre", "Revisión", "ID Empleado", "Fecha Expedición"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustom1.setGridColor(new java.awt.Color(255, 255, 255));
        tableCustom1.setRowHeight(20);
        tableCustom1.setSelectionBackground(new java.awt.Color(80, 187, 223));
        tableCustom1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableCustom1);
        if (tableCustom1.getColumnModel().getColumnCount() > 0) {
            tableCustom1.getColumnModel().getColumn(0).setResizable(false);
            tableCustom1.getColumnModel().getColumn(1).setResizable(false);
            tableCustom1.getColumnModel().getColumn(2).setResizable(false);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(basePanelTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 630));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanelTab1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.customTable.PanelSDD panelSDD1;
    private com.customTable.TableCustom tableCustom1;
    // End of variables declaration//GEN-END:variables
}
