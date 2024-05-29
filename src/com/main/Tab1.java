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
      
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
