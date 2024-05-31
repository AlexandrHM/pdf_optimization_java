package com.main;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.UIManager;

public class Tab3 extends javax.swing.JPanel {
    public Tab3() {
        initComponents();
        //
        jlabeltitle_tab3.putClientProperty("FlatLaf.styleClass", "h1");
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

        jPanel1 = new javax.swing.JPanel();
        jlabeltitle_tab3 = new javax.swing.JLabel();
        jSeparatorTab3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTab3 = new com.customTable.TableCustom();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabeltitle_tab3.setText("Lista de empleados ");
        jPanel1.add(jlabeltitle_tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 410, 30));

        jSeparatorTab3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparatorTab3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparatorTab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1000, 10));

        tableTab3.setForeground(new java.awt.Color(51, 51, 51));
        tableTab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "Apellidos", "Departamento", "Correo electronico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTab3.setGridColor(new java.awt.Color(90, 94, 96));
        tableTab3.setMinimumSize(new java.awt.Dimension(75, 300));
        tableTab3.setSelectionBackground(new java.awt.Color(80, 187, 223));
        tableTab3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableTab3.setShowHorizontalLines(false);
        tableTab3.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableTab3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1000, 500));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 630));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorTab3;
    private javax.swing.JLabel jlabeltitle_tab3;
    private com.customTable.TableCustom tableTab3;
    // End of variables declaration//GEN-END:variables
}
