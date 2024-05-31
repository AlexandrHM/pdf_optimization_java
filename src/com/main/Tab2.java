package com.main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;

public class Tab2 extends javax.swing.JPanel {
    
    public Tab2() {
        initComponents();
        jlabeltitle_tab2.putClientProperty("FlatLaf.styleClass", "h1");
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

        Tickets = new javax.swing.JPanel();
        jlabeltitle_tab2 = new javax.swing.JLabel();
        jSeparatorTab2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTab2 = new com.customTable.TableCustom();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tickets.setBackground(new java.awt.Color(255, 255, 255));
        Tickets.setForeground(new java.awt.Color(255, 255, 255));
        Tickets.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabeltitle_tab2.setBackground(new java.awt.Color(51, 51, 51));
        jlabeltitle_tab2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jlabeltitle_tab2.setForeground(new java.awt.Color(51, 51, 51));
        jlabeltitle_tab2.setText(" Reportes de cartas responsivas con incidencias ");
        Tickets.add(jlabeltitle_tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 730, 30));

        jSeparatorTab2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparatorTab2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorTab2.setPreferredSize(new java.awt.Dimension(0, 3));
        Tickets.add(jSeparatorTab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1000, 10));

        tableTab2.setForeground(new java.awt.Color(51, 51, 51));
        tableTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Carta", "Nombre", "Revision", "ID Admin", "ID Empleado", "Fecha incidente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTab2.setGridColor(new java.awt.Color(90, 94, 96));
        tableTab2.setMinimumSize(new java.awt.Dimension(75, 300));
        tableTab2.setSelectionBackground(new java.awt.Color(80, 187, 223));
        tableTab2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableTab2.setShowHorizontalLines(false);
        tableTab2.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableTab2);

        Tickets.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1010, 500));

        add(Tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 630));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tickets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorTab2;
    private javax.swing.JLabel jlabeltitle_tab2;
    private com.customTable.TableCustom tableTab2;
    // End of variables declaration//GEN-END:variables
}
