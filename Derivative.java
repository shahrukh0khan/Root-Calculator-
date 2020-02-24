 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author Shahrukh Kamal Khan - 000998261
 */
public class Derivative {
            
    public double derivQ(double x){
        
        return (-2*x);
    
}
    public double derivLg(double x){
        return (1/(x+1));
    }
    
    public double derivE(double x) {
        return (Math.exp(x)-3);
    }
    
}
