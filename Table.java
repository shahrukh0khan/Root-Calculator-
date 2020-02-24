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
public class Table extends JFrame {

    public static Object[][] ans;
    public static String[] header;

    public Table() {
        tableui();
    }

    public Table(int columnsize, String[] columnname, NumLinkedList list, int listsize) {
        ans = new Object [100][columnsize];
        lListtoArray(list, columnsize);
        //ans = new Object[100][columnsize];
        header = columnname;
        tableui();
    }

    public Table(int columnsize, String[] columnname) {
        ans = new Object[100][columnsize];
        //arraytoArray(array, columnsize);
        header = columnname;
        tableui();
    }

    public void lListtoArray(NumLinkedList x, int columnsize) {
        //public Object[][] temparray = new temparray[][];
        NumNode temp;
        if (x.isEmpty()) {
            System.out.println("List is empty");
        } else {
            
            temp = x.head;
            temp = temp.getNext();
            
            while (temp != null) {
                for (int i = 0; i < x.listSize/columnsize; i ++) {
                    for (int j = 0; j < columnsize; j++) {
                        ans[i][j] = temp.getElement();
                        temp = temp.getNext();
                    }

                }

            }

        }
    }
    
    /*public void arraytoArray(double [][] x, int columnsize ){
        for (int i = 0; i < x.length/columnsize; i ++) {
                    for (int j = 0; j < columnsize; j++) {
                        ans[i][j] = x[i][j];
                        
                    }
        
    }
    }*/
   

    public void tableui() {
        JPanel jPanel = new JPanel();
        add(jPanel);
        setSize(700, 700);

        jPanel.setBackground(new java.awt.Color(0, 204, 204));
        jPanel.setFont(new java.awt.Font("Calibri", 0, 11));

        JTable table = new JTable(ans, header);
        table.setEnabled(false);
        jPanel.add(new JScrollPane(table));
 
        

        setVisible(true);

    }

}
