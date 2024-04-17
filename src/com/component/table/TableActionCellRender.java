package com.component.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSeleted, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSeleted, hasFocus, row, column);
        PanelSDD action = new PanelSDD();
        if (isSeleted == false && row % 2 == 0) {
            action.setBackground(Color.WHITE);
        } else {
            action.setBackground(com.getBackground());
        }
        return action;
    }
    
}
