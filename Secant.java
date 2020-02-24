/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author WALI COMPUTERS
 */
public class Secant {
    Function f = new Function();
    
     public void secant(double x1, double x2, String fname) { 
             if (fname.equalsIgnoreCase("x-x^2")){
     
        double count = 0, xm, x0, c; 
        if (f.funcQ(x1) * f.funcQ(x2) < 0)  
        { 
            do { 
                  
                // calculate the intermediate 
                // value 
                x0 = (x1 * f.funcQ(x2) - x2 * f.funcQ(x1)) 
                            / (f.funcQ(x2) - f.funcQ(x1)); 
          
                // check if x0 is root of 
                // equation or not 
                c = f.funcQ(x1) * f.funcQ(x0); 
          
                // update the value of interval 
                x1 = x2; 
                x2 = x0; 
          
                // update number of iteration 
                count++; 
          
                // if x0 is the root of equation  
                // then break the loop 
                if (c == 0) 
                    break; 
                xm = (x1 * f.funcQ(x2) - x2 * f.funcQ(x1))  
                            / (f.funcQ(x2) - f.funcQ(x1)); 
                              
                // repeat the loop until the  
                // convergence  
            } while (Math.abs(xm - x0) >= 0.000001);  
                                                  
            System.out.println("Root of the" + 
                    " given equation=" + x0); 
                      
            System.out.println("No. of "
                      + "iterations = " + count); 
        }  
          
        else
            System.out.print("Can not find a"
              + " root in the given inteval"); 
    } 
   }
    
}
