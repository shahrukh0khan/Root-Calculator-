/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import static coursework.Table.ans;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author Shahrukh Kamal Khan - 000998261
 */
public class BisectionMethod {
    
    Function f = new Function();
    //Table table = new Table();


    public void bisection(double xlow, double xup, int dp, String fname) {
        //double xlow, xup, 

        double xmid;
        double fxlow, fxup, fxmid;
        int count;
  
        String decimals = ".";
        for (int x=0; x < dp; x++ ){
            decimals = decimals + "0";
        }
        System.out.println(decimals);
        DecimalFormat df = new DecimalFormat(decimals);

        //int dp = 4;
        //xlow = 0;
        //xup = 3;
        if (fname.equalsIgnoreCase("x-x^2")) {
            //clrtable();
            count =0;
            //final double decimals = (Math.pow(10, -dp));
            //System.out.println(decimals);
            fxlow = f.funcQ(xlow);
            fxup = f.funcQ(xup);
            
            if (fxup * fxlow > 0.0D) {
                JOptionPane.showMessageDialog(null, "Root not in range");
                return;
            }
    Table table = new Table(4, new String[]{"No","f(x)","x","accuracy"});            

            // Check if middle point is root 
            while (Math.abs(xup - xlow) > 0.000001) {
                xmid = (xlow + xup) / 2;
                fxmid = f.funcQ(xmid);
                count = count + 1;
                System.out.println("Root is " + xmid + " fx is " + fxmid);
                System.out.println("xup is " + xup + " xlow is " + xlow);

                if (fxmid * fxlow <= 0.0D) {
                    xup = xmid;
                } else {
                    xlow = xmid;
                }
                
                ans[count - 1][0] = count;
                ans[count - 1][1] = fxmid;
                ans[count - 1][2] = xmid;
                ans[count - 1][3] = df.format(xmid);
               

            }
        } else if (fname.equalsIgnoreCase("ln(x+1)+1")) {
            //clrtable();
            count =0;            
            //final double decimals = (Math.pow(10, -dp));
            //System.out.println(decimals);
            fxlow = f.funcLg(xlow);
            fxup = f.funcLg(xup);

            if (fxup * fxlow > 0.0D) {
                JOptionPane.showMessageDialog(null, "Root not in range");
                return;
            }
    Table table = new Table(4, new String[]{"No","f(x)","x","accuracy"});
            // Check if middle point is root 
            while (Math.abs(xup - xlow) > 0.000001) {
                xmid = (xlow + xup) / 2;
                fxmid = f.funcLg(xmid);
                count = count + 1;

                System.out.println("Root is " + xmid + " fx is " + fxmid);
                System.out.println("xup is " + xup + " xlow is " + xlow);

                if (fxmid * fxlow <= 0.0D) {
                    xup = xmid;
                } else {
                    xlow = xmid;
                }
                ans[count - 1][0] = count;
                ans[count - 1][1] = fxmid;
                ans[count - 1][2] = xmid;
                ans[count - 1][3] = df.format(xmid);

            }
        } else if (fname.equalsIgnoreCase("e^x-3x")) {
           // clrtable();
            count =0;            
            //final double decimals = (Math.pow(10, -dp));
            //System.out.println(decimals);
            fxlow = f.funcE(xlow);
            fxup = f.funcE(xup);

            if (fxup * fxlow > 0.0D) {
                JOptionPane.showMessageDialog(null, "Root not in range");
                return;
            }

            // Check if middle point is root 
            while (Math.abs(xup - xlow) > 0.000001) {
                xmid = (xlow + xup) / 2;
                fxmid = f.funcE(xmid);
                count = count + 1;

                System.out.println("Root is " + xmid + " fx is " + fxmid);
                System.out.println("xup is " + xup + " xlow is " + xlow);

                if (fxmid * fxlow <= 0.0D) {
                    xup = xmid;
                } else {
                    xlow = xmid;
                }
                ans[count - 1][0] = count;
                ans[count - 1][1] = fxmid;
                ans[count - 1][2] = xmid;
                ans[count - 1][3] = df.format(xmid);


            }
        }
    //new Table().setVisible(true);


    }

    public void clrtable() {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = null;
            }
        }
    }
}


/*x-x^2
 ln(x+1)+1
 e^x-3x*/
