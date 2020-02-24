/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import javax.swing.*;

/**
 *
 * @author WALI COMPUTERS
 */
public class LlistTable extends JFrame {

    public LlistTable() {
        listTableui();
    }
    
    
    public void listTableui(){
        JPanel jPanel = new JPanel();
        add(jPanel);
        setSize(700, 700);
        
        jPanel.setBackground(new java.awt.Color(0, 204, 204));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel.setFont(new java.awt.Font("Calibri", 0, 11));
        final String[] header = {"iteration", "f(x)", "x", "accuracy"};
        

        /*JTable table = new JTable(ans, header);
        table.setEnabled(false);
        jPanel.add(new JScrollPane(table));
        setVisible(true);*/
               
    
}
    
}
