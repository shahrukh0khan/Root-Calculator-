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
public class Function {

    public Function() {
    }


    public double funcQ(double x) {
        return (x - (x * x));
    }

    public double funcLg(double x) {
        return Math.log(x + 1) + 1;
    }

    public double funcE(double x) {
        return (Math.exp(x) - (3 * x));
    }
    
}
/*x-x^2
ln(x+1)+1
e^x-3x*/