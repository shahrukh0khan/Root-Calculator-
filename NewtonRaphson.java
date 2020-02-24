/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

//import static coursework.LListTable.llans;
import static coursework.NumLinkedList.printList;
import java.text.DecimalFormat;

/**
 *
 * @author Shahrukh Kamal Khan = 000998261
 */
public class NewtonRaphson {
Function f = new Function();
Derivative d = new Derivative();

NumLinkedList llNum = new NumLinkedList();
 
    public void newtonR(double x0, int dp, String fname) {
    //new Table().setVisible(true);
   
        double fx, dx, fdx;
        int count;
        String decimals = ".";
        for (int x = 0; x < dp; x++) {
            decimals = decimals + "0";
        }
        System.out.println(decimals);
        DecimalFormat df = new DecimalFormat(decimals);

        if (fname.equalsIgnoreCase("x-x^2")){
            //clrtable();
            count = 0;
            fx = f.funcQ(x0);
            dx = d.derivQ(x0);
            fdx = fx/dx;  
            llNum.head.setElement(0.0);
 
            
        while (Math.abs(fdx) >= 0.000001) 
        { 
            count++;
            fx = f.funcQ(x0);
            dx = d.derivQ(x0);
            fdx = fx/dx;      
            x0 = x0 - fdx; 
            
            llNum.addLast((double) count);
            llNum.addLast(fx);
            llNum.addLast(x0);
            llNum.addLast(Double.parseDouble(df.format(x0)));
            llNum.addLast(fdx);

        }
        }
        else if (fname.equalsIgnoreCase("ln(x+1)+1")){
            //clrtable();
            count = 0;
            fx = f.funcLg(x0);
            dx = d.derivLg(x0);
            fdx = fx/dx;  
            llNum.head.setElement(0.0);
 
            
        while (Math.abs(fdx) >= 0.000001) 
        { 
            count++;
            fx = f.funcLg(x0);
            dx = d.derivLg(x0);
            fdx = fx/dx;      
            x0 = x0 - fdx; 
            
            llNum.addLast((double) count);
            llNum.addLast(fx);
            llNum.addLast(x0);
            llNum.addLast(Double.parseDouble(df.format(x0)));
            llNum.addLast(fdx);

        } 
        } 
        else if (fname.equalsIgnoreCase("e^x-3x")){
            //clrtable();
            count = 0;
            fx = f.funcE(x0);
            dx = d.derivE(x0);
            fdx = fx/dx;  
            llNum.head.setElement(0.0);
 
            
        while (Math.abs(fdx) >= 0.000001) 
        { 
            count++;
            fx = f.funcE(x0);
            dx = d.derivE(x0);
            fdx = fx/dx;      
            x0 = x0 - fdx; 
            
            llNum.addLast((double) count);
            llNum.addLast(fx);
            llNum.addLast(x0);
            llNum.addLast(Double.parseDouble(df.format(x0)));
            llNum.addLast(fdx);

        }
        }
      
        System.out.print("The value of the"
                + " root is : " 
                + x0);
        printList(llNum);
        System.out.println(llNum.listSize);
        Table table = new Table(5, new String[]{"No","f(x)","x","accuracy","f(x)/dx"}, llNum, llNum.listSize);
        } 
//            lldata.add();
            
        }



